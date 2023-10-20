package Assignment1;

public class Product extends Menu{
    private int price;
    private boolean drinkOrNot;

    public Product(String name, String description, int price,boolean drinkOrNot){
        super(name, description);
        this.price = price;
        this.drinkOrNot = drinkOrNot;
    }

    public int getPrice(){
        return price;
    }
    public boolean isDrinkOrNot(){
        return drinkOrNot;
    }
}
