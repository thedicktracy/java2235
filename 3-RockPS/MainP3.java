//////////////////////////////////////////////////////////////////////////////////////////////
// Programmer: Robert Cabrera
// Email: rcabrera14@cnm.edu
// Program Name: Rock Paper Scissors GUI
// File Name: MainP3.java
//////////////////////////////////////////////////////////////////////////////////////////////

import javax.*;
import javax.swing.*;
import javax.swing.plaf.PanelUI;
import java.awt.*;
import java.util.Random;
//import RockPS;
import RockFrame;

public class MainP3 {
    
    public static void main(String[] args){
    RockPS rps = new RockPS();
    //JOptionPane.showMessageDialog(null,"Programmer: Robert Cabrera \n Email: rcabrera14@cnm.edu \n Program Name: Rock Paper Scissors \n File Name: MainP3.java \n Program Objective: RockPaperScissors GUI!");
    RockFrame frame = new RockFrame(rps);
    frame.setTitle("Robert Cabrera - CabreraP3: Welcome to Rock, Paper, Scissors Game");
    frame.setSize(1060,600);
	frame.setLocationRelativeTo(null); // Center the frame
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);

    }
    
}

