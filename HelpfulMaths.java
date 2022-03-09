package helpful.maths;

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        int count=0;
        s=input.next();
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='+')
                count++;
        }
        for (int i = count; i < ch.length; i++) {
            System.out.print(ch[i]);
            if(i==ch.length-1)
                break;
            System.out.print("+");
        }
    }
    
}
