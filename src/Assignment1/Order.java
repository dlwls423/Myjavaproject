package Assignment1;

import java.util.ArrayList;

public class Order {
    private int num;
    private int size; //없으면 0-drinkOrNot으로 판단, Tall이면 0, Grande이면 1, Venti이면 2
    private Product product;

    public Order(Product product, int num, int size) {
        this.product = product;
        this.num = num;
        this.size = size;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }

    public Product getProduct(){
        return product;
    }
}




