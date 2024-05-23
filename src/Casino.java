public class Casino {
    //declaration section
    public Card aceHearts;
    public Card[] Deck;
    public int counter;
    public Card parkingLot;
    public Card firstCard = ((int)Math.random())*52;

    public static void main(String[] args) {
        Casino vegas = new Casino();
        System.out.println("welcome to vegas");
    }


    public Casino() {
        //aceHearts = new Card(1,1);
        //aceHearts.printInfo();


        Deck = new Card[52];
        for (int k = 0; k < 4; k++) {//outer loop changes suitNum
            for (int i = 1; i < 14; i++) {//inner loop changes cardNum
                Deck[counter] = new Card(i, k);
                counter = counter + 1;
            }
        }
        System.out.println("our og deck is below");
        for (int x = 0; x < 51; x++) {
            Deck[x].printInfo();

        }

        System.out.println("our new deck is below");
        shuffle();
        for (int x = 0; x < 52; x++) {
            Deck[x].printInfo();
        }

    }
    public void shuffle(){
        //can you switch deck[0] and deck[1]?
        //so deck[0] after shuffling is a 2 of spades
        parkingLot = Deck[0];
        Deck[0]= Deck[1];
        Deck[1] = parkingLot;
        //how i can do this 52 times
        for(int x = 0; x < 52; x++){
            parkingLot = Deck[firstCard];
            Deck[firstCard]= Deck[x];
            Deck[firstCard] = parkingLot;

        }
    }
}
