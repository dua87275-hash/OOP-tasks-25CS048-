//25CS048
import java.util.Scanner;
public class second {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of your university : ");
  String university= sc.nextLine();
System.out.println("Enter the name of your department : ");
        String department= sc.nextLine();

      System.out.println("Enter the no.of students in your department : ");
        int num=sc.nextInt();
        for(int i=1; i<=num; i++)
            System.out.println("Roll no. = 25CS0" + i*2);

    }
}





