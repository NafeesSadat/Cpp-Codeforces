package let.s.use.getline;

import java.util.Scanner;


public class LetSUseGetline {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int index=st.indexOf('\\');
        System.out.println(st.substring(0, index));
        String st1=sc.nextLine();
        String st2=sc.nextLine();
        if(st1.compareTo(st2)<0)
            System.out.println(st1);
        else
            System.out.println(st2);
    }
    
}
