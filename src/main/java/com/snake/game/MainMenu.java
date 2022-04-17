package com.snake.game;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class MainMenu extends JFrame{
    private JLabel title;
    private JLabel instructions;
    private JLabel pause;
    private JButton onePlayerButton;
    private JButton twoPlayerButton;
    private JPanel panel;

    public MainMenu(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        title = new JLabel("SNAKE");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        instructions = new JLabel("use arrow keys and w,a,s,d to play");
        instructions.setAlignmentX(Component.CENTER_ALIGNMENT);
        pause = new JLabel("press 'esc' to pause");
        pause.setAlignmentX(Component.CENTER_ALIGNMENT);
        onePlayerButton = new JButton();
        onePlayerButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        twoPlayerButton = new JButton();
        twoPlayerButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        onePlayerButton.setText("One Player");
        onePlayerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startGame(e, "one");
            }
        });

        twoPlayerButton.setText("Two Players");
        twoPlayerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startGame(e, "two");
            }
        });

        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(title);
        panel.add(Box.createRigidArea(new Dimension(0, 100)));
        panel.add(onePlayerButton);
        panel.add(twoPlayerButton);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(instructions);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
        panel.add(pause);
        this.add(panel);
    }

    private void startGame(ActionEvent e, String gamemode){
        Window.gamemode = gamemode;
        Window game = new Window();

        game.setTitle("Snake");
        game.setSize(300,300);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setVisible(true);
        this.setVisible(false);
    }
}
