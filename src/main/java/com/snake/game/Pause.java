package main.java.com.snake.game;

import javax.swing.*;

public class Pause {

    public Pause(){
        String title = "Pause";
        String message = "Press the button below or exit pop-up to go back to the game!";
        String[] buttonname = {"Back to Game"};

        JOptionPane.showOptionDialog(null,
                message,
                title,
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                buttonname, // this is the array
                "default");

    }

}
