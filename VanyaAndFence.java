package vanya.and.fence;

import java.util.Scanner;

public class VanyaAndFence {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int h = input.nextInt();
        int person[]= new int[n];
        int sum=0;
        for (int i = 0; i < n; i++) {
            person[i]= input.nextInt();
            if(person[i]>h)
                sum+=2;
            else
                sum+=1;
        }
        System.out.println(sum);
    }
    
}
