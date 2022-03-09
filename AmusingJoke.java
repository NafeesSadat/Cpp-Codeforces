package amusing.joke;

import java.util.Arrays;
import java.util.Scanner;

public class AmusingJoke {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count=0;
        String ch1= input.next();
        String ch2= input.next();
        String ch3= input.next();
        String ch4= ch1+ch2;
        char char1[]=ch4.toCharArray();
        Arrays.sort(char1);
        char char2[]=ch3.toCharArray();
        Arrays.sort(char2);
        if(char1.length>char2.length)
            System.out.println("NO");
        else if(char1.length<char2.length)
            System.out.println("NO");
        else{
            for (int i = 0; i < char1.length; i++) {
                if(char1[i]!=char2[i])
                    count++;
            }
            if(count>1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
    
}
