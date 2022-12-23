package com.cabrerap5rev2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBManager {
    static String sqlCon = "jdbc:sqlite:CabreraRP5DB.db";
    static Connection connection = null;
    static Statement statement = null;
    static int num1;
    static ObservableList<car> observableList = FXCollections.observableArrayList();
    static ObservableList<car> blankList = FXCollections.observableArrayList();
    //checks if table exists creates it if it doesn't , passes instantiated connection
    public static Connection getConnect(){
        try {
            connection = DriverManager.getConnection(sqlCon);
            System.out.println("Connection to database established.");
        } catch (Exception e) {
            e.printStackTrace();
            // throw new RuntimeException(e);
        } //check if db exits create template if it doesn't
        String sqlCreateDB = "CREATE TABLE IF NOT EXISTS Cars (\n"
                + " key INTEGER PRIMARY KEY, \n"
                + " uniq INTEGER, \n"  //spelling out unique forces a syntax error , this took way too long to find
                + " year INTEGER,\n"
                + " make STRING NOT NULL,\n"
                + " model TEXT NOT NULL\n"
                + ");";
        try{
            statement = connection.createStatement();
            statement.executeUpdate(sqlCreateDB);
            System.out.println("DB created.");
            statement.close();
        }catch (Exception e){
            System.out.println(e.getClass() + " " + e.getMessage());
        }
        return connection;
    }

    //SELECT key,uniq,year,make,model FROM car  #to return full table from db
    //createTable is passed the observablelist, grabs all data from cars db,
    // creating the table in fxml is done in the controller via table.set method with in the createTable HC method
    //this does not affect the db
    public static ObservableList createTable(){
        observableList.clear();
        //connection= DBManager.getConnect();
        String carview = "SELECT key,uniq,year,make,model FROM Cars";
        try{
            Statement statement = connection.createStatement();
            ResultSet queryOut = statement.executeQuery(carview);
            while (queryOut.next()){
                Integer num1 = queryOut.getInt("key");
                Integer num2 = queryOut.getInt("uniq");
                Integer num3 = queryOut.getInt("year");
                String make = queryOut.getString("make");
                String model = queryOut.getString("model");
                observableList.add(new car(num1,num2,num3,make,model));
            }
        }catch(Exception e){//Logger.getLogger(HelloController.class.getName()).log(Level.SEVERE, null, e);e.printStackTrace();
        }
        return observableList;
    }
    public static void createDB(){

        try {
            connection = DriverManager.getConnection(sqlCon);
            System.out.println("Connection to database established.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static int getLastKey(){
        //connection = DBManager.getConnect();
        String carview = "SELECT MAX(key) from Cars";
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(carview);
            if(rs.next()){
                num1 = rs.getInt(1);
            }
        } catch (Exception e) {//throw new RuntimeException(e);
        }
        //System.out.println(num1);
        return num1;
    }

    public static ObservableList<car> insert(int key, int uniq, int year, String make, String model){
        //connection=getConnect();
        String s = "INSERT INTO Cars VALUES ("+key +", "+uniq+", "+year+", '"+make+"', '"+model+ "')";
        observableList.add(new car(key, uniq, year, make, model));
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(s);
            System.out.println(s);
            statement.close();
        }
        catch (Exception e) {}
        /*try {
            connection.close();
        } catch (Exception e){//System.out.println(e.getClass() + " " + e.getMessage());
        }*/
        return observableList;
        }

    public static void clearDB(){
        statement = null;
        String s = "DELETE FROM Cars";
        observableList.clear();
        try {
            PreparedStatement statement = connection.prepareStatement(s);
            statement.execute();
            System.out.println("DB data cleared");
            statement.close();
        }
        catch (Exception e) {}
        try {
            connection.close();
        } catch (Exception e){//System.out.println(e.getClass() + " " + e.getMessage());
        }
        createTable();
    }

    public static void populateDatabase(){

              try {
            connection = DriverManager.getConnection(sqlCon);
            System.out.println("Connection to database established.");
            //#########

            //########

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        /*try {
            connection.close();
        } catch (Exception e){
            System.out.println(e.getClass() + " " + e.getMessage());
        }*/

    }

    //mock DB
    public static ObservableList<car> setupDB() { //was passing connection
        clearDB();
        connection=getConnect();
        try {
            statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO Cars " + "VALUES (1,1234,1980,'Toyota','camry')");
            statement.executeUpdate("INSERT INTO Cars " + "VALUES (2,1234,1980,'Toyota','camry')");
            statement.executeUpdate("INSERT INTO Cars " + "VALUES (3,1234,1980,'Toyota','camry')");
            statement.executeUpdate("INSERT INTO Cars " + "VALUES (4,1234,1980,'Toyota','camry')");
            statement.executeUpdate("INSERT INTO Cars " + "VALUES (5,1234,1980,'Toyota','camry')");
            System.out.println("Rows of data inserted.");
            statement.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        observableList=createTable();
        return observableList;
    }

    public static ObservableList<car> editRecord(int key, int uniq, int year, String make, String model) {
        String s = "UPDATE Cars SET key="+key+",uniq="+uniq+",year="+year+",make='"+make+"',model='"+model+"' WHERE key ="+key+";";
        //replace the value in the database
        try {
            statement = connection.createStatement();
            System.out.println(s);
            statement.executeUpdate(s);
            statement.close();
        }
        catch (Exception e) {}
        /*try {
            connection.close();
        } catch (Exception e){//System.out.println(e.getClass() + " " + e.getMessage());
        }*/
        //replace the value in the observableList
        String carview = "SELECT key,uniq,year,make,model FROM Cars";
        observableList.clear();
        try{
            Statement statement = connection.createStatement();
            ResultSet queryOut = statement.executeQuery(carview);
            while (queryOut.next()){
                Integer num1 = queryOut.getInt("key");
                Integer num2 = queryOut.getInt("uniq");
                Integer num3 = queryOut.getInt("year");
                make = queryOut.getString("make");
                model = queryOut.getString("model");
                observableList.add(new car(num1,num2,num3,make,model));
            }
        }catch(Exception e){//Logger.getLogger(HelloController.class.getName()).log(Level.SEVERE, null, e);e.printStackTrace();
        }
        observableList=createTable();
        return observableList;
    }

    public static String[] GetRecordByID(int key){
        String[] test = new String[5];
        String s = "SELECT key,uniq,year,make,model FROM Cars Where key ="+key+";";
        ArrayList<String> test1 = new ArrayList<String>();
        try{
            Statement statement = connection.createStatement();
            ResultSet queryOut = statement.executeQuery(s);
            while (queryOut.next()){
                test1.add(queryOut.getString(1)); //column 1
            }
        }catch(Exception e){
            Logger.getLogger(HelloController.class.getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
        }
        //while(s.)
        test = test1.toArray(test);
        return test;
    }

    //findcode
    public static ObservableList<car> dropTable(){
        return blankList;
    }
}
