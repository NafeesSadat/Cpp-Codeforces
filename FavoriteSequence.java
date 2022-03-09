package favorite.sequence;

import java.util.Scanner;

public class FavoriteSequence {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int t= input.nextInt();
        int array[]= new int[1000000];
        for (int i = 0; i < t; i++) {
            n=input.nextInt();
            for (int j = 1; j <= n; j++) {
                array[j]=input.nextInt();
            }
            
        }
    }
    
}
