package com.cis2235.cabrerap7rev3;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public abstract class CardDeck {
    public static Card cardDeck[] = new Card[52];
    private static Boolean[] cardDealt = new Boolean[52];
    static int x;
    static int y;
    static int z;
    static int l;

    public static void main(String[] args) {

    }

    public static void initializeDeck() {
        cardDeck[0] = new Card(14, "Spades", "1.png");
        cardDeck[1] = new Card(2, "Spades", "2.png");
        cardDeck[2] = new Card(3, "Spades", "3.png");
        cardDeck[3] = new Card(4, "Spades", "4.png");
        cardDeck[4] = new Card(5, "Spades", "5.png");
        cardDeck[5] = new Card(6, "Spades", "6.png");
        cardDeck[6] = new Card(7, "Spades", "7.png");
        cardDeck[7] = new Card(8, "Spades", "8.png");
        cardDeck[8] = new Card(9, "Spades", "9.png");
        cardDeck[9] = new Card(10, "Spades", "10.png");
        cardDeck[10] = new Card(11, "Spades", "11.png");
        cardDeck[11] = new Card(12, "Spades", "12.png");
        cardDeck[12] = new Card(13, "Spades", "13.png");
        cardDeck[13] = new Card(14, "Hearts", "14.png");
        cardDeck[14] = new Card(2, "Hearts", "15.png");
        cardDeck[15] = new Card(3, "Hearts", "16.png");
        cardDeck[16] = new Card(4, "Hearts", "17.png");
        cardDeck[17] = new Card(5, "Hearts", "18.png");
        cardDeck[18] = new Card(6, "Hearts", "19.png");
        cardDeck[19] = new Card(7, "Hearts", "20.png");
        cardDeck[20] = new Card(8, "Hearts", "21.png");
        cardDeck[21] = new Card(9, "Hearts", "22.png");
        cardDeck[22] = new Card(10, "Hearts", "23.png");
        cardDeck[23] = new Card(11, "Hearts", "24.png");
        cardDeck[24] = new Card(12, "Hearts", "25.png");
        cardDeck[25] = new Card(13, "Hearts", "26.png");
        cardDeck[26] = new Card(14, "Diamonds", "27.png");
        cardDeck[27] = new Card(2, "Diamonds", "28.png");
        cardDeck[28] = new Card(3, "Diamonds", "29.png");
        cardDeck[29] = new Card(4, "Diamonds", "30.png");
        cardDeck[30] = new Card(5, "Diamonds", "31.png");
        cardDeck[31] = new Card(6, "Diamonds", "32.png");
        cardDeck[32] = new Card(7, "Diamonds", "33.png");
        cardDeck[33] = new Card(8, "Diamonds", "34.png");
        cardDeck[34] = new Card(9, "Diamonds", "35.png");
        cardDeck[35] = new Card(10, "Diamonds", "36.png");
        cardDeck[36] = new Card(11, "Diamonds", "37.png");
        cardDeck[37] = new Card(12, "Diamonds", "38.png");
        cardDeck[38] = new Card(13, "Diamonds", "39.png");
        cardDeck[39] = new Card(14, "Clubs", "40.png");
        cardDeck[40] = new Card(2, "Clubs", "41.png");
        cardDeck[41] = new Card(3, "Clubs", "42.png");
        cardDeck[42] = new Card(4, "Clubs", "43.png");
        cardDeck[43] = new Card(5, "Clubs", "44.png");
        cardDeck[44] = new Card(6, "Clubs", "45.png");
        cardDeck[45] = new Card(7, "Clubs", "46.png");
        cardDeck[46] = new Card(8, "Clubs", "47.png");
        cardDeck[47] = new Card(9, "Clubs", "48.png");
        cardDeck[48] = new Card(10, "Clubs", "49.png");
        cardDeck[49] = new Card(11, "Clubs", "50.png");
        cardDeck[50] = new Card(12, "Clubs", "51.png");
        cardDeck[51] = new Card(13, "Clubs", "52.png");

    }

    //public static Card getCard(int i){
    public static Card getCard(int i) {
        cardDeck[0] = new Card(14, "Spades", "1.png");
        cardDeck[1] = new Card(2, "Spades", "2.png");
        cardDeck[2] = new Card(3, "Spades", "3.png");
        cardDeck[3] = new Card(4, "Spades", "4.png");
        cardDeck[4] = new Card(5, "Spades", "5.png");
        cardDeck[5] = new Card(6, "Spades", "6.png");
        cardDeck[6] = new Card(7, "Spades", "7.png");
        cardDeck[7] = new Card(8, "Spades", "8.png");
        cardDeck[8] = new Card(9, "Spades", "9.png");
        cardDeck[9] = new Card(10, "Spades", "10.png");
        cardDeck[10] = new Card(11, "Spades", "11.png");
        cardDeck[11] = new Card(12, "Spades", "12.png");
        cardDeck[12] = new Card(13, "Spades", "13.png");
        cardDeck[13] = new Card(14, "Hearts", "14.png");
        cardDeck[14] = new Card(2, "Hearts", "15.png");
        cardDeck[15] = new Card(3, "Hearts", "16.png");
        cardDeck[16] = new Card(4, "Hearts", "17.png");
        cardDeck[17] = new Card(5, "Hearts", "18.png");
        cardDeck[18] = new Card(6, "Hearts", "19.png");
        cardDeck[19] = new Card(7, "Hearts", "20.png");
        cardDeck[20] = new Card(8, "Hearts", "21.png");
        cardDeck[21] = new Card(9, "Hearts", "22.png");
        cardDeck[22] = new Card(10, "Hearts", "23.png");
        cardDeck[23] = new Card(11, "Hearts", "24.png");
        cardDeck[24] = new Card(12, "Hearts", "25.png");
        cardDeck[25] = new Card(13, "Hearts", "26.png");
        cardDeck[26] = new Card(14, "Diamonds", "27.png");
        cardDeck[27] = new Card(2, "Diamonds", "28.png");
        cardDeck[28] = new Card(3, "Diamonds", "29.png");
        cardDeck[29] = new Card(4, "Diamonds", "30.png");
        cardDeck[30] = new Card(5, "Diamonds", "31.png");
        cardDeck[31] = new Card(6, "Diamonds", "32.png");
        cardDeck[32] = new Card(7, "Diamonds", "33.png");
        cardDeck[33] = new Card(8, "Diamonds", "34.png");
        cardDeck[34] = new Card(9, "Diamonds", "35.png");
        cardDeck[35] = new Card(10, "Diamonds", "36.png");
        cardDeck[36] = new Card(11, "Diamonds", "37.png");
        cardDeck[37] = new Card(12, "Diamonds", "38.png");
        cardDeck[38] = new Card(13, "Diamonds", "39.png");
        cardDeck[39] = new Card(14, "Clubs", "40.png");
        cardDeck[40] = new Card(2, "Clubs", "41.png");
        cardDeck[41] = new Card(3, "Clubs", "42.png");
        cardDeck[42] = new Card(4, "Clubs", "43.png");
        cardDeck[43] = new Card(5, "Clubs", "44.png");
        cardDeck[44] = new Card(6, "Clubs", "45.png");
        cardDeck[45] = new Card(7, "Clubs", "46.png");
        cardDeck[46] = new Card(8, "Clubs", "47.png");
        cardDeck[47] = new Card(9, "Clubs", "48.png");
        cardDeck[48] = new Card(10, "Clubs", "49.png");
        cardDeck[49] = new Card(11, "Clubs", "50.png");
        cardDeck[50] = new Card(12, "Clubs", "51.png");
        cardDeck[51] = new Card(13, "Clubs", "52.png");

        Card test = cardDeck[i];
        //System.out.println("card Deck value:: "+cardDeck[i]);
        //System.out.println(test.toString());
        //return cardDeck[i].getValue();
        return cardDeck[i];

    }

    public static Card[] returnCard() {
        return cardDeck.clone();
    }

    public static ThreeCardBrag getNextCard() {

        int i = ThreadLocalRandom.current().nextInt(1, 52);
        x = i;
        //System.out.println(x);
        while (cardDealt[i] != false) {
            i = ThreadLocalRandom.current().nextInt(1, 52);
            x = i;
        }
        cardDealt[i] = true;
        i = ThreadLocalRandom.current().nextInt(1, 52);
        y = i;
        while (cardDealt[i] != false) {
            i = ThreadLocalRandom.current().nextInt(1, 52);
            y = i;
        }
        cardDealt[i] = true;
        i = ThreadLocalRandom.current().nextInt(1, 52);
        z = i;
        while (cardDealt[i] != false) {
            i = ThreadLocalRandom.current().nextInt(1, 52);
            z = i;
        }
        cardDealt[i] = true;
        ThreeCardBrag hand = new ThreeCardBrag(x, y, z);
        hand.setX(x);
        hand.setY(y);
        hand.setZ(z);
        //System.out.println("my hand::  "+ hand);
        //System.out.println("pics/"+i+".png");
        //InputStream inStream = this.getClass().getResourceAsStream(String.format("pics/"+i+".png"));
        //Image imageObject = new Image(inStream);
        //redone.setImage(new ImageView(imageObject).getImage()); //GETIMAGE
        return hand;
    }

    static Boolean cardDealt(int i) {
        return cardDealt[i];
    }

    static void resetDeck() {
        Arrays.fill(cardDealt, Boolean.FALSE);
    }

    static int threeofakind(int i, int j, int k) {
        Card a = getCard(i);
        Card b = getCard(j);
        Card c = getCard(k);
        if (a.getValue() == b.getValue() && b.getValue() == c.getValue()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int flush(int i, int j, int k) {
        Card a = getCard(i);
        Card b = getCard(j);
        Card c = getCard(k);
        if (a.getSuit() == b.getSuit() && a.getSuit() == c.getSuit()) {
            return 1;
        } else {
            return 0;
        }
    }

    static int straight(int i, int j, int k) {
        Card a = getCard(i - 1);
        Card b = getCard(j - 1);
        Card c = getCard(k - 1);

        //a is highest
        if (a.getValue() > b.getValue() && a.getValue() > c.getValue()) {
            if (b.getValue() == a.getValue() - 1) {
                if (c.getValue() == b.getValue() - 1) {return l = 1;}else{return l=0;}
            } else if (c.getValue() == a.getValue() - 1) {
                if(b.getValue()==c.getValue()-1){return l=1;}else{return l=0;}
            }
        }
        // b is highest
        if (b.getValue() > a.getValue() && b.getValue() > c.getValue()) {
            if (a.getValue() == b.getValue() - 1) {
                if (c.getValue() == a.getValue() - 1) {return l = 1;}else{return l=0;}
            } else if (c.getValue() == b.getValue() - 1) {
                if(b.getValue()==c.getValue()-1){return l=1;}else{return l=0;}
            }
        }
        //c is highest
        if (c.getValue() > a.getValue() && c.getValue() > b.getValue()) {
            if (a.getValue() == c.getValue() - 1) {
                if (b.getValue() == a.getValue() - 1) {return l = 1;}else{return l=0;}
            } else if (b.getValue() == c.getValue() - 1) {
                if(a.getValue()==b.getValue()-1){return l=1;}else{return l=0;}
            }
        }
        return l=0;
    }
        /*if(a.getValue()==b.getValue()-1 || a.getValue()==c.getValue()-1) {
            if (b.getValue() == c.getValue() - 1 || b.getValue() == a.getValue() - 1){
                //don't need to check for jokers and aces are max at 14 , we need to check for case 14,2,3
                l= 1;
            }else if (c.getValue() ==b.getValue()-1 || c.getValue()==a.getValue()-1){
                l=1;
            }
            else{l=0;}
        } //if j is lowest
        else if(b.getValue()==a.getValue()-1 || b.getValue()==c.getValue()-1) {
            if (c.getValue() == a.getValue() - 1 || c.getValue() == b.getValue() - 1){
                //don't need to check for jokers and aces are max at 14 , we need to check for case 14,2,3
                l= 1;
            }else if(a.getValue() == b.getValue()-1 || a.getValue()==c.getValue()-1){
                l=1;
            }
            else{l=0;}
        }//if k is lowest
        else if(c.getValue()==b.getValue()-1 || c.getValue()==a.getValue()-1) {
            if (b.getValue() == a.getValue() - 1 || b.getValue() == a.getValue() - 1){
                //don't need to check for jokers and aces are max at 14 , we need to check for case 14,2,3
                l= 1;
            }else if(a.getValue() == b.getValue()-1 || a.getValue()==c.getValue()-1){}
            else{l=0;}
        }else{
            l= 0;
        }*/
    //System.out.println("straight test value:: "+l);
//}
     static int pair(int i, int j, int k){
         Card a= getCard(i-1);
         Card b= getCard(j-1);
         Card c = getCard(k-1);
         //System.out.println("pair logic:: "+a.getValue());
         //System.out.println("pair logic:: "+b.getValue());
         //System.out.println("pair logic:: "+c.getValue());
            if(a.getValue() == b.getValue() || a.getValue() == c.getValue() || b.getValue() == c.getValue()){
                l=1;
            }else{
                l=0;
            }
            //System.out.println("tie pair value l:: "+l);
            return l;
     }
     static int high(int i, int j,int k){
         Card a= getCard(i-1);
         Card b= getCard(j-1);
         Card c = getCard(k-1);
            if(a.getValue()>=b.getValue() && a.getValue()>=c.getValue()){
                l=a.getValue();

            }else if(b.getValue()>=a.getValue() && b.getValue()>=c.getValue()){
                l=b.getValue();
            }else{
                l=c.getValue();
            }
            //System.out.println("high card logic CardDeck class:: "+l);
            return l;
     }
}


