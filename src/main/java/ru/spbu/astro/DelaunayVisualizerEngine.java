package ru.spbu.astro;

import ru.spbu.astro.graphics.DelaunayBinderComponent;

import javax.swing.*;

public class DelaunayVisualizerEngine {

    private static int SIZE_X = 1320;
    private static int SIZE_Y = 660;

    public static void main(String[] args) {
        DelaunayBinderComponent component = new DelaunayBinderComponent(1000, 2);
        JFrame frame = new JFrame();
        frame.add(component);
        frame.setSize(SIZE_X, SIZE_Y);
        frame.setVisible(true);

        /*
        for (int m = 30; m < 50; ++m) {
            double average = 0;
            for (int t = 0; t < 10; ++t) {
                DelaunayBinder binder = new DelaunayBinder(1000, m, SIZE_X, SIZE_Y);
                average += binder.getRate();
            }
            average /= 10;
            System.out.println(m + " " + average);
        }
        */
    }
}
