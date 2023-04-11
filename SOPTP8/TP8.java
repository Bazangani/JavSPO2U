/*This Java exercise is about implementing classes to generate mathematical formulas. Each class corresponds to a type of formula, such as constants, variables, addition, multiplication, and so on.

The classes will implement the Formula interface, which has three methods:

 -eval(double xValue): This method computes the value of the formula given a value for the variable x.

 -toString(): This method computes a string representation of the formula.

- derivative(): This method computes the derivative of the formula.

Therefore, each class implementing the Formula interface will have three functionalities:

Computing the value of the formula given a value for the variable x using the eval method.

Computing a string representation of the formula using the toString method.

Computing the derivative of the formula as another formula using the derivative method.


1.3

The task at hand is to correct a class called "Constant," which represents a constant value in mathematical formulas.
This class implements the Formula interface and has the following methods:

A public constructor Constant(double value) that creates a constant with a certain value.

A public method double eval(double xValue) that always returns the value of the constant.

A public method String toString() that returns the string representation of the constant.

A public method Formula derivative() that returns a formula representing the derivative of the constant. (Note that for any function f(x) = c with c being a constant, the derivative of the function is the constant function defined by f'(x) = 0).

The goal is to implement these methods correctly so that the Constant class passes the tests in the ConstantTest class*/

public class VariableX implements Formula {
    public VariableX() {
        // Constructor
    }
    
    public double eval(double xValue) {
        return xValue;
    }
    
    public String toString() {
        return "x";
    }
    
    public Formula derivative() {
        // The derivative of x is 1
        return new Constant(1);
    }


    public class Addition implements Formula {
    private Formula leftMember;
    private Formula rightMember;
    
    public Addition(Formula leftMember, Formula rightMember) {
        this.leftMember = leftMember;
        this.rightMember = rightMember;
    }
    
    public double eval(double xValue) {
        return leftMember.eval(xValue) + rightMember.eval(xValue);
    }
    
    public String toString() {
        return leftMember.toString() + " + " + rightMember.toString();
    }
    
    public Formula derivative() {
        return new Addition(leftMember.derivative(), rightMember.derivative());
    }
}

}
