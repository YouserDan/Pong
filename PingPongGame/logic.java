package PingPongGame;

import javax.management.StringValueExp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class logic extends JPanel implements ActionListener, KeyListener {
    // bits height
    private int Bit1y = 150, Bit2y = 150;
    // ball position
    private int BallPX = 295, BallPY = 185;
    // ball speed
    private int BallX = 3, BallY = 3;
    // score
    private int player1 = 0, player2 = 0;
    private Timer time;

    public logic() {
        addKeyListener(this);
        time = new Timer(10, this);
        setFocusable(true);

    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        // bg
        g.fillRect(0, 0, 600, 400);

        g.setColor(Color.WHITE);
        g.drawLine(300, 0, 300, 400);
        // bit1
        g.setColor(Color.WHITE);
        g.fillRect(0, Bit1y, 10, 70);
        // bit2
        g.setColor(Color.WHITE);
        g.fillRect(572, Bit2y, 10, 70);
        // ball
        g.fillOval(BallPX, BallPY, 10, 10);
        // score
        Font f = new Font("Arial", Font.BOLD, 30);
        g.setFont(f);
        g.drawString(String.valueOf(player1), 250, 30);
        g.drawString(String.valueOf(player2), 335, 30);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // ball move
        BallPX += BallX;
        BallPY += BallY;
        if (BallPY < 0) {
            BallY = -BallY;
        }
        if (BallPY > 350) {
            BallY = -BallY;
        }
        // bit2 autoplay
        if (BallPY - 50 <= Bit2y && BallPX > 300 && BallX > 0) {
            Bit2y -= 2;
        }
        if (BallPY - 50 >= Bit2y && BallPX >= 300 && BallX > 0) {
            Bit2y += 2;
        }
        // bit1 rebound
        if (new Rectangle(BallPX, BallPY, 10, 10).intersects(new Rectangle(0, Bit1y, 10, 70))) {
            BallX = -BallX;
        }

        // bit2 rebound
        if (new Rectangle(BallPX, BallPY, 10, 10).intersects(new Rectangle(572, Bit2y, 10, 70))) {
            BallX = -BallX;
        }

        // score left and right
        if (BallPX < -20) {
            player2++;
            time.stop();
            BallPX = 295;
            BallPY = 185;
            Bit1y = 150;
            Bit2y = 150;
        }
        if (BallPX > 620) {
            player1++;
            time.stop();
            BallPX = 295;
            BallPY = 185;
            Bit1y = 150;
            Bit2y = 150;
        }

        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // bit1 move
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            Bit1y += 5;
            if (Bit1y > 290) {
                Bit1y = 290;
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            Bit1y -= 5;
            if (Bit1y < 0) {
                Bit1y = 0;
            }
        }

        // bit2 move
        if (e.getKeyCode() == KeyEvent.VK_1) {
            Bit2y += 5;
            if (Bit2y > 290) {
                Bit2y = 290;
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_2) {
            Bit2y -= 5;
            if (Bit2y < 0) {
                Bit2y = 0;
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            time.start();
        }
    }
}
