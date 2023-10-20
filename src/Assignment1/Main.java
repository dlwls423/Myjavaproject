package Assignment1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Screen screen = new Screen();

        while (true){
            try{
                int channel = screen.mainScreen();
                if (channel == 0) {
                    screen.owner();
                } else if (channel >= 1 && channel <= 3) {
                    screen.sale(channel);
                } else if (channel == 4) {
                    screen.order();
                } else if (channel == 5) {
                    screen.set();
                }
            } catch (Exception e){
                System.out.println("잘못된 입력입니다!");
                break;
            }
        }
    }
}
