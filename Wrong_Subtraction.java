package wrong_subtraction;

import java.util.Scanner;


public class Wrong_Subtraction {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, sub=0;
        a= input.nextInt();
        b= input.nextInt();
        for (int i = 1; i <= b; i++) {
            if(a%10!=0){
                a--;
                sub=a;
            }
            else{
                a=a/10;
                sub=a;
            }
        }
        System.out.print(sub);
    }
    
}
