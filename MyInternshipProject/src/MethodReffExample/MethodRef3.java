/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodReffExample;
import java.util.function.Function;

/**
 *
 * @author HP
 */
public class MethodRef3 {
    public static void main(String[] args) {
        Function<String,String> fn=String::toLowerCase;
        System.out.println(fn.apply("JAVA"));
    }
}
