package com.snake.game;

import org.junit.Test;

import java.awt.Button;
import java.awt.event.KeyEvent;

import static org.junit.jupiter.api.Assertions.*;

public class PauseTest {

    @Test
    public void testPause() {
        //com.snake.game.ThreadsController c = new com.snake.game.ThreadsController(new Tuple(5,5));
        assertEquals(false, ThreadsController.paused);
        KeyboardListener k = new KeyboardListener();
        k.keyPressed(new KeyEvent(new Button(), KeyEvent.VK_ESCAPE, 100, 0, KeyEvent.VK_ESCAPE, (char)27));
        assertEquals(true, ThreadsController.paused);
    }
}
