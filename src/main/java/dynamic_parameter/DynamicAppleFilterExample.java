package dynamic_parameter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class DynamicAppleFilterExample {


    public static void main(String[] args) {

        List<Apple> sampleApples = Apple.getSampleApple();

        List<Apple> redApples = Apple.filterApple(sampleApples, (Apple a) -> a.color.equals("RED"));

        List<Apple> heavyApples = Apple.filterApple(sampleApples, (Apple a) -> a.weight > 15);

        List<Apple> redAmdHeavy = filter(Apple.getSampleApple(), (Apple a) -> (a.weight > 15 && a.color.equals("RED")));

        redAmdHeavy.sort(Comparator.comparingInt((Apple a) -> a.weight));


    }


    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();

        for (T t : list) {
            if (p.test(t)) {
                result.add(t);
            }
        }
        return result;
    }
}
