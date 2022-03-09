package positions.in.array;

import java.util.Scanner;


public class PositionsInArray {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        int array[] = new int[t];
        for (int i = 0; i < t; i++) {
            array[i]=input.nextInt();
            if(array[i]<=10)
                System.out.println("A["+i+"]"+" "+"="+" "+array[i]);
        }
    }
    
}
