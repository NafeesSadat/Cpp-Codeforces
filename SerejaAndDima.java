package sereja.and.dima;

import java.util.Scanner;


public class SerejaAndDima {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]= new int[n];
        int sereja=0;
        int dima=0;
        int max=0;
        int a=-1;
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }
        for (int i = 0; i < n/2; i++) {
            if(Math.max(array[i], array[array.length+a])==array[i]){
                max=Math.max(array[i], array[array.length+a]);a--;
                sereja+=max;
                max=Math.max(array[i], array[array.length+a]);a--;
                dima+=max;
            }
        }
        System.out.println(sereja+" "+dima);
        
    }
    
}
