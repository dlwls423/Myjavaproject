package Assignment1;

import Assignment1.Drink.*;
import Assignment1.Food.*;
import Assignment1.Goods.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Screen {
    int status = -1;
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
    Menu[][] menus = {{americano, cappuccino, dolce, latte}, {bagel, cake, croissant, scone}, {mug, glass, syrup, tumbler}};
    ArrayList<Order> orders = new ArrayList<>();
    ArrayList<Order> total_orders = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public int main(){
        if(Order.getTotal_num()==0) orders.clear();
        System.out.println("\"Starbucks에 오신걸 환영합니다.\"");
        System.out.println("원하시는 항목을 입력해주세요.");
        System.out.println();
        System.out.println("[ STARBUCKS MENU ]");
        System.out.println("1. 음료\t\t| 음료 화면으로 이동합니다.");
        System.out.println("2. 푸드\t\t| 푸드 화면으로 이동합니다.");
        System.out.println("3. 상품\t\t| 상품 화면으로 이동합니다.");
        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println("4. Order\t| 장바구니 확인 후 주문합니다. ");
        System.out.println("5. Cancel\t| 진행중인 주문을 취소합니다.");
        System.out.println();

        int channel = sc.nextInt();
        while (channel < 0 || channel > 5) {
            System.out.println("다시 입력해 주세요.");
            channel = sc.nextInt();
        }
        return channel;
    }

    public void owner(){
        System.out.println("[ 총 판매금액 현황 ]");
        System.out.println("현재까지 총 판매된 금액은 [ W " + Order.getTotal_sale() + " ] 입니다.");
        System.out.println();
        System.out.println("[ 총 판매상품 현황 ]");
        System.out.println("현재까지 총 판매된 상품 목록은 아래와 같습니다.");
        System.out.println();
        int sale_num = Order.getTotal_sale_num();
        for(int i=0;i<sale_num;i++){
            System.out.printf("- %-8s | W %-6d\n", total_orders.get(i).getName(), total_orders.get(i).getPrice());
            //System.out.println("- " + total_orders.get(i).getName() +"\t| W " + total_orders.get(i).getPrice());
        }
        System.out.println();
        System.out.println("1. 돌아가기");
        System.out.println();
        int check = sc.nextInt();
        while(check!=1){
            System.out.println("다시 입력해 주세요.");
            check = sc.nextInt();
        }
    }
    public int sale(int channel){
        status = channel;
        System.out.println("\"Starbucks에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        if(channel == 1) System.out.println("[ DRINKS ]");
        else if(channel == 2) System.out.println("[ FOODS ]");
        else System.out.println("[ GOODS ]");
        for(int i=0; i<4; i++) {
            System.out.println(i + 1 + ". " + menus[channel-1][i].getName() + "\t| W " + menus[channel-1][i].getPrice() + " | " + menus[channel-1][i].getExplain());
        }
        System.out.println();
        int item = sc.nextInt();
        while(item<=0 || item >=5){
            System.out.println("다시 입력해 주세요.");
            item = sc.nextInt();
        }
        return item;
    }
    public void putin(int item){
        System.out.println("\""+menus[status-1][item-1].getName()+"\t| W "+menus[status-1][item-1].getPrice()+" | " + menus[status-1][item-1].getExplain()+"\"");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인 \t2. 취소");
        int check = sc.nextInt();
        if(check == 1){
            System.out.println(menus[status-1][item-1].getName() + "가 장바구니에 추가되었습니다.");
            System.out.println();
            int flag = 0;
            if(Order.getTotal_num()!=0){
                for (Order order : orders) {
                    if (order.getName().equals(menus[status - 1][item - 1].getName())) {
                        order.setNum(order.getNum() + 1);
                        Order.setTotal_price(order.getPrice());
                        Order.setTotal_num();
                        flag = 1;
                        break;
                    }
                }
            }
            if(flag == 0){
                Order order = new Order(menus[status-1][item-1].getName(), menus[status-1][item-1].getPrice(), menus[status-1][item-1].getExplain());
                orders.add(order);
            }
        }
        else System.out.println("진행하던 주문이 취소되었습니다.");
    }

    public int order(int wait){
        int order_num = Order.getTotal_num();
        if(order_num == 0) System.out.println("장바구니가 비었습니다.");
        else{
            System.out.println("아래와 같이 주문하시겠습니까?");
            System.out.println();
            System.out.println("[ Orders ]");
            for (Order order : orders) {
                System.out.printf("%-8s | W %-6d | %-2d개 | %-25s\n", order.getName(), order.getPrice() * order.getNum(), order.getNum(), order.getExplain());
                //System.out.println(order.getName() + "\t | W " + order.getPrice() * order.getNum() + " | " + order.getNum() + "개 | " + order.getExplain());
            }
            System.out.println();
            System.out.println("[ Total ]");
            System.out.println("W " + Order.getTotal_price());
            System.out.println();
        }
        System.out.println("1. 주문\t2. 메뉴판");
        int pay = sc.nextInt();
        if(pay == 1 && Order.getTotal_num()==0){
            System.out.println("메뉴를 담아주세요.");
            pay = 3;
        }
        while(pay<=0 || pay >=3){
            System.out.println("다시 입력해 주세요.");
            pay = sc.nextInt();
        }
        if(pay==1&&Order.getTotal_num()!=0){
            wait++;
            System.out.println("주문이 완료되었습니다!");
            System.out.println();
            System.out.println("대기번호는 [ " + wait +" ] 번입니다.");
            System.out.println("(3초후 메뉴판으로 돌아갑니다.)");
            for (Order order : orders) {
                for (int j = 0; j < order.getNum(); j++) {
                    total_orders.add(order);
                }
            }
            Order.SetOrder(1);
            try{
                Thread.sleep(3000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        return wait;
    }

    public void set(){
        System.out.println("진행하던 주문을 취소하시겠습니까?");
        System.out.println("1. 확인\t2. 취소");
        int check = sc.nextInt();
        while(check<=0 || check >=3){
            System.out.println("다시 입력해 주세요.");
            check = sc.nextInt();
        }
        if(check == 1){
            Order.SetOrder(2);
            System.out.println("진행하던 주문이 취소되었습니다.");
            System.out.println();
        }
    }
}
