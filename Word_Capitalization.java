package word_capitalization;

import java.util.Scanner;

public class Word_Capitalization {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a;
        a= input.nextLine();
        char ch=a.charAt(0);
        if(Character.isLowerCase(ch)){
            System.out.print(Character.toUpperCase(ch));
            for (int i = 1; i < a.length(); i++) {
                System.out.print(a.charAt(i));
            }
        }
        else{
            System.out.println(a);
        }
//        Here is the method I did-
        char c;
        int b=0;
        if(a.charAt(0)>96&&a.charAt(0)<123){
            b= a.charAt(0);
            c= (char) b;
            System.out.print(Character.toUpperCase(c));
            for (int i = 1; i < a.length(); i++) {
                System.out.print(a.charAt(i));
            }
        }
        else{
            System.out.println(a);
        }
    }
    
}
