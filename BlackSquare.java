package black.square;

import java.util.Scanner;


public class BlackSquare {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        int[]array=new int[5];
        for (int i = 1; i < 5; i++) {
            array[i]=input.nextInt();
        }
         String st=input.next();
        for (int i = 0; i < st.length(); i++) {
            if(st.charAt(i)=='1')
                sum+=array[1];
            if(st.charAt(i)=='2')
                sum+=array[2];
            if(st.charAt(i)=='3')
                sum+=array[3];
            if(st.charAt(i)=='4')
                sum+=array[4];
        }
        System.out.println(sum);
    }
    
}
