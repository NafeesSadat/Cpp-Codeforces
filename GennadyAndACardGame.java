package gennady.and.a.card.game;

import java.util.Scanner;


public class GennadyAndACardGame {

    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int yes=0;
        String st;
        String t = reader.next();
        for (int i = 0; i < 5; i++) {
            st=reader.next();
            if(t.charAt(0)==st.charAt(0)||t.charAt(1)==st.charAt(1))
                yes++;
        }
        if(yes>0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
}
