package good.or.bad;

import java.util.Scanner;


public class GoodOrBad {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            String st=sc.next();
            for (int j = 0; j < st.length()/2; j+=2) {
                if("01".equals(st.substring(j, j+2)))
                    count++;
                if("10".equals(st.substring(j, j+2)))
                    count++;
            }
            if(count>0)
                System.out.println("Good");
            else
                System.out.println("Bad");
            count=0;
        }
    }
    
}
