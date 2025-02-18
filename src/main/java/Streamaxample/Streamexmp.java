package Streamaxample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Streamexmp {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        List<Integer> numbers = Arrays.asList(1, 2, 5, 3, 25, 14, 14, 21, 21, 55, 12);
        List<String> word = Arrays.asList("a", "bbb", "Nicat", "Faxi", "tural", "Gunel", "muradik", "anar");

        List<Integer> result = numbers.stream().filter(s -> s > 10).sorted().distinct().collect(Collectors.toList());
        List<String> words = word.stream().sorted().filter(s -> s.length() > 3).map(String::toUpperCase).sorted().peek(s -> set.add(s)).toList();

        System.out.println(result);
        System.out.println(words);
        System.out.println(set);
    }
}
