package org.example;


import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class MapsEx {
    public static void main(String[] args) {
        Map<String,Integer> map1 = Map.of("one",1,"two",6,"three",3); // ключи строки, цифры значения
        //System.out.println(map1);
        long res =  map1.keySet().stream().filter(x-> x.length()<4).count();// стрим из ключей словаря каунт возвращает лонговый тип   два слова с длиной короче 4  каунт  терминальный метод
        // создать из словаря стрим из ключей используем кей сет.
        //System.out.println(res);
//        long res1 =  map1.values().stream().filter(x-> x<4).count(); // по значениям
//        System.out.println(res1);
//        long res2 = map1.entrySet().stream().filter(x-> x.getKey().length()>3 && x.getValue()>1).count(); // какое число пар ключ  значеня прошло фильтрацию
//        System.out.println(res2);

        Map<String,Integer> filterMap = map1.entrySet().stream().filter(x-> x.getValue()>2).collect(Collectors.toMap(entr -> entr.getKey(),entr->entr.getValue()));
        System.out.println(filterMap); // сделали словарь из словаря его поменяли и на выходе получили дургой словарь  создали стрим на основе пары ключ значение
        // то мапор возвращай словарь чтобы он понимал что возвращать мы ему сказали гет кей и гет валью  entr можено нзавать ее х это название переменной

    }
}

