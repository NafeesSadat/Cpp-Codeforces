package hit.the.lottery;

import java.util.Scanner;


public class HitTheLottery {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        int count=0;
        int n=sc.nextInt();
//        for (int i = 0; ; i++) {
//            if(t>100){
//                if(t%100==0){
//                    System.out.println(t/100);
//                    break;
//                }
//                else{
//                    for (int j = 0; ; j++) {
//                        int ans=t%100;
//                        if(ans>=20){
//                            ans=ans-20;
//                            count++;
//                        }
//                        if(ans>=10&&ans<20){
//                            ans=ans-10;
//                            count++;
//                        }
//                        if(ans>=5&&ans<10){
//                            ans=ans-5;
//                            count++;
//                        }
//                        if(ans>=2&&ans<5){
//                            ans=ans-2;
//                            count++;
//                        }
//                        if(ans>=1&&ans<2){
//                            ans=ans-1;
//                            count++;
//                        }
//                        if(ans==0){
//                            System.out.println((t%100)+count);
//                            a++;
//                            break;
//                        }
//                    }
//                    if(a==1)
//                        break;
//                }
//            }
//        }
        for (int i = 0; i < 5; i++) {
            if(n/100!=0){
                ans=n/100;
                if(ans%100!=0)
            }
            
        }
        
    }
    
}
