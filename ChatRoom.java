package chat.room;

import java.util.Scanner;

public class ChatRoom {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int count=0;
        String a= input.nextLine();
        for (int i = 0; i < a.length(); i++) {
            if(count==0&&a.charAt(i)=='h'){
                count++;
                
            }
            else if(count==1&&a.charAt(i)=='e'){
                count++;
                
            }
            else if((count==2||count==3)&&a.charAt(i)=='l'){
                count++;
            }
            else if(count==4&&a.charAt(i)=='o'){
                count++;
            }
        }
        if(count==5){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
