package remove.smallest;

import java.util.Arrays;
import java.util.Scanner;


public class RemoveSmallest {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, diff=0;
        int ar[]=new int[60];
        int t= input.nextInt();
        for (int i = 0; i < t; i++) {
            n=input.nextInt();
            for (int j = 0; j < n; j++) {
                ar[j]=input.nextInt();
            }
            Arrays.sort(ar);
//            if(n==1){
//                System.out.println("YES");
//            }
            for (int j = 0; j < n; j++) {
//                diff=Math.abs(ar[j-1]-ar[j]);
//                System.out.println("(j-1)= "+ar[j-1]+" j= "+ar[j]);
//                System.out.println("dif= "+diff);
                 System.out.print(j);
            }
            System.out.println("");
            if(diff<=1)
                System.out.println("YES");
            else
                System.out.println("NO");
            
        }
    }
    
}
