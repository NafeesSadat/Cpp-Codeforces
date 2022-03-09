package next.round;

import java.util.Scanner;


public class NextRound {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int zero=0;
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[]array=new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if((array[i]>array[k-1]||array[i]==array[k-1])&&array[i]!=0)
                count++;
        }
        for (int i = 0; i < n; i++) {
            if(array[i]==0)
                zero++;
        }
        if(zero==n)
            System.out.println(0);
        else
            System.out.println(count);
    }
    
}
