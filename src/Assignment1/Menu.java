package Assignment1;

public abstract class Menu {
    private String name;
    private int price;
    private String explain;

    public Menu(String name, int price, String explain){
        this.name = name;
        this.price = price;
        this.explain = explain;
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

}
