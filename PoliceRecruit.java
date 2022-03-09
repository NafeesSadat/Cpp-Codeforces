package policerecruit;

import java.util.Scanner;

public class PoliceRecruit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t, a;
        int crime=0;
        int count=0;
        t= input.nextInt();
        for (int i = 0; i < t; i++) {
            a= input.nextInt();
            if(a>0){
                crime+=a;
            }
            else if(a<0){
                if(crime<=0){
                    count++;
                }
                else{
                    crime--;
                }
            }
        }
        System.out.println(count);
    }
    
}
