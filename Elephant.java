package elephant;

import java.util.Scanner;

public class Elephant {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=0, x, count=0; //n= num of steps to reach x. x= point he has to reach
        x= input.nextInt();
        for (int i = 1; i <= x; i++) {
            for (int j = 5; j >= 1; j--) {
                if(x%j!=0){
                    n+=j;
                    break;
                }
                if(x%j==0){
                    n+=j;
                    break;
                }
            }
            count++;
            if(n>=x){
                break;
            }
            
        }
        System.out.println(count);
    }
    
}