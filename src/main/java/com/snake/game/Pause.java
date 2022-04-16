package main.java.com.snake.game;

import javax.swing.*;

public class Pause {

    public Pause(){
        String title = "Pause";
        String message = "Press the button below to go back to the game!";
        String buttonname = "Back to Game";

        //JOptionPane.showMessageDialog(null, "infoMessage", "InfoBox: " + "titleBar", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane pauseBox = new JOptionPane(message,JOptionPane.WARNING_MESSAGE);
        pauseBox.createDialog(buttonname);
        JDialog dialog = pauseBox.createDialog(title);

        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

}
