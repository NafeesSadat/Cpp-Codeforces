package palindrome.array;

import java.util.Scanner;


public class PalindromeArray {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count=0;
        int t=input.nextInt();
        int array[] = new int[t];
        for (int i = 0; i < t; i++) {
            array[i]=input.nextInt();
        }
        for (int i = 0; i < t; i++) {
            if(array[i]==array[array.length-i-1])
                count++;
        }
        if(count==t)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
}
