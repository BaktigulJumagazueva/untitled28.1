package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(54,57,87,89,23,43,12,90);
        System.out.println("max: ");
      Integer var= list.stream().max(Integer::compare).get();
        System.out.println(var);
        System.out.println("квадрат четных чисел: ");
        list.stream().filter(n -> n % 2 == 0).map(n->n*n).forEach(System.out::println);
    }
}