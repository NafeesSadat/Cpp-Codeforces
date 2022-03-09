
package domino;

import java.util.Scanner;

public class Domino {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n,area, result;
        m= input.nextInt();
        n= input.nextInt();
        area = m*n;
        result = area/2;
        System.out.println(result);
    }
    
}
