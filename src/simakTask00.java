import java.util.Scanner;

/**
 * Created by AlexSBS on 20.06.2015.
 */
public class simakTask00 {
    public static void main(String[] args) {
        System.out.print("Dlia vixoda nazhmite 0\n");


        int n = 1;

        while (n != 0) {
            System.out.print("Vvedite celoe chislo\n");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            if (n != 0) {
                if (n % 3 == 0) {
                    System.out.print("Chislo delitsia na 3 bez ostatka\n");
                } else {
                    System.out.print("Chislo NE delitsia na 3 bez ostatka\n");
                }

            }
        }

        System.out.print("BY");
    }
}
