package in.search.of.an.easy.problem;

import java.util.Scanner;


public class InSearchOfAnEasyProblem {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int array[]= new int[100000];
        int count=0;
        for (int i = 0; i < t; i++) {
            array[i]=input.nextInt();
            if(array[i]==1)
                count++;
        }
        if(count>=1)
            System.out.println("HARD");
        else
            System.out.println("EASY");
    }
    
}
