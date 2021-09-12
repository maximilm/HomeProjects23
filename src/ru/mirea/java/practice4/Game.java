package ru.mirea.java.practice4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game extends JFrame {

    JButton realM = new JButton("Real Madrid");
    JButton milan = new JButton("AC Milan");

    JLabel score = new JLabel();
    JLabel winComand = new JLabel();
    JLabel lastGol = new JLabel();

    int milGoal = 0, madrGoal = 0;

    public Game() {
        super("Real Madrid vs AC Milan");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setLayout(new GridLayout(3, 1));
        add(realM);
        setSize(500,500);

        updateScore();
        updateWinComand();

        milan.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++milGoal;
                updateWinComand();
                updateScore();
                updateLastGoal("AC Milan");
            }
        });

        realM.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madrGoal++;
                updateWinComand();
                updateScore();
                updateLastGoal("Real Madrid");
            }
        });

        Font fnt = new Font("Times new roman",Font.BOLD,50);
        Font fnt22 = new Font("Times new roman",Font.BOLD,22);
        add(winComand);
        winComand.setVerticalAlignment(JLabel.CENTER);
        winComand.setHorizontalAlignment(JLabel.CENTER);
        winComand.setFont(fnt22);
        add(milan);
        add(score);
        score.setVerticalAlignment(JLabel.CENTER);
        score.setHorizontalAlignment(JLabel.CENTER);
        score.setFont(fnt);
        add(lastGol);
        lastGol.setVerticalAlignment(JLabel.CENTER);
        lastGol.setHorizontalAlignment(JLabel.CENTER);
        lastGol.setFont(fnt22);
    }

    public void updateWinComand() {
        if (milGoal > madrGoal)
            winComand.setText("Winner AC Milan");
        else if (milGoal < madrGoal)
            winComand.setText("Winner Real Madrid");
        else
            winComand.setText("Winner draw");
    }

    public void updateLastGoal(String comand) {
        lastGol.setText("Last goal " + comand);
    }

    public void updateScore() {
        score.setText( madrGoal + "||" + milGoal);
    }

    public static void main(String[] args) {
        new Game().setVisible(true);
    }
}