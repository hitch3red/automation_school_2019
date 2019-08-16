import java.time.Instant;
import java.util.Scanner;
import java.util.Date;


public class Main {

    public static void main(String[] args) {

        System.out.println("Type your Name and Surname please.");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println(name + ", lesson 2 is finished");
        Date date = new Date();
        Instant instant3 = date.toInstant();
        System.out.println(instant3);

    }
}