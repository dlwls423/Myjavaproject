package Assignment1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Order.setTotal_sale();
        int wait=0;

        while (true){
            int channel = screen.main();

            if(channel == 0){
                screen.owner();
            }

            else if(channel >=1 && channel <=3){
                int item = screen.sale(channel);
                screen.putin(item);
            }

            else if(channel == 4){
                wait = screen.order(wait);
            }

            else if(channel == 5){
                screen.set();
            }
        }
    }
}
