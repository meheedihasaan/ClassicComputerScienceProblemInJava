/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_01;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class Fib3 {
    //Memoization
    static HashMap<Integer, Integer> map = new HashMap<>(Map.of(0,0, 1,1));
    public static int fib3(int n){
        if(!map.containsKey(n)){
            map.put(n, fib3(n-1)+fib3(n-2));
        }
        return map.get(n);
    }
    
    public static void main(String[] args) {
        int ans = fib3(6);
        System.out.println(ans);
    }
}
