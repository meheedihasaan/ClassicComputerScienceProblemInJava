/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_01;

/**
 *
 * @author User
 */
public class Fib4 {
    
    public static int  fib4(int n){
        int prev = 0;
        int next = 1;
        for (int i = 0; i < n; i++) {
            int sum = prev+next;
            prev = next;
            next = sum;
        }
        return prev;
    }
    
    public static void main(String[] args) {
        int ans = fib4(6);
        System.out.println(ans);
    }
}
