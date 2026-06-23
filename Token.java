import java.util.*;

public class Token {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        if (!scan.hasNext()) {
            System.out.println(0);
            return;
        }

        String s = scan.nextLine();

        // Split using any non-alphabet character
        String[] tokens = s.trim().split("[^A-Za-z]+");

        // Handle empty string case
        if (s.trim().isEmpty()) {
            System.out.println(0);
            return;
        }

        System.out.println(tokens.length);

        for (String token : tokens) {
            System.out.println(token);
        }

        scan.close();
    }
}