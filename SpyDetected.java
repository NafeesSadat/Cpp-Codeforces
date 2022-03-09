package spy.detected;

import java.util.Arrays;
import java.util.Scanner;


public class SpyDetected {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int spy=0;
        int t= input.nextInt();
        int array[]= new int[1000];
        int array2[]= new int[1000];
        for (int i = 0; i < t; i++) {
            n= input.nextInt();
            for (int j = 1; j <= n; j++) {
                array[j]=input.nextInt();
                array2[j]=array[j];
            }
            Arrays.sort(array2, 1, n+1);
            for (int j = 1; j <= n ; j++) {
                if(array2[1]!=array2[2]&&array2[1]!=array2[3])
                    spy=array2[1];
                if(array2[n]!=array2[1]&&array2[n]!=array2[2])
                    spy=array2[n];
            }
            for (int j = 1; j <= n; j++) {
                if(array[j]==spy){
                    System.out.println(j);
                    break;
                }
            }
        }
    }
    
}
