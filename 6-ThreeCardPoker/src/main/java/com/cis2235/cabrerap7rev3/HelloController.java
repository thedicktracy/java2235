package com.cis2235.cabrerap7rev3;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController extends HelloApplication implements Initializable{

    @FXML
    private Button dealcards; @FXML private Button playagain;@FXML private Button showwinner;
    @FXML private TextArea detail; @FXML private TextArea playerone; @FXML private TextArea playertwo;
    @FXML private ImageView redfive; @FXML private ImageView redfour; @FXML private ImageView redone; @FXML private ImageView redsix; @FXML private ImageView redthree; @FXML private ImageView redtwo; @FXML public static ImageView threecardbragimage;
    private static ThreeCardBrag hand1;private static ThreeCardBrag hand2;
    @FXML
    void dealcards(MouseEvent event) {
        playerone.setText(null);playertwo.setText(null);
        InputStream inStream = this.getClass().getResourceAsStream(String.format("/pics/b2fv.png"));
        Image imageObject = new Image(inStream);
        redone.setImage(new ImageView(imageObject).getImage()); //GETIMAGE
        redtwo.setImage(new ImageView(imageObject).getImage());
        redthree.setImage(new ImageView(imageObject).getImage());
        redfour.setImage(new ImageView(imageObject).getImage());
        redfive.setImage(new ImageView(imageObject).getImage());
        redsix.setImage(new ImageView(imageObject).getImage());
        redone.setVisible(true);
        redtwo.setVisible(true);
        redthree.setVisible(true);
        redfour.setVisible(true);
        redfive.setVisible(true);
        redsix.setVisible(true);
        CardDeck.resetDeck();
        hand1 = CardDeck.getNextCard();
        System.out.println(hand1);
        hand2 = CardDeck.getNextCard();

    }
    public static ThreeCardBrag hand1(){
        return hand1;
    }
    public static ThreeCardBrag hand2(){
        return hand2;
    }

    @FXML
    void playagain(MouseEvent event) {

    }

    @FXML
    void showinner(MouseEvent event) {
       int w=ThreeCardBrag.whoWon();
        playerone.setText(null);playertwo.setText(null);detail.setText(null);
        if(w==1){
            String s = "Player one wins";
            String m= "Player two loses";
            System.out.println(s);
            playerone.appendText(s);
            playertwo.appendText(m);
        }else if(w==0){
            String s = "Player two wins";
            String m= "Player one loses";
            System.out.println(s);
            playerone.appendText(m);
            playertwo.appendText(s);
        }else if(w==-1){
            String s = "it's a tie!";
            System.out.println(s);
            detail.appendText(s);
        }

    }
    //didn't break ? new ImageView(new Image("file:brag.png"))//pics/brag.png
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        InputStream inStream = this.getClass().getResourceAsStream("/pics/brag.png");
        Image imageObject = new Image(inStream);
        threecardbragimage = new ImageView(imageObject);
        }

    public void redoneclicked(MouseEvent mouseEvent) {
        //pick integer random 1-54 this is handled by getnextcard method
        System.out.println("/pics/"+hand1.getX()+".png");
        InputStream inStream = this.getClass().getResourceAsStream(String.format("/pics/"+hand1.getX()+".png"));
        Image imageObject = new Image(inStream);
        redone.setImage(new ImageView(imageObject).getImage()); //GETIMAGE
    }

    public void redtwoclicked(MouseEvent mouseEvent) {
        System.out.println("/pics/"+hand1.getY()+".png");
        InputStream inStream = this.getClass().getResourceAsStream(String.format("/pics/"+hand1.getY()+".png"));
        Image imageObject = new Image(inStream);
        redtwo.setImage(new ImageView(imageObject).getImage()); //GETIMAGE
    }

    public void redthreeclicked(MouseEvent mouseEvent) {
        System.out.println("/pics/"+hand1.getZ()+".png");
        InputStream inStream = this.getClass().getResourceAsStream(String.format("/pics/"+hand1.getZ()+".png"));
        Image imageObject = new Image(inStream);
        redthree.setImage(new ImageView(imageObject).getImage()); //GETIMAGE
    }

    public void redfourclicked(MouseEvent mouseEvent) {
        System.out.println("/pics/"+hand2.getX()+".png");
        InputStream inStream = this.getClass().getResourceAsStream(String.format("/pics/"+hand2.getX()+".png"));
        Image imageObject = new Image(inStream);
        redfour.setImage(new ImageView(imageObject).getImage()); //GETIMAGE
    }

    public void redfiveclicked(MouseEvent mouseEvent) {
        System.out.println("/pics/"+hand2.getY()+".png");
        InputStream inStream = this.getClass().getResourceAsStream(String.format("/pics/"+hand2.getY()+".png"));
        Image imageObject = new Image(inStream);
        redfive.setImage(new ImageView(imageObject).getImage()); //red 5 standing by
    }

    public void redsixclicked(MouseEvent mouseEvent) {
        System.out.println("/pics/"+hand2.getZ()+".png");
        InputStream inStream = this.getClass().getResourceAsStream(String.format("/pics/"+hand2.getZ()+".png"));
        Image imageObject = new Image(inStream);
        redsix.setImage(new ImageView(imageObject).getImage()); //GETIMAGE
    }
    @FXML
    void showall(MouseEvent event) {
        //6
        InputStream inStream = this.getClass().getResourceAsStream(String.format("/pics/"+hand2.getZ()+".png"));
        Image imageObject = new Image(inStream);
        redsix.setImage(new ImageView(imageObject).getImage()); //GETIMAGE
        //5
        inStream = this.getClass().getResourceAsStream(String.format("/pics/"+hand2.getY()+".png"));
        imageObject = new Image(inStream);
        redfive.setImage(new ImageView(imageObject).getImage()); //GETIMAGE
        //4
        inStream = this.getClass().getResourceAsStream(String.format("/pics/"+hand2.getX()+".png"));
        imageObject = new Image(inStream);
        redfour.setImage(new ImageView(imageObject).getImage()); //GETIMAGE
        //3
        inStream = this.getClass().getResourceAsStream(String.format("/pics/"+hand1.getZ()+".png"));
        imageObject = new Image(inStream);
        redthree.setImage(new ImageView(imageObject).getImage()); //GETIMAGE
        //2
        inStream = this.getClass().getResourceAsStream(String.format("/pics/"+hand1.getY()+".png"));
        imageObject = new Image(inStream);
        redtwo.setImage(new ImageView(imageObject).getImage()); //GETIMAGE
        //1
        inStream = this.getClass().getResourceAsStream(String.format("/pics/"+hand1.getX()+".png"));
        imageObject = new Image(inStream);
        redone.setImage(new ImageView(imageObject).getImage()); //GETIMAGE
    }
}