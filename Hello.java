import java.util.Scanner;


/**
 * A simple program to interact with user.
 * Was written for week 1 video 1.
 *
 * @author Son Phan (000824388)
 */
public class Hello {
    /**
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        // Print Hello and wait half of second
        System.out.println("Hello, World!");
        long l = 500;
        Thread.sleep(l);

        // Read user name from the console
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");

        // Print hello to the user
        String userName = scan.next();
        System.out.println("Hello " + userName + "!");

    }
}
