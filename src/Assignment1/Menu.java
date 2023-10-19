package Assignment1;

public class Menu {
    private String name;
    private int price;
    private String description;
    private int num;

    public Menu(String name, int price, String description){
        this.name = name;
        this.price = price;
        this.description = description;
        this.num=1;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public int getNum() { return num; }
    public void setNum(int num){
        this.num = num;
    }
}
