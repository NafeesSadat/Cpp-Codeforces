package bearandbigbrother2;

import java.util.Scanner;

public class BearAndBigBrother2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, bob=0,limak=0,count=0;
        a= input.nextInt();
        for (int i = 1; i <= 10; i++) {
            count++;
            if(count==3){
                continue;
            }
            System.out.println(count);
        }
        
        
    }
    
}
