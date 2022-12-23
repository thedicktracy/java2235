//////////////////////////////////////////////////////////////////////////////////////////////
// Programmer: Robert Cabrera
// Email: rcabrera14@cnm.edu
// Program Name: Rock Paper Scissors
// File Name: RockPS.java
//////////////////////////////////////////////////////////////////////////////////////////////


import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RockPS {

     //////Use a JOptionPane to write your name, program title, and program objective to the screen so that it is the first thing I see when your program runs.  
    ////This is your course header.  

      public static void main(String[] args){
        
        String[] rps = {"rock", "paper", "scissors"};
        String computerMove = rps[new Random().nextInt(rps.length)];
        String playerMove;
        
        int p=0;
        int c=0;
        int t=0;
        int g=0;
        int cw=0;
        int pw=0;
        String playerName;
        playerName = JOptionPane.showInputDialog(null,"Programmer: Robert Cabrera \n Email: rcabrera14@cnm.edu \n Program Name: Rock Paper Scissors \n File Name: RockPS.java \n Program Objective: RockPaperScissors game! \n Please type your name and press Enter to continue");    
        System.out.println("Hello " + playerName + "!!");
        while(p<2 && c<2){
        
        computerMove = rps[new Random().nextInt(rps.length)];

        Scanner scanner = new Scanner(System.in);
        while(true) {
              ////get player move   
            playerMove = (String)JOptionPane.showInputDialog(null, "Select Rock, Paper, or Scissors ", "Choices", JOptionPane.QUESTION_MESSAGE,null, rps,"RPS");
            JOptionPane.showMessageDialog(null," You chose " + playerMove + "!!");
            JOptionPane.showMessageDialog(null," Computer chose " + computerMove + "!!");
            ///System.out.println("\n Please enter your move (r, p, or s) \n");
            ///playerMove = scanner.nextLine();
        
            if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissors")) {
                break;
            }
            ////show player that they chose invalid option
            JOptionPane.showMessageDialog(null, "This is not a valid option");
            ///System.out.println(playerMove + " is not a valid move.");
                    }
                         
        System.out.println(playerName + " played: " + playerMove);
        System.out.println("Computer played: " + computerMove+"\n");
      
        if (playerMove.equals(computerMove)) {
            ///System.out.println("The game is tied!");
            JOptionPane.showMessageDialog(null, "The game is tied! ");
            t++;
                                             }
        else if(playerMove.equals("rock")) {
            if (computerMove.equals("paper")) {
                ///System.out.println("You lose!");
                JOptionPane.showMessageDialog(null, "You lose! ");
                c++;                      } 
            else if (computerMove.equals("scissors")){
                ///System.out.println("You win!");
                JOptionPane.showMessageDialog(null, "You win! ");
                p++;                          }
                                        }

        else if(playerMove.equals("paper")) {
            if (computerMove.equals("scissors")) {
                ///System.out.println("You lose!");
                JOptionPane.showMessageDialog(null, "You lose! ");
                c++;                      } 
            else if (computerMove.equals("rock")){
                ///System.out.println("You win!");
                JOptionPane.showMessageDialog(null, "You win! ");
                p++;                          }
                                        }

        else if(playerMove.equals("scissors")) {
            if (computerMove.equals("rock")) {
                ///System.out.println("You lose!");
                JOptionPane.showMessageDialog(null, "You lose! ");
                c++;                      } 
            else if (computerMove.equals("paper")){
                ///System.out.println("You win!");
                JOptionPane.showMessageDialog(null, "You win! ");
                p++;  
                                        }
                                        }
                            
                        /////System.out.println(playerName + " score::" + p);
                        /////System.out.println("Computer score::" + c);                
                        JOptionPane.showMessageDialog(null, playerName + " score::  " + p);
                        
                        JOptionPane.showMessageDialog(null, "Computer score::" + c);

                        JOptionPane.showMessageDialog(null, "Number of ties::  " + t);


        if(p==2){
           
            JOptionPane.showMessageDialog(null, "Congratulations!! "+ playerName + " has won best 2 out of 3! ");
            int response = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(response==JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Goodbye player " + playerName);
                JOptionPane.showMessageDialog(null, "Total games played :: " + g);
                JOptionPane.showMessageDialog(null, "Total Losses ::   " + cw);
                JOptionPane.showMessageDialog(null, "Total Player wins :: " + pw);
                
                                               }
                else{
                    g++; pw++;
                    t=0;
                    c=0;
                    p=0;
                    }
                }
        else if (c==2) {
           
            JOptionPane.showMessageDialog(null, "Congratulations!! Computer has won best 2 out of 3! ");
            int response = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(response==JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Goodbye player " + playerName);
                JOptionPane.showMessageDialog(null, "Total games played :: " + g);
                JOptionPane.showMessageDialog(null, "Total Losses ::   " + cw);
                JOptionPane.showMessageDialog(null, "Total Player wins :: " + pw);
                

                                               }
                else{
                    g++; cw++;
                    t=0;
                    c=0;
                    p=0;
                    }
                      }        
        
                        } ///<while loop close


                
      }  ////public static void main close 
      ///System.exit(0); ////clean up scanner and any residual memory/processes/threads 
    } ////close the class 

