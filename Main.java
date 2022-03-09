
package pkg4awatermalon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        a= input.nextInt();
      
        if(a%2==0){
           if(a==2){
            System.out.println("NO");
        }
           else{ 
           System.out.println("YES");
        }
    }
        else{
            System.out.println("NO");
        }
    }
    
}
