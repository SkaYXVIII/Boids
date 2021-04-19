package boids;

import boids.gui.Animation;
import boids.gui.AnimationPanel;
import boids.write_to_file.WriteToCSVFile;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Boids");
        AnimationPanel panel = new AnimationPanel();

        panel.setPreferredSize(new Dimension(1000, 500));
        frame.getContentPane().add(BorderLayout.CENTER, panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setIgnoreRepaint(true);
        frame.pack();
        frame.setVisible(true);
        WriteToCSVFile write = new WriteToCSVFile();
        write.addHeading();

        panel.startAnimation(Animation.UNLIMITED_FPS);

    }
}
