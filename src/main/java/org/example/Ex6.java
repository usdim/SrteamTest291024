package org.example;

import java.util.Map;
import java.util.stream.Collectors;

public class Ex6 {
    public static void main(String[] args) {

        Map<String,Integer> map3 = Map.of("hdd",5000,"CPU",3000,"RAM",2000);
        //Map<String,Integer> sumMap = map3.entrySet().stream().collect(Collectors.toMap(entr -> entr.getKey(), entr->entr.getValue()));

        long res5 =  map3.values().stream().reduce(0,(x,y) ->x+y ); // по значениям
        //System.out.println(res5);
        System.out.println(sum(map3));

    }
    public static int sum (Map<String,Integer> map3){

        long res5 =  map3.values().stream().reduce(0,(x,y) ->x+y ); // по значениям
        //System.out.println(res5);

        return (int )res5;
    }

}


