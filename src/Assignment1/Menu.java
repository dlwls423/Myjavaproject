package Assignment1;

public abstract class Menu {
    private String name;
    private int price;
    private String explain;
    private int num;

    public Menu(String name, int price, String explain){
        this.name = name;
        this.price = price;
        this.explain = explain;
        this.num=1;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getExplain() {
        return explain;
    }
    public int getNum() { return num; }

    public void setNum(int num){
        this.num = num;
    }
}
