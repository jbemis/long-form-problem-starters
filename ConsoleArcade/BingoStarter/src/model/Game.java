package model;

import model.observer_pattern.Subject;
import model.random.BingoNumber;

import java.util.ArrayList;
import java.util.List;

public class Game extends Subject {

    public static final int CARD_SIZE = 25;
    public static final int SIDE_LENGTH = (int) Math.sqrt(CARD_SIZE);

    private BingoNumber currentCall;
    private boolean gameOver;

    public Game() {
        super();
        callNext();
    }

    @Override
    public void notifyObservers() {
        for (PlayerCard playerCard : observers) {
            playerCard.update(currentCall);
        }
    }

    //getters
    public BingoNumber getCurrentCall(){
        return currentCall;
    }

    public boolean isGameOver(){
        return gameOver;
    }

    public List<PlayerCard> getCards() {
        List<PlayerCard> playerCards = new ArrayList<>();
        for (PlayerCard pc : observers) { //NOTE: refactor this line ONLY.
            if (pc.getClass().getSimpleName().equals("PlayerCard"))
                playerCards.add((PlayerCard) pc);
        }
        return playerCards;
    }

    //TODO: refactor this method
    //EFFECTS: generates the next bingo call and notifies observers
    public void callNext() {
        currentCall = new BingoNumber();
        notifyObservers();
        refreshGameOver();
    }

    //TODO: refactor this method
    //MODIFIES: this
    //EFFECTS: adds observer to list of observers
    public void addCard(PlayerCard pc) {
        if(!observers.contains(pc)) {
            observers.add(pc);
        }
    }

    //EFFECTS: sets game over to true if one of the players has bingo
    public void refreshGameOver(){
        for (PlayerCard pc : observers) {
            PlayerCard p = (PlayerCard) pc;
            if (p.hasBingo()) {
                gameOver = true;
                break;
            }
        }
    }
}
