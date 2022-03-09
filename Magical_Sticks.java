package magical_sticks;

import java.util.Scanner;

public class Magical_Sticks {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m;
        n= input.nextInt();
        m= input.nextInt(); 
        int ans=0;
        for (int i = n+1;i<=m; i++) {
            for (int j = 2; j<=i/2; j++) {
                if(i%j==0)
                {
                    ans++; 
                    break;
                }
            }
            if(ans==0)
            {
                n=i;
                break;
            }
            ans=0;
        }
        if(n==m)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
            
    }
    
}
