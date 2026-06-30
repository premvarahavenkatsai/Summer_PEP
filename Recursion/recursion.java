package Recursion;
import java.util.*;
public class recursion{
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    public static void main(String args[]){
        int fact = factorial(5);
        System.out.println("Factorial of 5 is: " + fact);
    }
}