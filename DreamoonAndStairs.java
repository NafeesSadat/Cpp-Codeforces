package dreamoon.and.stairs;

import java.util.Scanner;

public class DreamoonAndStairs {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m;
        int step=0;
        n=input.nextInt();
        m=input.nextInt();
        if(n>m){
            step= n/m+1;
            System.out.println(step);
        }
        else{
            System.out.println("-1");
        }
    }
    
}
