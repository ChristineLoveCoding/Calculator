package edu.csc413.calculator.evaluator;

/**
 * Operand class used to represent an operand
 * in a valid mathematical expression.
 */
public class Operand {
    private int data;

    /**
     * construct operand from string token.
     */
    public Operand(String token) {
        this.data = Integer.parseInt(token);
    }

    /**
     * construct operand from integer
     */
    public Operand(int value) {
        this.data= value;

    }

    /**
     * return value of operand
     */
    public int getValue() {
        return data;
    }

    /**
     * Check to see if given token is a valid
     * operand.
     */
    public static boolean check(String token) {
        boolean amIValid = false;
        try {
            Integer.parseInt(token);
            // s is a valid integer!
            amIValid = true;
            return amIValid;
        } catch (NumberFormatException e) {
            //sorry, not an integer
            return false;// we just move on, but you could have code here
        }

    }


}

