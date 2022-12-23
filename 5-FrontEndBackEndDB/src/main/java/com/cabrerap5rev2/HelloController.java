package com.cabrerap5rev2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.control.cell.TextFieldTreeCell;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.util.StringConverter;
import javafx.util.converter.IntegerStringConverter;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.scene.control.TextField; //hard required
import static javafx.scene.control.cell.TextFieldTableCell.*;

public class HelloController implements Initializable {
    Connection connection = null;
    public static int num = 0;public static int num2;public static int num3;public static String s1;public static String s2;
    @FXML private TextField keytfield;@FXML private TextField uniqtfield;@FXML private TextField yeartfield;
    @FXML private TextField maketfield;@FXML private TextField modeltfield;
    @FXML private Button createTable;

    @FXML private Label welcomeText;
    @FXML private Button populatedb;
    @FXML private TableView<car> table;
    @FXML private TableColumn<car, Integer> key;
    @FXML private TableColumn<car, Integer> uniq;
    @FXML private TableColumn<car, Integer> year;
    @FXML private TableColumn<car, String> make;
    @FXML private TableColumn<car, String> model;
    @FXML private Tooltip createtabletooltip;@FXML private Tooltip mockdbtooltip;@FXML private Tooltip inserttooltip;@FXML private Tooltip populatedbtooltip;@FXML private Tooltip enteridtooltip;@FXML private Tooltip deleteselectedrowtooltip;@FXML private Tooltip cleardbtooltip;@FXML private Tooltip droptabletooltip;

    static ObservableList<car> observableList = FXCollections.observableArrayList();
    public static ObservableList<car> getCars(){
        return observableList;
    }

    //int key, int uniqueid, int year, String make, String model;
    @Override //associates data types with columns in the table
    public void initialize(URL location, ResourceBundle resources) {
        DBManager connectnow = new DBManager();
        Connection connection = connectnow.getConnect();
        //DBManager.createTable(observableList);
        key.setCellValueFactory(new PropertyValueFactory<car, Integer>("key"));
        uniq.setCellValueFactory(new PropertyValueFactory<car, Integer>("uniq"));
        year.setCellValueFactory(new PropertyValueFactory<car, Integer>("year"));
        make.setCellValueFactory(new PropertyValueFactory<car, String>("make"));
        model.setCellValueFactory(new PropertyValueFactory<car, String>("model"));
        table.setEditable(true);
        key.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter())); //this and below allows editing on the fly
        uniq.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        year.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        make.setCellFactory(TextFieldTableCell.forTableColumn());
        model.setCellFactory(TextFieldTableCell.forTableColumn());
        table.getSelectionModel().setSelectionMode(SelectionMode.SINGLE); //editing one cell at a time (if you want)
        table.getSelectionModel().setCellSelectionEnabled(true);
        //table.setItems(observableList);

    }
    @FXML private Button insert;
    @FXML public void keylisten(ActionEvent event) {num = Integer.parseInt(keytfield.getText());}

    //below is the Insert (Button) method
    @FXML void insertonclick(MouseEvent event) {//connection= DBManager.getConnect();
        System.out.println("lastkey::"+DBManager.getLastKey());
        if (keytfield.getText().isEmpty() || uniqtfield.getText().isEmpty() || yeartfield.getText().isEmpty() ||maketfield.getText().isEmpty()||modeltfield.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"fields can't be left empty");
            return;
        }
        //num = Integer.parseInt(keytfield.getText());
        num2 = Integer.parseInt(uniqtfield.getText());
        num3 = Integer.parseInt(yeartfield.getText());
        s1 = maketfield.getText();
        s2 = modeltfield.getText();
        num = DBManager.getLastKey()+1; //this is set to zero if there's no table
        if(DBManager.getLastKey()==0) {//if there's no table set num to 1
        num =1;}
        else if(Integer.parseInt(keytfield.getText()) != num ){//if there is a table and key field  doesn't equal sequential give seq error
            System.out.println("Key must be sequential");
            JOptionPane.showMessageDialog(null,"Key must be sequential");
        }else{num = DBManager.getLastKey() +1;
        }
        observableList=DBManager.insert(num, num2, num3, s1, s2);
        table.setItems(observableList);}
    @FXML void populatedb(ActionEvent event) {table.setItems(observableList);}
    @FXML private void createTable(MouseEvent event) {observableList=DBManager.createTable();table.setItems(observableList);}
    @FXML void makelisten(ActionEvent event) {s1 = maketfield.getText();}

    @FXML void modellisten(ActionEvent event) {s2 = modeltfield.getText();}

    @FXML void uniqlisten(ActionEvent event) {num2 = Integer.parseInt(uniqtfield.getText());}

    @FXML void yearlisten(ActionEvent event) {num3 = Integer.parseInt(yeartfield.getText());}

    @FXML public void onEdit(TableColumn.CellEditEvent<car, Integer> carIntegerCellEditEvent) { //key
        car newCar =table.getSelectionModel().getSelectedItem();
        newCar.setKey(carIntegerCellEditEvent.getNewValue());
    }

    @FXML public void onEditUniq(TableColumn.CellEditEvent<car, Integer> carIntegerCellEditEvent) {
        car newCar =table.getSelectionModel().getSelectedItem();
        newCar.setUniq(carIntegerCellEditEvent.getNewValue());
    }
    @FXML public void onEditYear(TableColumn.CellEditEvent<car, Integer> carIntegerCellEditEvent) {
        car newCar =table.getSelectionModel().getSelectedItem();
        newCar.setYear(carIntegerCellEditEvent.getNewValue());
    }
    @FXML public void onEditMake(TableColumn.CellEditEvent<car, String> carStringCellEditEvent) {
        car newCar =table.getSelectionModel().getSelectedItem();
        newCar.setMake(carStringCellEditEvent.getNewValue());
    }
    @FXML public void onEditModel(TableColumn.CellEditEvent<car, String> carStringCellEditEvent) {
        car newCar =table.getSelectionModel().getSelectedItem();
        newCar.setModel(carStringCellEditEvent.getNewValue());
    }

    //below is the Edit (Button) method
    @FXML public void insertedit(MouseEvent mouseEvent) {
        observableList.clear();
        observableList = DBManager.editRecord(Integer.parseInt(keytfield.getText()),Integer.parseInt(uniqtfield.getText()),Integer.parseInt(yeartfield.getText()),maketfield.getText(),modeltfield.getText());
        table.setItems(observableList);
    }
    @FXML void search(KeyEvent event) {}
    // this is the search/filter stack
    @FXML void keylisten(KeyEvent event) {
        //wrap observableList in a filtered list
        FilteredList<car> filteredData = new FilteredList<>(observableList, b -> true);
        //set filter predicate whenever the filter changes
        keytfield.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(car -> {
                //if filter text is empty display all data
                if(newValue == null || newValue.isEmpty()){
                    return true;
                }
                //case insensitive
                //String lowerCaseFilter = newValue.toLowerCase();
                //String t = String.valueOf(car.getKey());
                int t = car.getKey();
                int z = Integer.parseInt(newValue);
                //if(t.indexOf(lowerCaseFilter) != -1){
                if(z == t){
                    return true;
                }
                else
                    return false;});});//wrap the filtered list in a sorted list
        SortedList<car> sortedData = new SortedList<>(filteredData);
        //bind the sorted result with table view (otherwise the sort will have no effect)
        sortedData.comparatorProperty().bind(table.comparatorProperty());
        //apply data to the table
        table.setItems(sortedData);
        // ###########
        // need to be able to find the last value in the key column
        ///###########
        }
    @FXML public void deleteRow(MouseEvent mouseEvent) {table.getItems().removeAll(table.getSelectionModel().getSelectedItem());}
    //for testing
    @FXML public void setupDB(MouseEvent mouseEvent) {//observableList.clear();//connection=DBManager.getConnect();
        observableList=DBManager.setupDB(); //was passing connection
        table.setItems(observableList);}
    //testing
   // @FXML public void getLastKey(MouseEvent mouseEvent) {//DBManager.getConnect();// DBManager.getLastKey(connection);//}
    public void cleardb(MouseEvent mouseEvent) {DBManager.clearDB();observableList.clear();table.setItems(observableList);}

    public void dropTable(MouseEvent mouseEvent) {
        observableList=DBManager.dropTable();
        table.setItems(observableList);
    }

    public void clearTextfields(MouseEvent mouseEvent) {
        keytfield.setText("");
        uniqtfield.setText("");
        yeartfield.setText("");
        maketfield.setText("");
        modeltfield.setText("");
    }
}