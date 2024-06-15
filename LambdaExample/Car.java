package LambdaExample;

public class Car {

    private int price;
    private int speed;
    private String name;

    public Car(int price,int speed,String name){
        this.name=name;
        this.price=price;
        this.speed=speed;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "name is "+this.name+" the price is "+this.price+" the speed is "+this.speed+"\n";
    }

}
