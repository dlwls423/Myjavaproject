package week02;

import java.util.Stack;

public class Col3 {
    public static void main(String[] args) {
        // Stack
        Stack<Integer> intStack = new Stack<Integer>();

        intStack.push(10);
        intStack.push(20);
        intStack.push(30);

        while(!intStack.isEmpty()){
            System.out.println(intStack.pop());
        }

        intStack.push(10);
        intStack.push(20);
        intStack.push(30);

        System.out.println(intStack.peek());
        System.out.println(intStack.size());

    }
}
