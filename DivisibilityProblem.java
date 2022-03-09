package divisibility.problem;

import java.util.Scanner;


public class DivisibilityProblem {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        int count=0;
        int t=input.nextInt();
        for (int i = 0; i < t; i++) {
            a=input.nextInt();
            b=input.nextInt();
            for (int j = 0;; j++) {
                if(a%b==0)
                    break;
                a++;
                count++;
            }
            System.out.println(count);
            count=0;
        }
    }
    
}

/*public class DivisibilityProblem {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, rem=0;
        int t=input.nextInt();
        for (int i = 0; i < t; i++) {
            a=input.nextInt();
            b=input.nextInt();
            if(a%b==0)
                System.out.println(0);
            else{
                rem=a%b;
                System.out.println(b-rem);
            }
            
        }
    }
    
}
