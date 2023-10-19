package Assignment1.Drink;

import Assignment1.Menu;

public class Americano extends Menu {
    private char option;

    public Americano(){
        super("아메리카노", 4500, "깔끔하고 강렬한 에스프레소를 느낄 수 있는 커피");
    }

    public char getOption(){
        return option;
    }

    public void setOption(char option){
        this.option = option;
    }

}
