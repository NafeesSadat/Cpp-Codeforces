package string.palindrome;

import java.util.Scanner;


public class StringPalindrome {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        String st=sc.next();
        for (int i = 0; i < st.length(); i++) {
            if(st.charAt(i)==st.charAt(st.length()-i-1))
                count++;
        }
        if(count==st.length())
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
}
