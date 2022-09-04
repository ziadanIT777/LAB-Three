import java.util.Scanner;

public class q_nine {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter numbers from one to twelve to print you chapter");
        int number= in.nextInt();

        if (number== 5||number==6||number==7)
            System.out.println("Summer");
        else if (number==2||number==3||number==7)
            System.out.println("sping");
        else if (number==11||number==0||number==1)
            System.out.println("wintr");
        else
            System.out.println("autumn");





    }
}
