package Assignment1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Screen screen = new Screen();

        while (true){
            screen.main();
            int channel = sc.nextInt();
            while (channel < 0 || channel > 5) {
                System.out.println("다시 입력해 주세요.");
                channel = sc.nextInt();
            }

            if(channel == 0){
                screen.owner();
            }

            else if(channel >=1 && channel <=3){
                screen.sale(channel);
            }

            else if(channel == 4){
                screen.order();
            }

            else if(channel == 5){
                screen.set();
            }
        }
    }
}
