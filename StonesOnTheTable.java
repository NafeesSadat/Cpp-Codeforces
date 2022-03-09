package stones.on.the.table;

import java.util.Scanner;

public class StonesOnTheTable {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t;
        int count=0;
        t= input.nextInt();
        String a;
        a = input.next();
//        char ch[]= a.toCharArray();
        for (int i = 1; i < t; i++) {
//            if(ch[i-1]==ch[i]){
//                count++;
//            }
              if(a.charAt(i-1)==a.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
