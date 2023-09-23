import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int age = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age ");
        if (in.hasNextInt()) {
            age = in.nextInt();
            in.nextLine();
            if (age >= 21) {
                System.out.println("You may enter, take this wrist band");
            }
            else{
                System.out.println("You may not enter");
            }
        }
    }
}