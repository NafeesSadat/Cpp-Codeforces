package anton.and.letters;

import java.util.Arrays;
import java.util.Scanner;


public class AntonAndLetters {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder sb= new StringBuilder();
        int count=0;
        int b=0;
        String st= input.nextLine();
        char ch[]=st.toCharArray();
        Arrays.sort(ch);
        char ch1[]=new char[10000];
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]>96&&ch[i]<123){
                sb.insert(b, ch[i]);
                ch[b]=ch[i];
                b++;
            }
        }
        Arrays.sort(ch1);
        for (int i = 1; i <= sb.length(); i++) {
           if(sb.length()==1)
               count++;
            if((ch[i-1]!=ch[i])&&(ch[i-1]>96&&ch[i]<123))
                count++;
        }
        System.out.println(count);
        
    }
    
}
