package word;

import java.util.Scanner;

public class Word {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        int upper=0;
        int lower=0;
        s=input.next();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>64&&s.charAt(i)<91)
                upper++;
            else 
                lower++;
        }
        if(upper>lower)
            System.out.println(s.toUpperCase());
        else
            System.out.println(s.toLowerCase());
    }
    
}
