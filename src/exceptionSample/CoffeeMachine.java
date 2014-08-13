package exceptionSample;

public class CoffeeMachine {
    private int numOfCoffee;
    private double waterQuantity;
    private double milkQuantity;

    public int getNumOfCoffee() {
        return numOfCoffee;
    }

    public void setNumOfCoffee(int numOfCoffee) {
        this.numOfCoffee = numOfCoffee;
    }

    public double getWaterQuantity() {
        return waterQuantity;
    }

    public void setWaterQuantity(double waterQuantity) {
        this.waterQuantity = waterQuantity;
    }

    public double getMilkQuantity() {
        return milkQuantity;
    }

    public void setMilkQuantity(double milkQuantity) {
        this.milkQuantity = milkQuantity;
    }

    public void makeCappuccino() throws CoffeeMachineException {
        if (waterQuantity < 0.2) {
            throw new CoffeeMachineException(-1);
        } else if (numOfCoffee < 1) {
            throw new CoffeeMachineException(-2);
        } else if (milkQuantity <= 0.05) {
            throw new CoffeeMachineException(-3);
        } else {
            --numOfCoffee;
            this.waterQuantity = waterQuantity - 0.2;
            this.milkQuantity = milkQuantity - 0.05;
            System.out.println("Take your Cappuccino, please!");
        }
    }

    public void makeEspresso() throws CoffeeMachineException {
        if (waterQuantity < 0.1) {
            throw new CoffeeMachineException(-1);
        } else if (numOfCoffee < 1) {
            throw new CoffeeMachineException(-2);
        } else {
            --numOfCoffee;
            this.waterQuantity = waterQuantity - 0.1;
            System.out.println("Take your Espresso, please!");
        }
    }
}

