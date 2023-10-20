package Assignment1;

public class Order {
    private int num;
    private int size; //없으면 0, Tall이면 0, Grande이면 1, Venti이면 2
    private int final_price; //기존 price + 500*size
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




