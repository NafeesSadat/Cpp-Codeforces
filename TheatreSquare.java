package theatre.square;

import java.util.Scanner;


public class TheatreSquare {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n= input.nextInt();
        double m= input.nextInt();
        double a= input.nextInt();
        long result=(long) ((long)Math.ceil(n/a)*Math.ceil(m/a));
        System.out.println(result);
    }
    
}
