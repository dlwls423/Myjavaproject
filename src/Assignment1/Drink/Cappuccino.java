package Assignment1.Drink;

import Assignment1.Menu;

public class Cappuccino extends Menu {
    private char option;

    public Cappuccino(){
        super("카푸치노", 5000, "에스프레소와 우유 거품이 1:1로 어우러진 커피");
    }

    public char getOption(){
        return option;
    }


    public void setOption(char option){
        this.option = option;
    }

}
