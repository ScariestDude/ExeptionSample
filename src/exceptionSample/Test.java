package exceptionSample;

public class Test {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.setNumOfCoffee(6);
        coffeeMachine.setWaterQuantity(2);
        coffeeMachine.setMilkQuantity(0.2);

        for (int i = 0; i < 10; i++) {
            try {
                coffeeMachine.makeCappuccino();
            } catch (CoffeeMachineException e) {
                System.out.println(e.getMassage());
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            try {
                coffeeMachine.makeEspresso();
            } catch (CoffeeMachineException e) {
                System.out.println(e.getMassage());
                break;
            }
        }
    }
}