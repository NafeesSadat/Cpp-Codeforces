package anton.and.polyhedrons;

import java.util.Scanner;


public class AntonAndPolyhedrons {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String st;
        int sum=0;
        int t= input.nextInt();
        for (int i = 0; i < t; i++) {
            st= input.next();
            if("Tetrahedron".equals(st))
                sum+=4;
            else if("Cube".equals(st))
                sum+=6;
            else if("Octahedron".equals(st))
                sum+=8;
            else if("Dodecahedron".equals(st))
                sum+=12;
            else
                sum+=20;
        }
        System.out.println(sum);
    }
    
}
/*import java.util.Scanner;
 
 
//public class AntonAndPolyhedrons {
 
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String st;
        int sum=0;
        int t= input.nextInt();
        for (int i = 0; i < t; i++) {
            st= input.next();
            if(null == st)
                sum+=20;
            else switch (st) {
                case "Tetrahedron" -> sum+=4;
                case "Cube" -> sum+=6;
                case "Octahedron" -> sum+=8;
                case "Dodecahedron" -> sum+=12;
                default -> sum+=20;
            }
        }
        System.out.println(sum);
    }
    
}
