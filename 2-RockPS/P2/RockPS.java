//////////////////////////////////////////////////////////////////////////////////////////////
// Programmer: Robert Cabrera
// Email: rcabrera14@cnm.edu
// Program Name: Rock Paper Scissors
// File Name: RockPS.java
//////////////////////////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import javax.swing.plaf.PanelUI;
import java.awt.*;
import java.util.Random;

///This file will have a no arg constructor and several private class variables and several methods



public class RockPS{
    //class variables
    public String playerName;
    public int userChoice;
    public int compChoice;
    public String[] rps = {"rock", "paper", "scissors"};
    public String playerMove;
    public String computerMove;
    public int t = 0;
    public int c = 0;
    public int p = 0;
    public boolean gameOver;
    
    //String[] rps = {"rock", "paper", "scissors"};
    //Random rand; 
    //Constructor
        public RockPS(){    

            //return playerName;

                    }
                        

       

        
    //Methods    

        public String getUserName(){
            
            playerName = JOptionPane.showInputDialog(null,"Programmer: Robert Cabrera \n Email: rcabrera14@cnm.edu \n Program Name: Rock Paper Scissors \n File Name: RockPS.java \n Program Objective: RockPaperScissors game! \n Please type your name and press Enter to continue");    
            JOptionPane.showMessageDialog(null,"Hello "+playerName+ "!!");
            return playerName;


        }
            
        public void setGameStart(int userChoice){
            
            
        //    String[] rps = {"rock", "paper", "scissors"};
            //test
            //JOptionPane.showMessageDialog(null, "test "+ "test" + "test");
            //show class header with JOP
            
            //playerName = JOptionPane.showInputDialog(null,"Programmer: Robert Cabrera \n Email: rcabrera14@cnm.edu \n Program Name: Rock Paper Scissors \n File Name: RockPS.java \n Program Objective: RockPaperScissors game! \n Please type your name and press Enter to continue");    
            //
            //Get user choice 
            while (c<2 && p<2){
            userChoice = JOptionPane.showOptionDialog(null, "Select one:", "Choose Rock Paper Scissors", 0,3, null, rps, rps[0]);
            //show me user choice 
            JOptionPane.showMessageDialog(null," You chose " + rps[userChoice] + "!!");
            //assign computer choice 
            String computerMove = rps[new Random().nextInt(rps.length)];
            //show me computer choice
            JOptionPane.showMessageDialog(null," Computer chose " + computerMove + "!!");
            
            
            //compare and score
            playerMove = rps[userChoice];
           
            
            if (playerMove.equals(computerMove)) {
              ///System.out.println("The game is tied!");
              JOptionPane.showMessageDialog(null, "The game is tied! ");
              t++;
                                               }
            else if(playerMove.equals("rock")) {
              if (computerMove.equals("paper")) {
                  ///System.out.println("You lose!");
                  JOptionPane.showMessageDialog(null, "You lose this round! ");
                  c++;                      
                } 
              else if (computerMove.equals("scissors")){
                  ///System.out.println("You win!");
                  JOptionPane.showMessageDialog(null, "You win this round! ");
                  p++;                         
                 }
                                          }
  
            else if(playerMove.equals("paper")) {
              if (computerMove.equals("scissors")) {
                  ///System.out.println("You lose!");
                  JOptionPane.showMessageDialog(null, "You lose this round! ");
                  c++;                      
                } 
              else if (computerMove.equals("rock")){
                  ///System.out.println("You win!");
                  JOptionPane.showMessageDialog(null, "You win this round! ");
                  p++;                         
                 }
                                          }
  
            else if(playerMove.equals("scissors")) {
              if (computerMove.equals("rock")) {
                  ///System.out.println("You lose!");
                  JOptionPane.showMessageDialog(null, "You lose this round! ");
                  c++;                      
                } 
              else if (computerMove.equals("paper")){
                  ///System.out.println("You win!");
                  JOptionPane.showMessageDialog(null, "You win this round! ");
                  p++;  
                                          }
                                        }
                                        String roundsWinLose = "the user has won :: "+ p +" rounds\n" +"The Computer has won :: "+ c + " rounds\n"+"There have been "+t+" ties";                     
                                        JOptionPane.showMessageDialog(null,roundsWinLose);
                                      }
            
            if(p>c){
              String gameOverString = "you win the game!";
              JOptionPane.showMessageDialog(null, gameOverString);
            }
            else {
              String gameOverString = "The Computer wins the game!";
              JOptionPane.showMessageDialog(null, gameOverString);
            }

            
                                      
            //JOptionPane.showMessageDialog(null, "Goodbye");                  
                                
                          /////System.out.println(playerName + " score::" + p);
                          /////System.out.println("Computer score::" + c);                
                         // JOptionPane.showMessageDialog(null, playerName + " score::  " + p);
                          
                         // JOptionPane.showMessageDialog(null, "Computer score::" + c);
  
                         // JOptionPane.showMessageDialog(null, "Number of ties::  " + t);
          }
          
                                                                                
          
       public String getCompChoice(int compChoice){
            String[] rps = {"rock", "paper", "scissors"};
            compChoice = new Random().nextInt(rps.length);
            //assign computer choice
            String computerMove = rps[compChoice];
            //show me computer choice
            JOptionPane.showMessageDialog(null," Computer chose " + computerMove + "!!");
            return computerMove; 
       }  

          //                  }  

          
        public String getRoundsWinLose(String roundsWinLose){
          roundsWinLose = "the user has won :: "+ p +" rounds\n" +"The Computer has won :: "+ c + " rounds\n"+"There have been "+t+" ties";                     
          JOptionPane.showMessageDialog(null,roundsWinLose);
          return roundsWinLose;
        } 

        
        public boolean getGameOver(){
            String gameOverString = "The game is over";
            JOptionPane.showMessageDialog(null, gameOverString);
            int response = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(response==JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Goodbye player " + playerName);
                return true;        
                                               }
                else{
                    return false;
                    }
          
        }   
        
        public String getGameOverString(){
          if(p>c){
            String gameOverString = "you win the game!";
            JOptionPane.showMessageDialog(null, gameOverString);
            return gameOverString;
          }
          else {
            String gameOverString = "The Computer wins the game!";
            JOptionPane.showMessageDialog(null, gameOverString);
            return gameOverString;
          }
        }

        public String getGoodbye(){
          String roundsWinLose = "the user has won :: "+ p +" rounds\n" +"The Computer has won :: "+ c + " rounds\n"+"There have been "+t+" ties";                     
          JOptionPane.showMessageDialog(null,roundsWinLose);
          JOptionPane.showMessageDialog(null, "Goodbye");
          return roundsWinLose;
          
        }

        public void reset(){
            p = 0;
            c = 0;
            t = 0;
        }


                                          }



