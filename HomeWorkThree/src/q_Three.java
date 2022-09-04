import java.util.Scanner;

    public class q_Three {
        public static void main(String[] args) {

            Scanner in=new Scanner(System.in);
            System.out.println("enter the one number" );
            float x=in.nextFloat();
            if (x>=1) {System.out.println("Positive");}
            if (x <= -1) {System.out.println("Negative");}
            else if (x==0){ System.out.println("Zero");}

        }

    }
