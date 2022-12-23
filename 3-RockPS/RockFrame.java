import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class RockFrame extends JFrame implements ActionListener {
    public RockPS rps;
    public JTextField userChoice;
    public JTextField compChoice;
    public JButton rock;
    public JButton paper;
    public JButton scissors;
    String uchoice;
    String cchoice;
    public JTextField userScore;
    public JTextField compScore;
    //variables
    RockFrame(){
        //constructor
    }
    //component declarations (references)

    @Override
        public void actionPerformed(ActionEvent e){
            
            cchoice = rps.getCompChoice(0);
            compChoice.setText(cchoice);
            if(e.getSource()==rock){
                //System.out.println("boo");
                uchoice = rock.getText();
                userChoice.setText(uchoice);
                
                //System.out.println(e.getText());
                //String itemSelected = (String)e.getSource();
            }
            else if(e.getSource()==scissors){
                uchoice = scissors.getText();
                userChoice.setText(uchoice);
                //System.out.println("scissors");
            }
            else if(e.getSource()==paper){
                uchoice = paper.getText();
                userChoice.setText(uchoice);
                //System.out.println("paper");
            }
            
            rps.setGameStart(uchoice, cchoice);
            userScore.setText(Integer.toString(rps.getP()));
            compScore.setText(Integer.toString(rps.getC()));
        }
 
    /*
    @Override
    public void itemStateChanged(ItemEvent e) {
        // To check if item was selected (not unselected)
            if (e.getStateChange() == ItemEvent.SELECTED) {
                //Then you can get the Item:
            String itemSelected  = (String) e.getSource();
            userChoice.setText(itemSelected);   
            //System.out.println("boo");
            //System.out.println(itemSelected);
            } 
        }
        */
    //public void actionPerformed(ActionEvent e){

   // }

    //Constructor
    public RockFrame(RockPS paper){
        rps=paper;
        initComponents();
        
        //add action listeners to components
        //at least one anonymous inner class
    }
    

    public void initComponents(){
        //instantiate components
        //JFrame frame = new JFrame();
        JPanel title_panel = new JPanel();
        JPanel button_panel = new JPanel();
        JPanel bottom_panel = new JPanel();
        JLabel textfield = new JLabel();
        JLabel textfield1 = new JLabel();
        JLabel textfield2 = new JLabel();
        JLabel textfield3 = new JLabel();
        JLabel textfield4 = new JLabel();
        userScore = new JTextField(3);
        compScore = new JTextField(3);
        userChoice = new JTextField(10);
        compChoice = new JTextField(10);

        rock = new JButton("rock");
        rock.addActionListener(this);
        paper = new JButton("paper");
        paper.addActionListener(this);
        scissors = new JButton("scissors");
        scissors.addActionListener(this);
        this.getContentPane().setBackground(Color.gray);
        this.setLayout(new BorderLayout());

        //textfield.setBackground(new Color(25,25,25));
        //textfield.setForeground(new Color(25,255,0));
        textfield.setFont(new Font("Arial",Font.BOLD,15));
        textfield.setVerticalAlignment(JLabel.TOP);
        textfield.setHorizontalAlignment(JLabel.LEFT);
        textfield.setText("Robert Cabrera, java1. Welcome to Rock Paper Scissors Game. Rock breaks Scissors, Scissors cuts paper, and Paper covers Rock. Select your choice by pressing a button::");
        textfield.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,300,200);
        
        button_panel.setLayout(new FlowLayout(FlowLayout.LEADING));
        button_panel.add(rock);
        button_panel.add(paper);
        button_panel.add(scissors);

        textfield1.setFont(new Font("Arial",Font.BOLD,15));
        textfield1.setVerticalAlignment(JLabel.BOTTOM);
        textfield1.setHorizontalAlignment(JLabel.LEFT);
        textfield1.setText("Comp Chose ::  ");
        textfield1.setOpaque(true);

        textfield2.setFont(new Font("Arial",Font.BOLD,15));
        textfield2.setVerticalAlignment(JLabel.BOTTOM);
        textfield2.setHorizontalAlignment(JLabel.LEFT);
        textfield2.setText("User Chose ::  ");
        textfield2.setOpaque(true);
        
        textfield3.setFont(new Font("Arial",Font.BOLD,20));
        textfield3.setVerticalAlignment(JLabel.BOTTOM);
        textfield3.setHorizontalAlignment(JLabel.LEFT);
        textfield3.setText("User Score:: ");
        textfield3.setOpaque(true);
        
        textfield4.setFont(new Font("Arial",Font.BOLD,20));
        textfield4.setVerticalAlignment(JLabel.BOTTOM);
        textfield4.setHorizontalAlignment(JLabel.LEFT);
        textfield4.setText("Comp Score::  ");
        textfield4.setOpaque(true);

        title_panel.add(textfield);
        this.add(title_panel,BorderLayout.NORTH);
        this.add(button_panel);
        bottom_panel.add(textfield1);
        bottom_panel.add(compChoice);
        bottom_panel.add(textfield2);
        bottom_panel.add(userChoice);
        bottom_panel.add(textfield3);
        bottom_panel.add(userScore);
        bottom_panel.add(textfield4);
        bottom_panel.add(compScore);
        this.add(bottom_panel,BorderLayout.SOUTH);




    }

    private void resetGame(){
        reset();
    }

    //inner classses for listeners
    private void sayGoodbye(){
    getGoodbye();
    }


}