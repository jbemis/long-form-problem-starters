package test;

import org.junit.Before;
import org.junit.Test;
import model.CoffeeMaker;
import exceptions.BeansAmountException;
import exceptions.NoCupsRemainingException;
import exceptions.StaleCoffeeException;
import exceptions.WaterException;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;


public class CoffeeMakerTest {

    private CoffeeMaker coffeeMaker;

    @Before
    public void setUp(){
        coffeeMaker = new CoffeeMaker();
    }

    @Test (expected = NoCupsRemainingException.class)
    public void testNoCupsNotStale() throws NoCupsRemainingException, StaleCoffeeException {
        //expecting NoCups exception to be thrown
        // and for cupsRemaining to be 0
        coffeeMaker.pourCoffee();
    }

    @Test (expected = StaleCoffeeException.class)
    public void testCupsStale() throws BeansAmountException, WaterException, NoCupsRemainingException, StaleCoffeeException {
        // expecting StaleCoffee exception to be thrown,
        // and for TimeSinceLastBrew > 60
        coffeeMaker.brew(2.5, 25);
        coffeeMaker.setTimeSinceLastBrew(90);
        coffeeMaker.pourCoffee();
    }


    @Test (expected = BeansAmountException.class)
    public void testTooManyBeansRightWater() throws BeansAmountException, WaterException {
        // expecting tooManyBeans exception
        coffeeMaker.brew(100, 20);


    }

    @Test (expected = BeansAmountException.class)
    public void testNotEnoughBeansRightWater() throws BeansAmountException, WaterException {
        //expecting not enogh beans exception
        coffeeMaker.brew(100, 16);
    }

    @Test (expected = WaterException.class)
    public void testRightBeansWrongWater() throws BeansAmountException, WaterException {
        //expecting not enough water exception
        coffeeMaker.brew(2.5, 1);

        }


}
