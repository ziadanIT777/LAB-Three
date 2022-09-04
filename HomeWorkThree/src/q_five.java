

import java.util.Scanner;

public class q_five
{
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        System.out.println("enter three numbers");
        int x=in.nextInt();
        int y=in.nextInt();
        int t=in.nextInt();
        if (x == y && x == t){
            System.out.println(" All the same");
        }
        else if (x!=y&&x!=t){
            System.out.println(" All different");
        }
        else {
            System.out.println("Neither");
        }


    }
}
