package restoring.three.numbers;

import java.util.Arrays;
import java.util.Scanner;

public class RestoringThreeNumbers {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array[]= new int[4];
        for (int i = 0; i < 4; i++) {
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        int a=array[array.length-1]-array[0];
        int b=array[array.length-1]-array[1];
        int c=array[array.length-1]-array[2];
        System.out.println(a+" "+b+" "+c);
    }
    
}
