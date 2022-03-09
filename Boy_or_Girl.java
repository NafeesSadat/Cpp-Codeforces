package boy_or_girl;

import java.util.Arrays;
import java.util.Scanner;


public class Boy_or_Girl {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count=1;
        String a= input.next();
        char[] chars= a.toCharArray();
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; i++) {
            if(chars[i-1]!=chars[i]){
                count++;
                System.out.println("ans= "+count);
            }
        }
        if(count%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
    
}
