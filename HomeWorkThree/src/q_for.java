import org.w3c.dom.css.Counter;

import java.util.Scanner;

public class q_for {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        System.out.println("enter at integer numbers");
        long num=in.nextLong();

        if (num<0)
        {
            num=num *-1;
        }
        int digits;

        if (num > 999655456)
        {
            digits =10;
        }
        else if (num > 88888888)
        {
            digits=9;
        }

        else if (num > 8888888)
        {
            digits=8;
        }
        else if (num > 888888)
        {
            digits=7;
        }
        else if (num > 88888)
        {
            digits=6;
        }
        else if (num > 8888)
        {
            digits=5;
        }
        else if (num > 888)
        {
            digits=4;
        }
        else if (num > 88)
        {
            digits=3;
        }
        else if (num > 8)
        {
            digits=2;
        }
        else
        {
            digits=1;
        }
        System.out.println("The number ="+num+"\n and The digits= " + digits);



    }
}
