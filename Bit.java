package bit;

import java.util.Scanner;


public class Bit {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t;
        String s;
        t=input.nextInt();
        int bit=0;
        for (int i = 0; i < t; i++) {
            s= input.next();
            if(s.charAt(0)=='+'||s.charAt(1)=='+'||s.charAt(2)=='+')
                bit++;
            else
                bit--;
        }
        System.out.println(bit);
    }
    
}
