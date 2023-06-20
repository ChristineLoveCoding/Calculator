package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class PowerOperator extends Operator {
    @Override
    public int priority() {
        return 3;
    }

    @Override
    public Operand execute(Operand operandOne, Operand operandTwo) {
        int a = operandOne.getValue();
        int b = operandTwo.getValue();
        Operand operandThree = new Operand((int)Math.pow(a,b));
        //2^3

        return operandThree;
    }
}
