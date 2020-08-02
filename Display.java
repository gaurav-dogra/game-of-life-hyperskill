package life;

import java.awt.*;
import java.util.Random;

public abstract class Display {
    private final int size;
    private final int seed;
    private final Value[][] matrix;


    public Display(int size, int seed) {
        this.size = size;
        this.seed = seed;
        matrix = new Value[size][size];
        populateMatrix();
    }

    private void populateMatrix() {
        Random r = new Random(seed);
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                boolean currentCell = r.nextBoolean();
                Point p = new Point(row, col);
                setValue(p, currentCell ? Value.ALIVE : Value.DEAD);
            }
        }
    }

    public abstract void show();

    public int getSize() {
        return size;
    }

    public int getSeed() {
        return seed;
    }

    public Value getValue(Point p) {
        return matrix[p.x][p.y];
    }

    public void setValue(Point p, Value value) {
        matrix[p.x][p.y] = value;
    }
}
