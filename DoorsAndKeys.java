package doors.and.keys;

import java.util.Scanner;


public class DoorsAndKeys {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r=0;
        int g=0;
        int b=0;
        int t=input.nextInt();
        for (int i = 0; i < t; i++) {
            String st= input.next();
            if(st.indexOf("r")<st.indexOf("R"))
                r++;
            if(st.indexOf("g")<st.indexOf("G"))
                g++;
            if(st.indexOf("b")<st.indexOf("B"))
                b++;
            if(r>0&&g>0&&b>0)
                System.out.println("YES");
            else 
                System.out.println("NO");
            r=0;
            g=0;
            b=0;
        }
    }
    
}
