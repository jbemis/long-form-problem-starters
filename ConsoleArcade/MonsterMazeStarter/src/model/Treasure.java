package model;

public class Treasure extends Choice{

    protected  int prize;
    protected String optionMessage;

    public Treasure(int prize) {
        super("Claim your treasure!");
        this.prize = prize;
    }

//    //EFFECTS: prints a message representing this possible next choice
//    public void printOptionMessage() {
//        System.out.println(optionMessage);
//    }

    //EFFECTS: prints the result of choosing this choice
    @Override
    public void printOutcome() {
        System.out.println("Your prize is " + prize + " spendibees.");
    }

}
