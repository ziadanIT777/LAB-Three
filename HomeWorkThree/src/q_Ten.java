import java.util.Scanner;

public class q_Ten {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the number of the month to print its name and the number of days in it");
        int days[][] ={{1,2,3,4,5,6,7,8,9,10,11,12},{31,28,31,30,31,30,31,30,31,30,31,30}};
        final String months[]=new String[]{"janu","Febr","Mar","Apr","May","lune",
                                                "july","Augs","Sept","Octob","Novum","Desm",};
        int enter=in.nextInt() ;
        for (int i=0; i<12; i++){

            if (enter ==i){
                enter--;
                System.out.println("name the month is :"+months[enter]+"\nand the number the days is :"+days[enter][1]);
            }
        }

    }
}
