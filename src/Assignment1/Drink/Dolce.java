package Assignment1.Drink;

import Assignment1.Menu;

public class Dolce extends Menu {
    private char option;

    public Dolce(){
        super("돌체 라떼", 5900, "깊은 커피의 맛과 까끔한 우유와 돌체 시럽이 들어간 커피");
    }

    public char getOption(){
        return option;
    }

    public void setOption(char option){
        this.option = option;
    }
}
