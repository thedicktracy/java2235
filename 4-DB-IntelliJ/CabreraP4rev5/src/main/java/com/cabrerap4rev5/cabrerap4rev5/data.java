package com.cabrerap4rev5.cabrerap4rev5;


import javax.swing.*;
import java.awt.*;
import java.io.*;

public class data {


    //public String Summary(){
    //    return this.GetSummary();
    // }
    public TextArea Summary;

    public String getText(){
        return this.getText();
    }

    //public String Summary() {
    //Summary= null;
    //   return this.Summary();
    // }
    public String GetSummary(){
        return Summary.getText();

    }

    //private String Summary(String text) {
    //}


    public JComboBox GetComboBoxValue(String[] myStrings)
    {
        this.tests(myStrings);
        return null;
    }

    private void tests(String[] myStrings) {

    }
    private Byte GetValue(){
        return this.GetValue();
    }

    public int GetStatus(){
        // Object slider;
        // slider = null;
        int value = this.GetValue();
        return value;
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

    public void writeFile(javafx.scene.control.TextArea Summary, File file){
        try{
            FileWriter fstream = new FileWriter(file);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(Summary.getText());
            out.close();}
        catch(Exception e){
            System.err.println("Error:"+e.getMessage());
        }
    }

        /*
    public void writeFile(){
            try{

                //String file = null;
                //FileWriter fstream = new FileWriter(file);
                //BufferedWriter out = new BufferedWriter(fstream);
                //out.write( this.Summary() );    ///Write file contents.
//close file when done
                //out.close();
            }
            catch (Exception e) {//Catch exception if any
                System.err.println("Error: " + e.getMessage());
            }
        }*/
/*
    public void writeFile(){
        try{
            File file = null;
            FileWriter fstream = new FileWriter(file);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write( this.toString() );    ///Write file contents.
            //close file when done
            out.close();
            }
            catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
            }

    }*/
}