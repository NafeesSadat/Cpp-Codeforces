package sticks;

import java.util.Scanner;


public class Sticks {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n;
        int count=0;
        for (int i = 0; i < t; i++) {
            n=sc.nextInt();
            count=n/2;
            if(n%2==1)
                count++;
            System.out.println(count);
        }
    }
    
}
