package pkgnew.year.and.hurry;

import java.util.Scanner;


public class NewYearAndHurry {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int rem=240-k;
        int solve=0, count=0;
        for (int i = 1; i <= n; i++) {
            solve+=i*5;
            if(solve<=rem)
                count++;        
        }
        System.out.println(count);
    }
    
}
