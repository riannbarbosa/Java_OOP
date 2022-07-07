package fdeck;

import java.util.*;
public class Deck  {

    private static ArrayList<Card> newDeck;
    private static ArrayList<Card> shuffledDeck;

    public Deck(){

        this.newDeck = new ArrayList<Card>();
        this.shuffledDeck = new ArrayList<Card>();
    }

    // metodo para criar o baralho
    public void createDeck(){
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                Card card = new Card(r, s);
                this.newDeck.add(card);
            }

        }
        Iterator cardIt = this.newDeck.iterator();
        while(cardIt.hasNext()){
            Card aCard = (Card) cardIt.next();
            System.out.println(aCard.getRank() + " of " + aCard.getSuit());
        }

    }

    // metodo para embaralhar
    public void shuffle()  {

        // Tratamamento de excecao
        if(this.newDeck.size() == 0) throw new ArrayIndexOutOfBoundsException("You must first create a Deck!");

        while (this.newDeck.size() > 0) {
            int index = (int) (Math.random() * this.newDeck.size());
            shuffledDeck.add(this.newDeck.get(index));
            this.newDeck.remove(index);
        }
      //  Collections.shuffle(this.newDeck);

        Iterator cardIt2 = shuffledDeck.iterator();
        System.out.println("\n----- SHUFFLED -----\n");
        while(cardIt2.hasNext()){

            Card bCard = (Card) cardIt2.next();


            System.out.println(bCard.getRank() + " of " + bCard.getSuit());

        }


    }
    // metodo para remover uma carta do baralho
    public void removeCard(int n){



        if (this.newDeck.size() > 0){

                    for(int i=0; i<n; i++) {
                        this.newDeck.remove(i * n);

                    }
            System.out.println(n + " Card(s) was removed from your unshuffled deck!, you now have " + this.newDeck.size() + " Cards in you deck!");

        }


        else if(shuffledDeck.size() > 0 && this.newDeck.size()==0 ){
            for(int i=0; i<n; i++) {
                shuffledDeck.remove(i * n);

            }
            System.out.println(n + " Card(s) was removed from your shuffled deck!, you now have " + shuffledDeck.size() + " Cards in you deck!");
            // Tratamamento de excecao
            if(shuffledDeck.size() == 0) throw new ArrayIndexOutOfBoundsException("You must first create a Deck!");

        }
        // Tratamamento de excecao
        else  if(this.newDeck.size() == 0) throw new ArrayIndexOutOfBoundsException("You don't have a deck!");









    }




}




