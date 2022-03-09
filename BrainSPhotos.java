package brain.s.photos;

import java.util.Scanner;


public class BrainSPhotos {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count=0;
        int a=input.nextInt();
        int b=input.nextInt();
        String m[][]= new String[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                m[i][j]=input.next();
                if("C".equals(m[i][j])||"M".equals(m[i][j])||"Y".equals(m[i][j]))
                    count++;     
            }
        }
        if(count>=1)
            System.out.println("#Color");
        else
            System.out.println("#Black&White");
    }
    
}
