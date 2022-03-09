package anton.and.danik;

import java.util.Scanner;

public class AntonAndDanik {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        int anton=0;
        int danik=0;
        int t=input.nextInt();
        s=input.next();
        for (int i = 0; i < t; i++) {
            if(s.charAt(i)== 'A')
                anton++;
            else if(s.charAt(i)=='D')
                danik++;
        }
        if(anton>danik)
            System.out.println("Anton");
        else if(danik>anton)
            System.out.println("Danik");
        else
            System.out.println("Friendship");
    }
    
}
