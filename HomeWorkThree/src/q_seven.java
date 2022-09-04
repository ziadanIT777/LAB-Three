import java.util.Scanner;

public class q_seven {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int x= in.nextInt();
        int y= in.nextInt();
        int t= in.nextInt();
        if (x < y && y < t)
        {
            System.out.println("in order");
        }

        else if (x > y && y > t)
        {
            System.out.println("in order");
        }
        else
        {
            System.out.println("not in order");
        }
    }
}
