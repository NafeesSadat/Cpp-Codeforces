package vasyathehipster;

import java.util.Scanner;

public class VasyaTheHipster {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, n=0;
        a= input.nextInt();
        b= input.nextInt();
        if(a>b){
            n= (a-b)/2;
            System.out.println(b + " " + n);
        }
        else{
            n=(b-a)/2;
            System.out.println(a + " " + n);
        }
    }
    
}
