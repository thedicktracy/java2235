//////////////////////////////////////////////////////////////////////////////////////////////
// Programmer: Robert Cabrera
// Email: rcabrera14@cnm.edu
// Program Name: Rock Paper Scissors
// File Name: RockUI.java
//////////////////////////////////////////////////////////////////////////////////////////////
//package "C:\Users\sc420f\Documents\LTP\Java\CabreraP2";

import javax.swing.*;
import javax.swing.plaf.PanelUI;
import java.awt.*;



//package RockPS;

public class RockUI{
    //private RockPS rps;
    //String[] rps = {"rock", "paper", "scissors"};
    public RockPS myObject;
    public boolean check;
    //other class variables, string array 

    //Constructor
    public RockUI(){
         myObject = new RockPS();
         // String test = new RockPS();
        
    }   

    public void play(){
       
        //gameOver=false;
        myObject.getUserName();
        myObject.setGameStart(0);
        //check = myObject.getGameOver();
        if (myObject.getGameOver()){
          myObject.getGameOverString();
        }else{
          myObject.reset();
          play();
        }
      //JOptionPane.showMessageDialog(null, check);
      


       // JOptionPane.showMessageDialog(null, myObject.getGameOver(false));
        //myObject.reset();
        //
        // 
        //myObject.getGameOver(true);
        //JOptionPane.showMessageDialog(null, myObject.getGameOver(true));
        //JOptionPane.showMessageDialog(null, check);
        ///JOptionPane.showMessageDialog(null, myObject.getGameOver(false));
        
        //myObject.getGameOver(false)
        //JOptionPane.showMessageDialog(null, myObject.getGameOver(false) + " test");
       // myObject.getGoodbye();
        
       //}
      // else if (gameOver=true){
        //myObject.getGoodbye();
       //}
        
      // myObject.getCompChoice(0);
        
        //myObject.playerName = JOptionPane.showInputDialog(null,"Programmer: Robert Cabrera \n Email: rcabrera14@cnm.edu \n Program Name: Rock Paper Scissors \n File Name: RockPS.java \n Program Objective: RockPaperScissors game! \n Please type your name and press Enter to continue");    
        ///Display user choice 
        //String playerMove = myObject.setGameStart();
        //JOptionPane.showMessageDialog(null, "Player Chose :: "+ playerMove+ "!!");
            
        //Display computer choice 
        //String computerMove = myObject.getCompChoice();
        //JOptionPane.showMessageDialog(null," Computer chose " + computerMove + "!!");
        
         
        

        //Display round results 


        //when game is over , display results 
        //Say Goodbye
    }
}
