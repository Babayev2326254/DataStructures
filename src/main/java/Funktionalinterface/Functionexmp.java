package Funktionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Functionexmp {
    public static void main(String[] args) {
        Function<Integer, Integer> func = num1 -> num1 * 6;
        System.out.println(func.apply(10));

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list1 = list.stream().map(func).collect(Collectors.toList());
        System.out.println(list1);

    }
}
