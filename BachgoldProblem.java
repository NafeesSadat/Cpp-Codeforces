package bachgold.problem;

import java.util.Scanner;


public class BachgoldProblem {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prime=0;
        int sum=0;
        int count=0;
        for (int i = 0; i < n; i++) {
            for (int j = 2; ; j++) {
                if(i%j==0)
                    count++; break;
            }
            if(count==0){
                sum+=i;
                if(sum==n)
                    break;
            }
        }
    }
    
}
