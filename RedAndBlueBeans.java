package red.and.blue.beans;

import java.util.Scanner;

public class RedAndBlueBeans {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r, b, d;
        int result=0;
        int t=input.nextInt();
        for (int i = 0; i < t; i++) {
            r=input.nextInt();
            b=input.nextInt();
            d=input.nextInt();
            if(r>=b&&d!=0){
                result=r-b;
                if(result<=d)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
                
            else if(b>=r&&d!=0){
                result=r-b;
                if(result<=d)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            if(d==0&&r==b)
                System.out.println("YES");
            else if(d==0&&r!=b)
                System.out.println("NO");
               
        }
    }
    
}
