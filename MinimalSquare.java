package minimal.square;

import java.util.Scanner;


public class MinimalSquare {
    static boolean checkPerfectSquare(double number){
        //calculating the square root of the given number  
        double sqrt=Math.sqrt(number);   
        //finds the floor value of the square root and comparing it with zero  
        return ((sqrt - Math.floor(sqrt)) == 0); 
    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int solve=0;
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            solve= (a*b)*2;
            if(a==b)
                solve=solve+solve;    
            for (int j = solve;; j++) {
                if(checkPerfectSquare(j)){
                    System.out.println(j);
                    break;
                }
            }
            solve=0;
        }
    }
    
}
