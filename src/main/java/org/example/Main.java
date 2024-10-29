package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] arr = {"Aaaaaaaa", "Bb", "Cccccc", "Ddddddd"};
        words(arr);
        System.out.println(words(arr));
    }

    public static int words(String[] arr) {
        Stream<String> stream = Arrays.stream(arr);
        long res = stream.filter(x -> x!=null && x.length()>4).count();
        return (int) res; // привели к инту

    }
}
