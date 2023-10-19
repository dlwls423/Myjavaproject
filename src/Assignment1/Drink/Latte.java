package Assignment1.Drink;

import Assignment1.Menu;

public class Latte extends Menu {
    private char option;

    public Latte(){
        super("카페 라떼", 5000, "에스프레소가 우유와 만나 고소함을 즐길 수 있는 커피");
    }

    public char getOption(){
        return option;
    }

    public void setOption(char option){
        this.option = option;
    }

}
