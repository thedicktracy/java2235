package com.cis2235.cabrerap7rev3;


public class Card {
private int value;
private String suit;
private String color;

private String imageName;

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageName() {
        return imageName;
    }

    public Card (int value, String suit,String imageName){
    this.imageName = imageName;
    this.value = value;
    this.suit = suit;
    if(this.suit.equals("Hearts") || this.suit.equals("Diamonds")){
        this.color = "Red";
    }
    if(this.suit.equals("Clubs") || this.suit.equals("Spades")){
        this.color = "Black";
    }
}

    public void setValue(int value) {
        this.value = value;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    public String getColor() {
        return color;
    }


public String toString(){
        String s= Integer.toString(value)+ " of " + suit+" file:: "+ imageName;
        return s;
}
public static void main(String[] args){
    //Card card = new Card();
}

}
