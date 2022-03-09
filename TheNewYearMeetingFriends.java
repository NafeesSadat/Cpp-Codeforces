package the.pkgnew.year.meeting.friends;

import java.util.Arrays;
import java.util.Scanner;


public class TheNewYearMeetingFriends {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array[]= new int[3];
        for (int i = 0; i < 3; i++) {
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        int solve=array[array.length-1]-array[0];
        System.out.println(solve);
    }
    
}
