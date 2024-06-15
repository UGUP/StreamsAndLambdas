import LambdaExample.Car;
import org.w3c.dom.ls.LSException;
import org.w3c.dom.ls.LSOutput;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.BinaryOperator;

public class MainMethod {

    public static void main(String[] args) {

        Car c1= new Car(12000,20,"c1");
        Car c2= new Car(130,30,"c2");
        Car c3= new Car(140,20,"c3");
        Car c4= new Car(10000,15,"c4");

        List<Car> cars= Arrays.asList(c1,c2,c3,c4);
        List<Integer>   integers= Arrays.asList(1,2,3,4,5,6,7,8,9);

        BinaryOperator();
        sortBasedOnPrice(cars);
        PrintEven(integers);
        getPriceOfCars(cars);
        mostExpensiveCar(cars);
        findSumOfAll(integers);

    }

    public static void BinaryOperator(){
        String first= "First";
        String second= "Second";
         BinaryOperator operator= (str1,str2)->str1+" "+str2;
        System.out.println(operator.apply(first,second));
    }

    public static void sortBasedOnPrice(List<Car> cars){
        Collections.sort(cars, (car1,car2)-> car1.getPrice()-car2.getPrice());
        System.out.println(cars);

    }

    public static  void PrintEven(List<Integer> input){
        input.stream().filter(num-> num%2==0).forEach(num-> System.out.println(num+" "));
    }

    public static  void getPriceOfCars(List<Car> cars){
        cars.stream().map(car->car.getPrice()).forEach(price-> System.out.println(price+" "));
    }


    public static void mostExpensiveCar(List<Car> cars){
//        Optional<Car> mostExpensiveCar = cars.stream()
//                .max(Comparator.comparingInt(Car::getPrice));
//        mostExpensiveCar.ifPresent(System.out::println);
        Comparator<Car> comparator= (c1,c2)-> c1.getPrice()-c2.getPrice();
        Car mostExpensiveCar=cars.stream().max(comparator).get();
        System.out.println(mostExpensiveCar);
    }

    public static void findSumOfAll(List<Integer> list){
       int totalSum= list.stream().reduce(0,(sum,ele)->sum+ele);
        System.out.println(" the total sum is "+totalSum);
    }

}
