import java.security.cert.CertPathChecker;
import java.util.Scanner;

public class q_eight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salary=0,hoursn;
        int hour,miuntes;
        String name;
        /////////////////////////
       System.out.println("enter the employees name");
         name = in.next();
        System.out.println("enter the employees salary");
         hoursn= in.nextDouble();
        System.out.println("How many working hours and minutes last week:");
        hour = in.nextInt();
        System.out.println("the miuntes : ");
         miuntes=in.nextInt();

        for (int i =1;  i<=hour ; i++){
            if (i>40)
                salary+=(1.50 *hoursn);
            else
                salary+=hoursn;
        }
        for (int i=1;i<=miuntes; i++){
            salary+=hoursn/60;
        }

        System.out.println("the name of employee :" + name +
                "\n working hours the last week is = "+hour+":"+ miuntes +"\nthe salary is ="+ salary);


    }
}
