package lowest.number;

import java.util.Arrays;
import java.util.Scanner;


public class LowestNumber {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        int array1[] = new int[t];
        int array2[] = new int[t];
        for (int i = 0; i < t; i++) {
            array1[i]=input.nextInt();
            array2[i]=array1[i];
        }
        Arrays.sort(array2);
        for (int i = 0; i < t; i++) {
            if(array2[0]==array1[i]){
             System.out.println(array2[0]+" "+(i+1));
             break;   
            }
        }
    }
    
}
