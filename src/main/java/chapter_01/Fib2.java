/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_01;

/**
 *
 * @author User
 */
public class Fib2 {
    
    public static int fib2(int n){
        if(n < 2){
            return n;
        }
        
        return fib2(n-1)+fib2(n-2);
    }
    
    public static void main(String[] args) {
        int ans = fib2(6);
        System.out.println(ans);
    }
    
}
