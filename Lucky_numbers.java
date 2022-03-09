package lucky_numbers;

import java.util.Scanner;

public class Lucky_numbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a; 
        long count=0;
        a= input.nextLong();
        for (int i = 1;; i++) {
            if(a%10!=7 && a%10!=4 && a!=0){
                a= (a/10);
            }
            if(a%10==7){
                a=(a/10);
                count++;
            }
            else if(a%10==4){
                a=(a/10);
                count++;
            }
            if(a==0){
                break;
            }
        }
        if(count==4||count==7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
