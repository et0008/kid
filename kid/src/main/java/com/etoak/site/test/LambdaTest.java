package com.etoak.site.test;

import edu.emory.mathcs.backport.java.util.Arrays;

import java.util.List;

/**
 * Created by yinyong on 2017/4/11.
 */
public class LambdaTest {
    public static void main(String[] args){
//        Integer[] numbers = {12,45,32,85,45,65,42,8};
//        System.out.println(Arrays.toString(numbers));
//
//        Arrays.sort(numbers, (first, secend) -> first.compareTo(secend));
//
//        System.out.println(Arrays.toString(numbers));

       // Stream.iterate(1,item -> item + 1).limit(10).forEach(System.out::println);
        List<Integer> nums = Arrays.asList(new Object[]{1,2,3,4,5,6,7,8,9,10});
        //System.out.println(nums.stream().filter(num -> num != null).distinct().peek(System.out::println).skip(2).limit(4));
//        List<Integer> numswithoutull = nums.stream().filter(num -> num != null).collect(Collectors.toList());
//        System.out.println(numswithoutull);
       //System.out.println(nums.stream().reduce(0,(sum,item) -> sum +item));

    }
}
