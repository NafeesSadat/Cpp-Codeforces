package dislike.of.threes;

import java.util.Scanner;

public class DislikeOfThrees {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int n;
        int t= input.nextInt();
        int num[]=new int[10000];
        int a=0;
        int b=0;
        a++;
        for (int i = 0; i < num.length; i++) {
            if(a%3!=0&&a%10!=3){
                num[b]=a;
                a++;
                b++;
            }
            else{
                a++;
            }
        }
        for (int i = 0; i < t; i++) {
//            n= input.nextInt();
//            System.out.println(num[n-1]);
            System.out.println(num[input.nextInt()-1]);
            
        }
    }
    
}
