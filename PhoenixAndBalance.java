package phoenix.and.balance;

import java.util.Scanner;

public class PhoenixAndBalance {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t, n, big=0, small=0, ans=0, ans1=0;
        int array[]= new int[200];
        t= input.nextInt();
        for (int i = 0; i < t; i++) {
            n= input.nextInt();
            for (int j = 1; j <= n; j++) {
                if(n==2){
                    ans1=2;
                    break;
                }
                if(j==1||j==n){
                    big=(int) (big + Math.pow(2, j));
                    System.out.println("big " + big);
                }
                else if(j!=n){
                    small= (int) (small + Math.pow(2, j));
                    System.out.println("small "+small);
                }
            }            
            if(n!=2){
                array[i]=big-small;
            }
            else{
                array[i]=ans1;
            }
                
        }
        for (int i = 0; i < t; i++) {
            System.out.println(array[i]);
        }
    }
    
}
