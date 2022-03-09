package translation;

import java.util.Scanner;


public class Translation {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1;
        String s2;
        int count =0;
        char ch[]= new char[100000];
        s1=input.next();
        s2=input.next();
        for (int i = s1.length()-1; i >= 0; i--) {
            ch[s1.length()-i]= s1.charAt(i);
        }
        for (int i = 1; i <= s2.length(); i++) {
            if(ch[i]==s2.charAt(i-1))
                count++;
        }
        if(count==s1.length())
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
}
