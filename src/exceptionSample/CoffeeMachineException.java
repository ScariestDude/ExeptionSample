package exceptionSample;

public class CoffeeMachineException extends Exception {
    private int errorCode;

    CoffeeMachineException(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getMassage() {
        String massage;
        if (errorCode == -1) {
            massage = "PLEASE, ADD WATER!";
        } else if (errorCode == -2) {
            massage = "PLEASE, ADD COFFEE!";
        } else if (errorCode == -3) {
            massage = "PLEASE, ADD MILK!";
        } else {
            massage = "UNKNOWN EXCEPTION!";
        }
        return massage;
    }
}
