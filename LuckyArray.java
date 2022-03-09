package lucky.array;

import java.util.Arrays;
import java.util.Scanner;


public class LuckyArray {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int t=sc.nextInt();
        int arr[]=new int[t];
        for (int i = 0; i < t; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < t; i++) {
            if(arr[i]==arr[0])
                count++;
        }
        if(count%2!=0)
            System.out.println("Lucky");
        else
            System.out.println("Unlucky");
    }
    
}
