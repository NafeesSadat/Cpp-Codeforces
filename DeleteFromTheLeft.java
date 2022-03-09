package delete.from.the.left;

import java.util.Scanner;


public class DeleteFromTheLeft {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        String s1=sc.next();
        String s2=sc.next();
        if(s1.length()>s2.length()){
            for (int i = 1; i <= s2.length(); i++) {
                if(s1.charAt(s1.length()-i)==s2.charAt(s2.length()-i))
                    count++;
            }
            if(count==0)
                System.out.println(s1.length()+s2.length());
            else if(count==s2.length())
                System.out.println(s1.length());
            else
                System.out.println((s1.length()-count)+(s2.length()-count));
        }
        if(s1.length()<s2.length()){
            for (int i = 1; i <= s1.length(); i++) {
                if(s2.charAt(s2.length()-i)==s1.charAt(s1.length()-i))
                    count++;
            }
            if(count==0)
                System.out.println(s1.length()+s2.length());
            else if(count==s1.length())
                System.out.println(s1.length());
            else
                System.out.println((s2.length()-count)+(s1.length()-count));
        }
        if(s1.length()==s2.length()){
            for (int i = 1; i <= s1.length(); i++) {
                if(s2.charAt(s2.length()-i)==s1.charAt(s1.length()-i))
                    count++;
            }
            if(count==0)
                System.out.println(s1.length()+s2.length());
            else if(count==s2.length())
                System.out.println(s1.length());
            else
                System.out.println((s2.length()-count)+(s1.length()-count));
        }
    }
    
}
