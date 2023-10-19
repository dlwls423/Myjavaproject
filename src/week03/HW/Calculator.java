package week03.HW;
public class Calculator {
    AbstractOperation operation;

    Calculator(AbstractOperation operation){
        this.operation = operation;
    }

    void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }
    double calculate(int firstNumber, int secondNumber){
        double result=0;
        result = operation.operate(firstNumber, secondNumber);
        return result;
    }
}
