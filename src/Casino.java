public class Casino {
    //declaration section
    public Card aceHearts;
    public Card[] Deck;
    public int counter;
    public Card parkingLot;
    public Player Dealer;
    public int randInt;
    public Player[] players;
    public int dealCounter =2;


    public static void main(String[] args) {
        Casino vegas = new Casino();
        System.out.println("welcome to vegas");
    }


    public Casino() {
        //aceHearts = new Card(1,1);
        //aceHearts.printInfo();


        Dealer = new Player(0);

        Deck = new Card[52];
        players = new Player[3];
        for (int k = 0; k < 4; k++) {//outer loop changes suitNum
            for (int i = 1; i < 14; i++) {//inner loop changes cardNum
                Deck[counter] = new Card(i, k);
                counter = counter + 1;
            }
        }
        System.out.println("our og deck is below");
        for (int x = 0; x < 52; x++) {
            Deck[x].printInfo();

        }
        System.out.println("Our New Deck Is Below");

        shuffle();

        for (int x = 0; x < 52; x++) {
            Deck[x].printInfo();
        }


        for(int z=0;z<3;z++){
            players[z] = new Player(z+1);
        }
        deal();
        Dealer.printInfo();
        players[2].printInfo();


        for(int i=0;i<3;i++){
            players[i].printInfo();
        }


    }
    public void shuffle(){
        //can you switch deck[0] and deck[1]?
        //so deck[0] after shuffling is a 2 of spades
        parkingLot = Deck[0];
        Deck[0]= Deck[1];
        Deck[1] = parkingLot;
        for(int x = 0; x < 52; x++){
            randInt = (int)(Math.random()*(52));
            parkingLot = Deck[x];
            Deck[x]= Deck[randInt];
            Deck[randInt] = parkingLot;
        }
    }

    public void deal(){
        //deal two cards to the dealer
        Dealer.hand[0] = Deck[0];
        Dealer.hand[1] = Deck[1];


        for(int x=0;x<players.length;x++){
            for(int y=0;y<players[x].hand.length;y++){
                players[x].hand[y] = Deck[dealCounter];
                dealCounter = dealCounter+1;
            }
        }
    }


}
