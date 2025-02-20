package Funktionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicatexmp {
    public static void main(String[] args) {
        Predicate<Integer> pred = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer > 10) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        Predicate<Integer> pred2 = number -> number % 2 == 0;

        Predicate<Integer> pred3 = pred.and(pred2);

        System.out.println(pred2.test(11));
        System.out.println(pred.test(8));
        System.out.println(pred.and(pred2));
        System.out.println(pred3.test(5));
        System.out.println(pred3.test(11));
        System.out.println(pred3.test(16));

        System.out.println("Example stream predicate");

        List<Integer> numbers = Arrays.asList(-10, -5, 0, 5, 10, 15, 20);

        List<Integer> numb = numbers.stream().filter(pred2.or(pred)).collect(Collectors.toList());

        System.out.println(numb);

    }
}
