package com.jaisoft;

import java.util.Arrays;
import java.util.List;


public class FilterEvenNumbers
 {

    public static List<Integer> list = Arrays.asList(1,2,3,4); 
     
    public void printEvenNumbers(){

      list.stream()
           .filter(value -> value % 2 == 0)
           .forEach(System.out::println);
    }
    
    
    
    
    
}
