package week04.Generic;

public class Generic<T> {
    private T t;
    public T get() {
        return this.t;
    }
    public void set(T t){
        this.t = t;
    }

    public static void main(String[] args) {
        Generic<String> stringGeneric = new Generic<>();

        stringGeneric.set("Hello world");

        String tValueTurnOutwithString = stringGeneric.get();

        System.out.println(tValueTurnOutwithString);
    }
}
