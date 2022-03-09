package george.and.accommodation;

import java.util.Scanner;

public class GeorgeAndAccommodation {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int array[]= new int[100000];
        int count=0;
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 2; j++) {
                array[j]= input.nextInt();
            }
            if(array[1]>array[0]&&array[1]-array[0]>=2)
                count++;
            else if(array[0]==0&&array[1]==0)
                count=0;
        }
        System.out.println(count);
    }
    
}
