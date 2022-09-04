import java.util.Scanner;

public class q_six {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("enter at Three numbers");
        int x= in.nextInt();
        int y= in.nextInt();
        int t= in.nextInt();
        if (x>y) {System.out.println("between ("+x+") and ("+y+") max ");}
        else if (x<y){System.out.println("between ("+x+") and ("+y+") min ");}
        else if (x>t) {System.out.println("between ("+x+") and ("+t+")= max ");}
        else if (x<t){System.out.println("between ("+x+") and ("+y+")= min ");}

        if (y>x) {System.out.println("between ("+y+") and ("+x+")= max ");}
        else if (y<x){System.out.println("between ("+y+") and ("+x+")= min ");}
        else if (y>t) {System.out.println("between ("+y+") and ("+t+")= max ");}
        else if (y<t){System.out.println("between ("+y+") and ("+t+")= min ");}

         if (t>x) {System.out.println("between ("+t+") and ("+x+")= max ");}
        else if (t<x){System.out.println("between ("+t+") and ("+x+")= min ");}
        else if (t>y) {System.out.println("between ("+t+") and ("+y+")= max ");}
        else if (t<y){System.out.println("between ("+t+") and ("+y+")= min ");}




    }
}
