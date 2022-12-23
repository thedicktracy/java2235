package com.cis2235.cabrerap7rev3;

public class ThreeCardBrag {
    int x;
    int y;
    int z;
    static int i;
    static int j;
    static int k;
    static int l;
    static int m;
    static int o;
    static int w;
    public ThreeCardBrag(int x, int y, int z) {
    }
    //private static Card hand3[] = new Card[2];
    //private static Card hand4[] = new Card[2];
    static ThreeCardBrag hand1;
    static ThreeCardBrag hand2;
    //private static Card cardDeck[] = new Card[54];

   public void ThreeCardBrag(int x, int y, int z ) {

       this.x=x;
       this.y=y;
       this.z=z;
       //Card[] array;
       //i = new Card[x];
       //return i;
       //CardDeck.resetDeck();
       ///cardDeck=CardDeck.returnCard();
       //hand1[0]= cardDeck[x];
       //hand1[1]=cardDeck[y];
       //hand1[2]=cardDeck[z];
       //return hand1.clone();
   }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }


    public static int whoWon(){
        hand1 = HelloController.hand1();
        hand2 = HelloController.hand2();
        i=hand1.getX();j=hand1.getY();k=hand1.getZ();l=hand2.getX();m=hand2.getY();o=hand2.getZ();
        //System.out.println(i);System.out.println(j);System.out.println(k);
        //System.out.println("ths is L:: "+l);System.out.println("ths is M:: "+m);System.out.println("ths is O:: "+o);
        //System.out.println("handone pair [3CB] logic:: "+CardDeck.pair(i,j,k));
        //System.out.println("handtwo pair [3CB] logic:: "+CardDeck.pair(l,m,o));
        ////##########three of a kind
        if(CardDeck.threeofakind(i,j,k)==1 && CardDeck.threeofakind(l,m,o)==0){
            w=1;return w;}
        else if(CardDeck.threeofakind(l,m,o)==1 && CardDeck.threeofakind(i,j,k)==0){
            w=0; return w;}
        else if(CardDeck.threeofakind(i,j,k)== 1 && CardDeck.threeofakind(l,m,o)==1){
            if(CardDeck.high(i,j,k) > CardDeck.high(l,m,o)){//if this happens go get a lottery ticket
                w=1;return w;}
            else{
                w=0;return w;
            }}
        if(CardDeck.flush(i,j,k)==1 && CardDeck.flush(l,m,o)==0 && CardDeck.straight(i,j,k)==1){////##########check for a straight flush
            w=1;return w;
        }else if(CardDeck.flush(i,j,k)==0 && CardDeck.flush(l,m,o)==1 && CardDeck.straight(l,m,o)==1){
            w=0;return w;
        }else if(CardDeck.flush(i,j,k)==1 && CardDeck.flush(l,m,o)==1 && CardDeck.straight(i,j,k)==1 && CardDeck.straight(l,m,o)==1){
            if(CardDeck.high(i,j,k) > CardDeck.high(l,m,o)){
                w=1;return w;}
            else if(CardDeck.high(i,j,k) < CardDeck.high(l,m,o)){
                w=0;return w;}
            else if(CardDeck.high(i,j,k) == CardDeck.high(l,m,o)){
                w=-1;return w;}}
            //else{
              //  System.out.println("Broken logic;debug;");}}
        if(CardDeck.straight(i,j,k)==1 && CardDeck.straight(l,m,o)==0){////##############check for a straight
            System.out.println("straightlogic");
            w=1;return w;}
        else if(CardDeck.straight(i,j,k)==0 && CardDeck.straight(l,m,o)==1){
            System.out.println("straightlogic");
            w=0;return w;}
        else if(CardDeck.straight(i,j,k)==1 && CardDeck.straight(l,m,o)==1){
            if(CardDeck.high(i,j,k) > CardDeck.high(l,m,o)){
                w=1;System.out.println("straightlogic");return w;}
            else if(CardDeck.high(i,j,k) < CardDeck.high(l,m,o)){
                w=0;System.out.println("straightlogic");return w;}
            else{w=-1;System.out.println("straightlogic");return w;//tie
            }}
        if(CardDeck.flush(i,j,k)==1 && CardDeck.flush(l,m,o)==0){////###############check for a flush
                w=1;System.out.println("flushlogic");return w;}
        else if(CardDeck.flush(i,j,k)==0 && CardDeck.flush(l,m,o)==1){
                w=0;System.out.println("flushlogic");return w;}
        else if(CardDeck.flush(i,j,k)==1 && CardDeck.flush(l,m,o)==1){
            if(CardDeck.high(i,j,k) > CardDeck.high(l,m,o)){
                    w=1;System.out.println("flushlogic");return w;}
            else if(CardDeck.high(i,j,k) < CardDeck.high(l,m,o)){
                    w=0;System.out.println("flushlogic");return w;}
            else{w=-1;System.out.println("flushlogic");return w;}}
        if(CardDeck.pair(i,j,k)==1 && CardDeck.pair(l,m,o)==0){////############check for a pair
            w=1;System.out.println("PAIRLOGIC");return w;}
        else if(CardDeck.pair(i,j,k)==0 && CardDeck.pair(l,m,o)==1){
            w=0;System.out.println("PAIRLOGIC");return w;}
        else if(CardDeck.pair(i,j,k)==1 && CardDeck.pair(l,m,o)==1){
            if(CardDeck.high(i,j,k) > CardDeck.high(l,m,o)){
                w=1;System.out.println("bothPAIRLOGIC");return w;}
            else if(CardDeck.high(i,j,k) < CardDeck.high(l,m,o)){
                w=0;System.out.println("bothPAIRLOGIC");return w;}
            else{w=-1;System.out.println("bothPAIRLOGIC");return w;}}
        if(CardDeck.high(i,j,k) > CardDeck.high(l,m,o)){//////###########check for high card
            w=1;System.out.println("HCL i:"+i+" j: "+j+" k: "+ k);System.out.println("L:"+l+" M: "+m+" O: "+ o);return w;}
        else if(CardDeck.high(i,j,k) < CardDeck.high(l,m,o)){
            w=0;System.out.println("HCL i:"+i+" j: "+j+" k: "+ k);System.out.println("L:"+l+" M: "+m+" O: "+ o);return w;}
        else if(CardDeck.high(i,j,k) == CardDeck.high(l,m,o)){w=-1;return w;}
        else{return w=-1;}
    }
    public int getWinningHand(){
        //4 cases

        return 1;
    }
}
