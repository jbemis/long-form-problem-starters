package main;

import model.CoffeeMaker;
import exceptions.BeansAmountException;
import exceptions.NoCupsRemainingException;
import exceptions.StaleCoffeeException;
import exceptions.WaterException;

public class Main {

    public static void main(String[] args){
        // TODO: complete the implementation of Main
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.setTimeSinceLastBrew(90);
        try {
            coffeeMaker.pourCoffee();
        } catch (NoCupsRemainingException e) {
            System.out.println(e.getMessage());
        } catch (StaleCoffeeException e) {
            System.out.println(e.getMessage());
        }
        try {
            coffeeMaker.brew(2,14);
        } catch (BeansAmountException e) {
            System.out.println(e.getMessage());
        } catch (WaterException e) {
            System.out.println(e.getMessage());
        }

        try {
            coffeeMaker.brew(2.5, 17);
        } catch (BeansAmountException e) {
            System.out.println(e.getMessage());
        } catch (WaterException e) {
            System.out.println(e.getMessage());
        }
        try {
            coffeeMaker.pourCoffee();
        } catch (NoCupsRemainingException e) {
            System.out.println(e.getMessage());
        } catch (StaleCoffeeException e) {
            System.out.println(e.getMessage());
        }
        coffeeMaker.setTimeSinceLastBrew(90);

    }


}