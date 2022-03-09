package i.wanna.be.the.guy2;

import java.util.Arrays;
import java.util.Scanner;
 
 
public class IWannaBeTheGuy2 { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        
        int n= sc.nextInt();
        int a=sc.nextInt();
        int array[]=new int[250];
        for (int i =  0 ; i < a ; i++) {
            array[i]= sc.nextInt();
        }
        int b=sc.nextInt();
        for (int i = a ; i < a + b ; i++) {
            array[i]= sc.nextInt();
        }
//        for (int i = 0; i < a+b; i++){
//            for (int j = i + 1; j < a+b; j++) {
//                int tmp = 0;  
//                if (array[i] > array[j]){
//                    tmp = array[i];  
//                    array[i] = array[j];  
//                    array[j] = tmp; 
//                }   
//            }
//        }
        Arrays.sort(array, 0, a+b);
        for (int i = 0; i < a+b; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < a+b; i++) {
            if(array[i]!=array[i+1])
                count++;
        }
        if(n==count)
            System.out.println("I become the guy.");
        else
            System.out.println("Oh, my keyboard!");
    }
    
}