package strings;

import java.util.Scanner;


public class Strings {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st1=sc.next();
        String st2=sc.next();
        System.out.println(st1.length()+" "+st2.length());
        System.out.println(st1.concat(st2));
        System.out.print(st1.replace(st1.charAt(0), st2.charAt(0))+" ");
        System.out.print(st2.replace(st2.charAt(0), st1.charAt(0)));
        System.out.print(st2.charAt(0)+st1.substring(1)+" ");
        System.out.print(st1.charAt(0)+st2.substring(1));
    }
    
}
