import java.util.Calendar;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scan.nextInt();
        System.out.println("Enter your month of birth");
        int monthOfBirth = scan.nextInt();
        System.out.println("Enter your day of birth");
        int dayOfBirth = scan.nextInt();

        Calendar today = Calendar.getInstance();
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(yearOfBirth, monthOfBirth - 1, dayOfBirth);

        int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);

        if (today.get(Calendar.DAY_OF_YEAR) < dateOfBirth.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }

        System.out.println("You are: " + age + " years old");
        scan.close();

    }
}
