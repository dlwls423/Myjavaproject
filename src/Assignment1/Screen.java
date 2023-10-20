package Assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Screen {
    Scanner sc = new Scanner(System.in);
    Product americano = new Product("아메리카노", "깔끔하고 강렬한 에스프레소를 느낄 수 있는 커피", 4500, true);
    Product cappuccino = new Product("카푸치노", "에스프레소와 우유 거품이 1:1로 어우러진 커피", 5000, true);
    Product dolce = new Product("돌체 라떼", "깊은 커피의 맛과 까끔한 우유와 돌체 시럽이 들어간 커피", 5900, true);
    Product latte = new Product("카페 라떼", "에스프레소가 우유와 만나 고소함을 즐길 수 있는 커피", 5000, true);
    Product bagel = new Product("크림치즈 베이글", "크림치즈와 포테이토를 샌드한 베이글", 5300, false);
    Product cake = new Product("초콜릿 케이크", "초콜릿 케이크 시트에 진한 가나슈 생크림을 넣은 케이크", 5900, false);
    Product croissant = new Product("카라멜 크루아상", "솔티드 카라멜과 피넛크림이 들어간 크루아상", 7900, false);
    Product scone = new Product("클래식 스콘", "프랑스산 고급 버터로 만든 담백한 스콘", 3300, false);
    Product glass = new Product("사이렌 클라스", "그린 컬러에 사이렌 로고를 더한 500ml 글라스", 10000, false);
    Product mug = new Product("사이렌 머그", "크림 컬러에 사이렌 로고가 매치된 355ml 머그", 14000, false);
    Product syrup = new Product("바닐라 시럽", "홈카페를 즐길 수 있는 280ml 스타벅스 바닐라 시럽", 10000, false);
    Product tumbler = new Product("크림 텀블러", "크림 컬러와 심플한 디자인의 414ml 스테인리스 텀블러", 24000, false);
    ArrayList<Product> drinks = new ArrayList<>();
    ArrayList<Product> foods = new ArrayList<>();
    ArrayList<Product> goods = new ArrayList<>();
    ArrayList<Product>[] menus = new ArrayList[3];
    ArrayList<Order> bucket = new ArrayList<>(); //장바구니 주문 목록
    ArrayList<Order> total_orders = new ArrayList<>(); // 총 주문 목록
    String[] sizeName = {"Tall", "Grande", "Venti"};
    int total_sale;
    int total_price;
    int wait;
    public Screen(){
        total_sale = 0;
        wait = 0;
        drinks.add(americano);
        drinks.add(cappuccino);
        drinks.add(latte);
        drinks.add(dolce);
        foods.add(bagel);
        foods.add(cake);
        foods.add(croissant);
        foods.add(scone);
        goods.add(glass);
        goods.add(mug);
        goods.add(syrup);
        goods.add(tumbler);
        menus[0] = drinks;
        menus[1] = foods;
        menus[2] = goods;
    }
    public void main(){
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
    }

    public void owner(){
        System.out.println("[ 총 판매금액 현황 ]");
        System.out.println("현재까지 총 판매된 금액은 [ W " + total_sale + " ] 입니다.");
        System.out.println();
        System.out.println("[ 총 판매상품 현황 ]");
        System.out.println("현재까지 총 판매된 상품 목록은 아래와 같습니다.");
        System.out.println();
        for (Order totalOrder : total_orders) {
            Product product = totalOrder.getProduct();
            for(int i=0;i<totalOrder.getNum();i++)
                System.out.printf("- %-3s(%-3s) | W %-6d\n", product.getName(), sizeName[totalOrder.getSize()], product.getPrice()+500*totalOrder.getSize());
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
    public void sale(int channel){
        System.out.println("\"Starbucks에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        if(channel == 1) System.out.println("[ DRINKS ]");
        else if(channel == 2) System.out.println("[ FOODS ]");
        else System.out.println("[ GOODS ]");
        for(int i=0; i<4; i++) {
            Product product = menus[channel-1].get(i); //해당하는 카테고리의 상품 종류
            System.out.println(i + 1 + ". " + product.getName() + "\t| W " + product.getPrice() + " | " + product.getDescription());
        }
        System.out.println();
        int item = sc.nextInt();
        while(item<=0 || item >=5){
            System.out.println("다시 입력해 주세요.");
            item = sc.nextInt();
        }
        Product product = menus[channel - 1].get(item-1); //선택한 상품
        System.out.println("\""+product.getName()+"\t| W "+product.getPrice()+" | " + product.getDescription()+"\"");
        int size=0;
        if(product.isDrinkOrNot()){
            System.out.println("위 메뉴의 어떤 옵션으로 추가하시겠습니까?");
            System.out.println("1. Tall \t2. Grande\t3. Venti");
            size = sc.nextInt()-1;
            while(size<0 || size >2){
                System.out.println("다시 입력해 주세요.");
                size = sc.nextInt()-1;
            }
            System.out.printf("\"%-3s(%-4s) | W %-6d | %-25s\"\n", product.getName(), sizeName[size], product.getPrice()+(size)*500, product.getDescription());
        }
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인 \t2. 취소");
        int check = sc.nextInt();
        if(check == 1){
            Order order = new Order(menus[channel - 1].get(item-1), 1, size);
            total_price += order.getProduct().getPrice() + (size)*500;
            System.out.println("size: "+size+"total_price: "+ total_price);
            int flag = 0;
            for (Order value : bucket) {
                if (value.getProduct().equals(order.getProduct()) && value.getSize() == order.getSize()){
                    value.setNum(value.getNum() + 1);
                    flag = 1;
                    break;
                }
            }
            if(flag==0) bucket.add(order);
            if(order.getProduct().isDrinkOrNot()) System.out.println(order.getProduct().getName()+"("+ sizeName[size] +") 가 장바구니에 추가되었습니다.");
            else System.out.println(order.getProduct().getName() + "가 장바구니에 추가되었습니다.");
            System.out.println();
        }
        else System.out.println("진행하던 주문이 취소되었습니다.");
    }
    public void order(){
        int order_num = bucket.size();
        if(order_num == 0) System.out.println("장바구니가 비었습니다.");
        else{
            System.out.println("아래와 같이 주문하시겠습니까?");
            System.out.println();
            System.out.println("[ Orders ]");
            for (int i=0;i< order_num;i++) {
                Product product = bucket.get(i).getProduct(); // 장바구니 상품
                if(product.isDrinkOrNot()) System.out.printf("%-3s(%-3s) | W %-6d | %-2d개 | %-25s\n", product.getName(), sizeName[bucket.get(i).getSize()], product.getPrice()+(bucket.get(i).getSize())*500, bucket.get(i).getNum(), product.getDescription());
                else System.out.printf("%-8s | W %-6d | %-2d개 | %-25s\n", product.getName(), product.getPrice(), bucket.get(i).getNum(), product.getDescription());
            }
            System.out.println();
            System.out.println("[ Total ]");
            System.out.println("W " + total_price);
            System.out.println();
        }
        System.out.println("1. 주문\t2. 메뉴판");
        int pay = sc.nextInt();
        if(pay == 1 && order_num==0){
            System.out.println("메뉴를 담아주세요.");
            pay = 3;
        }
        while(pay<=0 || pay >=3){
            System.out.println("다시 입력해 주세요.");
            pay = sc.nextInt();
        }
        if(pay==1&&order_num!=0){
            total_sale += total_price;
            total_price = 0;
            total_orders.addAll(bucket);
            bucket.clear();
            wait++;
            System.out.println("주문이 완료되었습니다!");
            System.out.println();
            System.out.println("대기번호는 [ " + wait +" ] 번입니다.");
            System.out.println("(3초후 메뉴판으로 돌아갑니다.)");
            try{
                Thread.sleep(3000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
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
            total_price = 0;
            bucket.clear();
            System.out.println("진행하던 주문이 취소되었습니다.");
            System.out.println();
        }
    }
}
