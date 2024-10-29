package org.example;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

// примеры с коллекциями и мапами
public class Main2 {
    public static void main(String[] args) {

//        List<Integer> list= Stream.of(4,5,6,7,8,2,9,4).collect(Collectors.toList()); // после работы стрим получаем лист
//        System.out.println(list);

//        Set<Integer> set1= Stream.of(4,5,6,7,8,2,9,4).collect(Collectors.toSet()); // множество уникальных элементов убирает дубли, тип множество выводит по порядку.
//        System.out.println(set1);

//        long res = Stream.of(4,5,6,7,8,2,9,4).collect(Collectors.counting()); // выводит количество элементов в стриме которое добралось до конца
//        System.out.println(res);

        String res = Stream.of("aa","bb","cc").collect(Collectors.joining("-")); // склеивание строк "-" разделитель для склеиных строк
        System.out.println(res);







    }
}
