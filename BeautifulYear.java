package beautiful.year;

import java.util.Scanner;


public class BeautifulYear {

    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int count=-1;
        int year=reader.nextInt();
        int year1=0;
        year1=year;
        year1++;
        year++;
        int a=0; int b=0; int c=0; int d=0;
        for (int i = 1;; i++) {
            count++;
            a=year%10;
            year=year/10;
            b=year%10;
            year=year/10;
            c=year%10;
            year=year/10;
            d=year%10;
            if(a!=b&&a!=c&&a!=d&&b!=a&&b!=c&&b!=d&&c!=a&&c!=b&&c!=d&&d!=a&&d!=b&&d!=c)
                break;
            year=year1+i;
        }
        System.out.print(year1+count);
        
    }
    
}
