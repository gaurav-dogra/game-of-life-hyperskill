package life;

import java.awt.*;

public class ConsoleDisplay extends Display {
    public ConsoleDisplay(int n, int seed) {
        super(n, seed);
    }

    @Override
    public void show() {
        for (int row = 0; row < getSize(); row++) {
            for (int col = 0; col < getSize(); col++) {
                if (getValue(new Point(row, col)) == Value.ALIVE) {
                    System.out.print('O');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
