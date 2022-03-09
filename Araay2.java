
package araay2;

import java.util.Scanner;


public class Araay2 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int number[] = new int[5];
    int sum = 0;
    int avg;
    int max= number[0];
    int min= number[0];
    System.out.print("Please enter 5 numbers : ");
    for(int i=0; i< number.length; i++)
        number[i]= input.nextInt();
    for(int x : number){
        
        sum= sum + x;
        
    }
//    for(int y : number)
      for(int i= 1; i< number.length; i++){  
        if(number[i]>max){
            
            max= number[i];
        }
        if(number[i]<min){
            
            min= number[i];
       }
           
        
    }
    avg= sum/ number.length;
    System.out.println("Sum is = " + sum);
    System.out.println("Average = " + avg);
    System.out.println("Max = " + max);
    System.out.println("Min = " + min);
    
 
    }
    
}
