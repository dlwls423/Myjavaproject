package Assignment1;

import Assignment1.Drink.*;
import Assignment1.Food.*;
import Assignment1.Goods.*;
import java.util.ArrayList;

public class Order {
    Americano americano = new Americano();
    Cappuccino cappuccino = new Cappuccino();
    Dolce dolce = new Dolce();
    Latte latte = new Latte();
    Bagel bagel = new Bagel();
    Cake cake = new Cake();
    Croissant croissant = new Croissant();
    Scone scone = new Scone();
    Mug mug = new Mug();
    Glass glass = new Glass();
    Syrup syrup = new Syrup();
    Tumbler tumbler = new Tumbler();
    private Menu[][] menus = {{americano, cappuccino, dolce, latte}, {bagel, cake, croissant, scone}, {mug, glass, syrup, tumbler}};
    private ArrayList<Menu> orders = new ArrayList<>();
    private ArrayList<Menu> total_orders = new ArrayList<>();
    private static int total_sale = 0; //판매한 총 가격
    private static int total_price = 0; //SetOrder를 만나기 전까지의 주문 개수와 가격 합
    private static int total_num = 0;

    public Menu getMenus(int i, int j){
        return menus[i][j];
    }
    public Menu getOrders(int index){
        return orders.get(index);
    }
    public void addOrders(Menu menu){
        if(orders.contains(menu)){
            menu.setNum(menu.getNum()+1);
        }
        else{
            orders.add(menu);
            menu.setNum(1);
        }
        total_price += menu.getPrice();
        total_num++;
    }
    public Menu getTotal_orders(int index){
        return total_orders.get(index);
    }
    public void addTotal_orders(Menu menu){
        total_orders.add(menu);
        total_sale += menu.getPrice();
        menu.setNum(1);
    }
    public void clearOrders(){
        orders.clear();
    }
    public int getOrdersSize(){
        return orders.size();
    }
    public int getTotal_ordersSize(){
        return total_orders.size();
    }

    public static int getTotal_price(){
        return total_price;
    }
    public static int getTotal_sale(){
        return total_sale;
    }
    public static void setTotal_sale() {
        total_sale = 0;
    }
    public static int getTotal_num(){
        return total_num;
    }

    public void finishOrder(){
        for(Menu menu : orders){
            int num = menu.getNum();
            for(int i=0;i<num;i++){
                addTotal_orders(menu);
            }
        }
    }

    public static void SetOrder(){
        total_price = 0;
        total_num = 0;
    }
}
