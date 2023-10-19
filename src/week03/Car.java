package week03;

public class Car {
    String company;
    String model = "Gv80";
    String color;
    double price;
    double speed;
    char gear;
    boolean lights = true;
    Tire tire = new Tire();
    Door door;
    Handle handle;

    public Car() {
        System.out.println("생성자가 호출되었습니다! 객체가 생성됩니다.");
    }

    double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    double brakePedal(){
        speed = 0;
        return speed;
    }

    char changeGear(char type){
        gear = type;
        return gear;
    }

    boolean onOffLight(){
        lights = !lights;
        return lights;
    }

    void horn(){
        System.out.println("빵빵!");
    }

    void carSpeed(double ... speeds){
        for (double v : speeds){
            System.out.println("v = "+ v);
        }
    }

}
