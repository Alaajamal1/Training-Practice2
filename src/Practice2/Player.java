package Practice2;

import java.util.ArrayList;

public class Player {
    String name;
    int score;
    public ArrayList<Card> cards=new ArrayList<>();
    
    public Player(String nam) {
        name = nam;     
    }
    
    public void printCard() {
        System.out.println(name + " Cards:");
        for (Card card : cards) {
            System.out.println(card);
        }
    }
}
