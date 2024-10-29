package src;
import java.awt.*;
import java.util.*;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
        


    }
    public static boolean isEven(int n) {
        return n%2==0;
    }
    public static boolean isThree(int n) {
        return n==3;
    }
    static String filterApples(List<Apple> inventory, Predicate<Apple> p) {          
        String result = "";
        for (Apple apple: inventory){
            if (p.test(apple)) {                                   
                result.add(apple);
            }
        }
        return result;
    }
}
