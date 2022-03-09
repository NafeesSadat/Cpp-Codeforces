package count;

import java.util.Scanner;


public class Count {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        int sum=0;
        for (int i = 0; i < st.length(); i++) {
            sum+=Integer.parseInt(String.valueOf(st.charAt(i)));
        }
        System.out.println(sum);
    }
    
}
