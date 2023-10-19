package Assignment1;

import Assignment1.Drink.*;
import Assignment1.Food.*;
import Assignment1.Goods.*;

public class Order extends Menu {
    private static int total_sale = 0;
    private static int total_sale_num = 0;
    private static int total_price = 0;
    private static int total_num = 0;
    private int num;

    public Order(String name, int price, String explain){
        super(name, price, explain);
        num=1;
        total_num++;         //SetOrder를 만나기 전까지의 주문 개수와 가격 합
        total_price += price;
    }
    public static int getTotal_price(){
        return total_price;
    }
    public static void setTotal_price(int price) {total_price += price;}
    public static int getTotal_sale_num() { return total_sale_num; }
    public static int getTotal_sale(){
        return total_sale;
    }
    public static int getTotal_num(){
        return total_num;
    }
    public static void setTotal_num() {total_num++;}
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }

    public static void SetOrder(int version){
        if(version==1){ //주문 내용 반영됨
            total_sale += total_price;
            total_sale_num += total_num;
        }
        total_price = 0;
        total_num = 0;
    }
}
