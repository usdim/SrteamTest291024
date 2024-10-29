package org.example;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

//Дан Map<String, Integer>, представляющий товары и их цены. Увеличьте цену каждого товара на 10% и верните новый Map с обновленными ценами.

public class Ex5 {
    public static void main(String[] args) {
        Map<String,Integer> map2 = Map.of("hdd",5000,"CPU",3000,"RAM",2000);
       // LinkedHashMap<String,Integer> increaceMap1 =new LinkedHashMap<>(map2);
       // Map<String,Double> increaceMap = increaceMap1.entrySet().stream().collect(Collectors.toMap(entr -> entr.getKey(), entr->entr.getValue()+entr.getValue()*0.01));

        //System.out.println(increaceMap);

        System.out.println(increaceMap2(map2));

    }
public static Map<String,Double> increaceMap2 (Map<String,Integer> map2){
    Map<String,Double> increaceMap3 = map2.entrySet().stream().collect(Collectors.toMap(entr -> entr.getKey(), entr->entr.getValue()+entr.getValue()*0.01));

        return increaceMap3;
}

}

