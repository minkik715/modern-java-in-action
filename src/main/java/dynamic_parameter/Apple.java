package dynamic_parameter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Apple {
    int weight;
    String color;

    Apple(int weight, String color){
        this.weight = weight;
        this.color = color;
    }

    public static List<Apple> filterApple(List<Apple> apples, Predicate<Apple> p){
        List<Apple> result = new ArrayList<>();

        for (Apple apple : apples) {
            if(p.test(apple)){
                result.add(apple);
            }
        }

        return result;
    }

    public static List<Apple> filterApplePredicate(List<Apple> apples, ApplePredicate predicate){
        List<Apple> result = new ArrayList<>();

        for (Apple apple : apples) {
            if(predicate.test(apple)){
                result.add(apple);
            }
        }

        return result;
    }



    static public List<Apple> getSampleApple(){
        return List.of(
               new Apple(10,"GREEN"),
               new Apple(11,"RED"),
               new Apple(12,"GREEN"),
               new Apple(13,"RED"),
               new Apple(14,"GREEN"),
               new Apple(15,"RED"),
               new Apple(16,"GREEN"),
               new Apple(17,"RED"),
               new Apple(18,"GREEN"),
               new Apple(19,"RED")
        );
    }
}
