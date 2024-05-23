public class Card {

    public int cardNum,suitNum,cardValue;  //card value is for points in Blackjack, cardNum is the num on card
    public String suitName, cardName;

    public  Card(int pCardNum, int pSuitNum){
        cardNum = pCardNum;
        suitNum = pSuitNum;
        if(suitNum==0){
            suitName = "Spades";
        }
        if(suitNum==1){
            suitName = "Hearts";
        }
        if(suitNum==2){
            suitName = "Clubs";
        }
        if(suitNum==3){
            suitName = "Diamonds";
        }

        if(cardNum>1&& cardNum<11){
            cardName = Integer.toString(cardNum);
        }
        if(cardNum==1){
            cardName = "Ace";
        }
        if(cardNum==11){
            cardName = "Jack";
        }
        if(cardNum==12){
            cardName = "Queen";
        }
        if(cardNum==13){
            cardName = "King";
        }
        //suit num 0=spade, 1=heart, 2=clubs, 3=diamonds
    }

    public void printInfo(){
        System.out.println(cardName+ " of " + suitName);
    }


}
