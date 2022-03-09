package function;

import java.util.Scanner;

public class Function {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       long n, a = 0;
       n= input.nextLong();
       if(n%2==0){
           a= n-(n/2);
       }
       else{
           a= (n/2)-n;
       }
        System.out.println(a);
    }
    
}
