package bus.to.udayland2;

import java.util.Scanner;


public class BusToUdayland2 {

    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int yes=0;
        String st;
        int t = reader.nextInt();
        char ch[][]=new char[t][5];
        for (int i = 0; i < t; i++) {
            st=reader.next();
            for (int j = 0; j < 5; j++) {
                ch[i][j]=st.charAt(j);
            }
        }
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 4; j++) {
                if(ch[i][j]=='O'&&ch[i][j+1]=='O'){
                    ch[i][j]='+';
                    ch[i][j+1]='+';
                    yes++;
                    break;
                }
                
            }
            if(yes>0)
                    break;
        }
        if(yes>0){
            System.out.println("YES");
            for (int i = 0; i < t; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(ch[i][j]);
                }
                System.out.println("");
            }
        }
        else
            System.out.println("NO");
    }
    
}
