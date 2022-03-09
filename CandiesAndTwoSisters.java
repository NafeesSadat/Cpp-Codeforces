package candiesandtwosisters;

import java.util.Scanner;

public class CandiesAndTwoSisters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long array[]= new long[20000];
        long a = input.nextLong();
        for (int i = 0; i < a; i++) {
            long b = input.nextLong();
            if(b%2==0){
                array[i]= (b/2)-1;
            }
            else if(b%2>0){
                array[i]= (b/2);
            }
            else if(b<2){
                array[i]= 0;
            }
        }
        for (int i = 0; i < a; i++) {
            System.out.println(array[i]);
        }
    }
    
}
