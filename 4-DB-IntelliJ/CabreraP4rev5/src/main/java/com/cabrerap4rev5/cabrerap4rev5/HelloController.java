package com.cabrerap4rev5.cabrerap4rev5;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController extends JFrame implements ActionListener,MouseListener, Initializable {
    @FXML
    private Label welcomeText;
    String ss;
    FileWriter fw;
    // public HelloController(data paper) {
    public data rps = new data();

    //public void initialize(){
    //   rps=new data();
    //}

    //}

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    private TextArea Summary =new TextArea("");

    @FXML
    private RadioButton j1;

    @FXML
    private RadioButton j2;

    @FXML
    private RadioButton j3;

    @FXML
    private RadioButton j4;

    @FXML
    private RadioButton j5;

    @FXML
    private RadioButton j6;

    @FXML
    private CheckBox c1;

    @FXML
    private CheckBox c2 ;

    @FXML
    private ToggleGroup buttongroup1;

    @FXML
    private ToggleGroup buttongroup2;
    @FXML
    private CheckBox c3;


    @FXML
    private ComboBox dropdown;
    ObservableList<String> list = FXCollections.observableArrayList("these", "are","my","choices");
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dropdown.setValue("these");
        dropdown.setItems(list);
        c2.setSelected(true);
    }
    //@FXML
    //private Label status;

    String test;
    String[] myStrings ={"these","are","my","choices"};

    @FXML
    private Slider slider;

    @FXML
    private Text status;

    @FXML
    public void updateText(javafx.scene.input.MouseEvent mouseEvent) {
        status.setText(String.valueOf(slider.getValue()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @FXML
    private Button summary;

    /*@FXML
    public void saveclicked(MouseEvent event) {
        JFileChooser fileChooser = new JFileChooser("C:\\Users\\sc420f\\Documents\\LTP\\Java\\");
        int val = fileChooser.showSaveDialog(this);	//Show save file dialog.int returnVal =
        File file = new File(fileChooser.getSelectedFile().toString());
        fileChooser.setCurrentDirectory(file);
        String name = file.getName();
        if(!file.exists())
            try{
                file.createNewFile();
            }
            catch(IOException z){
                System.out.println(z);
            }
        if(val==JFileChooser.APPROVE_OPTION){
            try{
                fw = new FileWriter(file.getAbsolutePath().toString());
                fw.write(ss);
                fw.flush();
                fw.close();
            }
            catch(Exception s){
                System.out.println(s);
            }
        }
    } */
    @FXML
    private Button savebutton;

    public void saveclicked(javafx.scene.input.MouseEvent mouseEvent) {
        try{
            FileChooser fileChooser = new FileChooser();
            File file = fileChooser.showSaveDialog(null);
            if(file!=null){
                rps.writeFile(Summary, file);
            }}
        catch(Exception e){
            System.out.println(e);
        }

        //FileChooser fileChooser = new FileChooser();
        //File file = fileChooser.showSaveDialog(null);	//Show save file dialog.
        //if(file !=null){
        //   saveTextToFile(ss,file);
        //}

    }


    @FXML
    public void change1(ActionEvent event) {

    }



    @FXML
    private TextField textfield1;

    @FXML
    private TextField textfield2;
    public void summaryclicked(javafx.scene.input.MouseEvent mouseEvent) {
        //System.out.println(slider.getValue());
        Summary.setText(null);
        Summary.appendText ("value of the slider is: "+slider.getValue()+"\n");
        if(c1.isSelected()){
            Summary.appendText("no c++ here"+"\n");
        }
        if(c2.isSelected()){
            Summary.appendText("java is accurate"+"\n");
        }
        if(c3.isSelected()){
            Summary.appendText("no rust here"+"\n");
        }
        if(textfield1!=null){
            Summary.appendText("1st text:: "+ textfield1.getText()+"\n");
        }
        if(textfield2!=null){
            Summary.appendText("2nd text:: "+ textfield2.getText()+"\n");
        }
        if(dropdown!=null){
            Summary.appendText("dropdown is:: "+dropdown.getValue()+"\n");
        }
        if(j1.isSelected()){
            Summary.appendText("1st Choice:: "+j1.getText()+"\n");
        }
        if(j2.isSelected()){
            Summary.appendText("1st Choice:: "+j2.getText()+"\n");
        }
        if(j3.isSelected()){
            Summary.appendText("1st Choice:: "+j3.getText()+"\n");
        }
        if(j4.isSelected()){
            Summary.appendText("1st Choice:: "+j4.getText()+"\n");
        }
        if(j5.isSelected()){
            Summary.appendText("1st Choice:: "+j5.getText()+"\n");
        }
        if(j6.isSelected()){
            Summary.appendText("1st Choice:: "+j6.getText()+"\n");
        }
        ss = Summary.getText();
    }

    public void saveTextToFile(String content, File file) {
        try {
            PrintWriter writer;
            writer = new PrintWriter(file);
            writer.println(content);
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


    public void change1(javafx.event.ActionEvent actionEvent) {
    }
}