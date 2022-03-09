package queue.at.the.school;

import java.util.Scanner;


public class QueueAtTheSchool {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int t= input.nextInt();
        String st= input.next();
        char ch[] = st.toCharArray();
        for (int i = 0; i < t; i++) {
            if(ch[i]=='B'&&ch[i+1]=='G'){
                ch[i]=ch[i+1];
                ch[i+1]=ch[i];
            }
            else if(ch[i]=='G'&&ch[i+1]=='G'){
                ch[i]='G';
                ch[i+1]='G';
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ch[i]);
        }
    }
    
}
