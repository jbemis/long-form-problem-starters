package model.observer_pattern;

import model.PlayerCard;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    protected List<PlayerCard> observers;

    public Subject(){
        observers = new ArrayList<>();
    }

    public List<PlayerCard> getObservers() {
        return observers;
    }

    //MODIFIES: this
    //EFFECTS: adds observer to list of observers
    public void addObserver(PlayerCard pc) {
        observers.add(pc);
    }

    //EFFECTS: notifies observers of state change
    public abstract void notifyObservers();

}
