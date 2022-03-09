package bus.to.udayland;

import java.util.Scanner;


public class BusToUdayland {

    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int count=1;
        int yes=0;
        String st;
        int t = reader.nextInt();
        for (int i = 0; i < t; i++) {
                st=reader.next();
                if((st.charAt(0)=='O'&&st.charAt(1)=='O')||(st.charAt(3)=='O'&&st.charAt(4)=='O')){
                    
                }
                if(st.charAt(0)=='O'&&st.charAt(1)=='O'&&count==1){
                    System.out.println("++"+st.charAt(2)+st.charAt(3)+st.charAt(4));
                    count--;
                }
                else if(st.charAt(3)=='O'&&st.charAt(4)=='O'&&count==1){
                    System.out.print(st.charAt(0));
                    System.out.print(st.charAt(1));
                    System.out.print(st.charAt(2));
                    System.out.print("+");
                    System.out.println("+");
                    count--;
                }
                else
                    System.out.println(st);
                   
        }
        
    }
    
}
