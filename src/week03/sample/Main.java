package week03.sample;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getNumber());
        System.out.println(main.getNumber());
    }

    public int getNumber() {
        //지역변수
        int number = 1;
        number += 1;
        return number;
    }
}
