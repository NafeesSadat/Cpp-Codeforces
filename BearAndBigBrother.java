package bearandbigbrother;

import java.util.Scanner;

public class BearAndBigBrother {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, limak=0, bob=0, count=0;
        a= input.nextInt();
        b= input.nextInt();
        for (int i = 1;; i++) {
            limak= a*3;
            a= limak;
            bob= b*2;
            b=bob;
            count++;
            if(limak>bob){
                break;
            }
        }
        System.out.println(count);
    }
    
}
