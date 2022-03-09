package fafa.and.his.company;

import java.util.Scanner;


public class FafaAndHisCompany {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int count=0;
        int employ=0;
        int leader=0;
        for (int i = 1; i < t; i++) {
            leader=i;
            employ=t-i;
            if(employ%leader==0)
                count++;
        }
        System.out.println(count);
    }
    
}
