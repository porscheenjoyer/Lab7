import java.util.Locale;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        //Variables
        Scanner in = new Scanner(System.in);
        double userTemp = 0;
        double tempC = 0;
        double tempF = 0;
        String cOrF = "";
        boolean done = false;
        String trash = "";

        //Loop
        do {

            System.out.println("Enter the temperature");

            if (in.hasNextDouble()) {

                userTemp = in.nextDouble();
                done = true;

            }

            else {

                trash = in.nextLine();
                System.out.println("The response must have only numbers, you said: " + trash);

            }

        } while (!done);

        done = false;

        do {

            System.out.println("Did you enter celsius or fahrenheit?(c or f)");

            cOrF = in.nextLine();

            if (cOrF.equalsIgnoreCase("c")) {

                tempF = (9 / 5 * userTemp) + 32;
                System.out.println("The temp in fahrenheit is:" + tempF + "°F");
                done = true;

            } else if (cOrF.equalsIgnoreCase("f")) {

                tempC = (userTemp - 32) * 5 / 9;
                System.out.println("The temp in celsius is: " + tempC + "°C");
                done = true;

            } else {

                System.out.println("Must input c or f");

            }

        } while (!done);

    }
}
