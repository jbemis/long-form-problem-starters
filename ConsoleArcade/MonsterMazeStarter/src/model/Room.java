package model;

import java.util.ArrayList;
import java.util.List;

public class Room extends Choice {

    private List<Choice> choices;
    private int id;

    public Room(int id) {
        super("Enter Room " + id + ".");
        this.id = id;
        choices = new ArrayList<>();
        choices.add(0, null); // better ui counting from 1
    }

//    //EFFECTS: prints a message representing this possible next choice
//    public void printOptionMessage() {
//        System.out.println(optionMessage);
//    }

    public void addChoice(Choice c) {
        choices.add(c);
    }

    public Choice getChoice(int i){ return choices.get(i); }


    //EFFECTS: prints all possible next choices
    public void printOutcome() {
        System.out.println("You are now in Room " + id + ".\n");
        System.out.println("You have the following options: ");

        for (int i=1; i<choices.size(); i++) {
            System.out.print("\tOption " + i + ": ");
            choices.get(i).printOptionMessage();
        }

    }

}
