package ultra.fast.mathematician;

import java.util.Scanner;


public class UltraFastMathematician {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ch1= input.next();
        String ch2= input.next();
        for (int i = 0; i < ch1.length(); i++) {
            if(ch1.charAt(i)!=ch2.charAt(i))
                System.out.print("1");
            else
                System.out.print("0");
        }
    }
    
}
