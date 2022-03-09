package elecions;

import java.util.Scanner;
 
public class Elections {
 
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        int array[]= new int[100];
        int t=input.nextInt();
        for (int i = 0; i < t; i++) {
            a= input.nextInt();
            b= input.nextInt();
            c= input.nextInt();
                if(b==c&&a<c){
                    array[0]=(b-a)+1;
                    array[1]=1;
                    array[2]=1;
                }
                else if(a==c&&b<a){
                    array[0]=1;
                    array[1]=(c-b)+1;
                    array[2]=1;
                }
                else if(a==b&&c<a){
                    array[0]=1;
                    array[1]=1;
                    array[2]=(a-c)+1;
                }
                else if(a==0&&b==c&&b!=0&&c!=0){
                    array[0]=b+1;
                    array[1]=1;
                    array[2]=1;
                }
                else if(b==0&&a==c&&a!=0&&c!=0){
                    array[0]=1;
                    array[1]=a+1;
                    array[2]=1;
                }
                else if(c==0&&a==b&&a!=0&&c!=0){
                    array[0]=1;
                    array[1]=1;
                    array[2]=a+1;
                }
                else if(a==b&&b==c){
                    array[0]=1;
                    array[1]=1;
                    array[2]=1;
                }
                else if(a>b&&a>c){
                    array[0]=0;
                    array[1]=(a-b)+1;
                    array[2]=(a-c)+1;
                }
                else if(b>a&&b>c){
                    array[0]=(b-a)+1;
                    array[1]=0;
                    array[2]=(b-c)+1;
                }
                else if(c>b&&c>a){
                    array[0]=(c-a)+1;
                    array[1]=(c-b)+1;
                    array[2]=0;
                }
                
                System.out.println(array[0] + " " + array[1] + " " + array[2]);
        }
        
    }
    
}