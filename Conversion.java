package conversion;

import java.util.Scanner;


public class Conversion {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        StringBuffer s= new StringBuffer(st);
        for (int i = 0; i < st.length(); i++) {
            if(Character.isLowerCase(st.charAt(i)))
                s.setCharAt(i, Character.toUpperCase(st.charAt(i)));
            if(Character.isUpperCase(st.charAt(i)))
                s.setCharAt(i, Character.toLowerCase(st.charAt(i)));
            if(st.charAt(i)==44)
                s.setCharAt(i, ' ');
        }
        System.out.println(s);
    }
    
}
