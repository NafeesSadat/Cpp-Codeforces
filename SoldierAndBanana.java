package soldierandbanana;

import java.util.Scanner;

public class SoldierAndBanana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k, n, w; //k= cost of banana, n= dollars soldier have, w= number of banana
        int multi=0;
        int borrow=0;
        k= input.nextInt();
        n= input.nextInt();
        w= input.nextInt();
        
        if(k==w&&n!=0){
            for (int i = 1; i <= w; i++) {              
                multi += (k*i);          
        }
            if(n<multi){
            borrow= multi-n;
            System.out.println(borrow);
            }
            else
                System.out.println(borrow);
        }
        else if(k<=w){
           for (int i = 1; i <= w; i++) {              
                multi += (k*i);          
        }           
            borrow= multi-n;           
            System.out.println(borrow);
        }
        else{
           for (int i = 1; i <= w; i++) {
             multi += (k*i);          
        }
           if(multi>n){              
               borrow= multi-n;
               System.out.println(borrow);
           }
           else{              
               borrow= n-multi;
               System.out.println(borrow);
           }
            
        }

    }
    
}
