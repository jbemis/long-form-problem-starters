package model;

import exceptions.*;

/**
 * A coffee maker used to train baristas.
 *
 * Class invariant: cups remaining >= 0, time since last brew >= 0
 */

public class CoffeeMaker {

    private int cupsRemaining;
    private int timeSinceLastBrew;

    public CoffeeMaker(){
        this.cupsRemaining = 0;
        this.timeSinceLastBrew = 0;
    }

    // getters
    public int getTimeSinceLastBrew() {
        return timeSinceLastBrew;
    }
    public int getCupsRemaining() {
        return cupsRemaining;
    }

    // EFFECTS: return true if there are coffee cups remaining
    public boolean areCupsRemaining() {
        if (cupsRemaining > 0){
            return true;
        } else {
            return false;
        }
    }

    //REQUIRES: a non-negative integer
    //EFFECTS: sets time since last brew
    public void setTimeSinceLastBrew(int time) {
        this.timeSinceLastBrew = time;
    }

    //EFFECTS: sets cups remaining to full (20 cups) and time since last brew to 0,
    //         throws exception if toomanybeans, notenoughbeans, or water exception
    public void brew(double beans, double water) throws BeansAmountException, WaterException {
        if (beans > 2.60) {
            throw new TooManyBeansException(beans);
        } else if (beans < 2.40) {
            throw new NotEnoughBeansException(beans);
        }
        if (water <= 14.75) {
            throw new WaterException(water);
        }
        System.out.println("Get it while its hot!");
        this.cupsRemaining = 20;
        this.timeSinceLastBrew = 0;

    }


    //MODIFIES: this
    //EFFECTS: subtracts one cup from cups remaining, throws exception if no cups remaining or stalecoffee
    public void pourCoffee() throws NoCupsRemainingException, StaleCoffeeException {
        if (this.cupsRemaining == 0) {
            throw new NoCupsRemainingException();
        }
        if (this.timeSinceLastBrew > 60) {
            throw new StaleCoffeeException(timeSinceLastBrew);
        }
        cupsRemaining--;
        System.out.println("Nothing like a hot cup of joe.");
    }


}
