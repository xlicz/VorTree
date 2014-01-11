package ru.spbu.astro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.spbu.astro.model.Point;
import ru.spbu.astro.utility.PointGenerator;
import ru.spbu.astro.vortree.VorTreeBuilder;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VorTreeBuilderEngine {
    private static int POINTS_COUNT = 100;

    private static int SIZE_X = 1320;
    private static int SIZE_Y = 660;

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        VorTreeBuilder tree = (VorTreeBuilder)context.getBean("vorTreeBuilder");

        List<Point> points = new ArrayList();
        points.addAll(PointGenerator.nextGaussians(POINTS_COUNT / 2));
        points.addAll(PointGenerator.nextGaussians(POINTS_COUNT / 2, 44, 0));


        tree.build(points);
        Component component = tree.getComponent(SIZE_X, SIZE_Y);

        JWindow window = new JWindow();
        window.setSize(SIZE_X, SIZE_Y);
        window.getContentPane().add(component);
        window.setVisible(true);
    }
}
