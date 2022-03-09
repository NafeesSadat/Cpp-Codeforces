package pangram;

import java.util.Scanner;

public class Pangram {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String al="ABCDEFGHIJKLMNOPUVQRSTWXYZ";
        int n= input.nextInt();
        String st= input.next();
        String st1=st.toUpperCase();
        int count=0;
        int a=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(al.charAt(i)==st1.charAt(j))
                    count++;
            }
        }
        if(count>=26)
                System.out.println("YES");
        else
                System.out.println("NO");
    }
    
}
