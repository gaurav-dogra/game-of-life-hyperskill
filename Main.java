package life;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int seed = scanner.nextInt();
        Display display = new ConsoleDisplay(n, seed);
        display.show();
    }
}
