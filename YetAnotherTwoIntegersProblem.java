package yet.another.two.integers.problem;

import java.util.Scanner;


public class YetAnotherTwoIntegersProblem {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>b||b>a){
                if(Math.abs(a-b)%10==0)
                    System.out.println(Math.abs(a-b)/10);
                else
                    System.out.println(Math.abs(a-b)/10+1);
            }
            else
                System.out.println(Math.abs(b-a)/10);
        }
    }
    
}
