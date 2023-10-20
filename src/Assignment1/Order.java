package Assignment1;

import java.util.ArrayList;

public class Order {
    private int num;
    private int size; //없으면 0-drinkOrNot으로 판단, Tall이면 0, Grande이면 1, Venti이면 2
    private int final_price;
    private Product product;

    public Order(Product product, int num, int size) {
        this.product = product;
        this.num = num;
        this.size = size;
        this.final_price = product.getPrice()+500*size;
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

    public int getFinal_price(){
        return final_price;
    }

    public Product getProduct(){
        return product;
    }
}




