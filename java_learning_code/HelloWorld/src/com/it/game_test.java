package com.it;
//你好，贪吃蛇（game_test）
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;
import java.util.Random;

public class game_test extends JPanel implements ActionListener, KeyListener {

    private static final int CELL_SIZE = 25;
    private static final int GRID_WIDTH = 20;
    private static final int GRID_HEIGHT = 15;
    private static final int PANEL_WIDTH = CELL_SIZE * GRID_WIDTH;
    private static final int PANEL_HEIGHT = CELL_SIZE * GRID_HEIGHT;
    private static final int INITIAL_SPEED = 150;

    private enum Direction { UP, DOWN, LEFT, RIGHT }

    private LinkedList<Point> snake;
    private Point food;
    private Direction direction;
    private Timer timer;
    private boolean gameOver;
    private int score;
    private Random random;

    public game_test() {
        snake = new LinkedList<>();
        random = new Random();
        timer = new Timer(INITIAL_SPEED, this);
        timer.start();

        addKeyListener(this);
        setFocusable(true);
        setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        setBackground(Color.BLACK);
        setDoubleBuffered(true);

        resetGame();
    }

    private void resetGame() {
        snake.clear();
        int startX = GRID_WIDTH / 2;
        int startY = GRID_HEIGHT / 2;
        for (int i = 0; i < 3; i++) {
            snake.add(new Point(startX - i, startY));
        }
        direction = Direction.RIGHT;
        score = 0;
        gameOver = false;
        spawnFood();
    }

    private void spawnFood() {
        int x, y;
        do {
            x = random.nextInt(GRID_WIDTH);
            y = random.nextInt(GRID_HEIGHT);
        } while (snake.contains(new Point(x, y)));
        food = new Point(x, y);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (gameOver) {
            g.setColor(Color.WHITE);
            g.setFont(new Font("微软雅黑", Font.BOLD, 30));
            g.drawString("游戏结束!", PANEL_WIDTH / 2 - 80, PANEL_HEIGHT / 2 - 20);
            g.setFont(new Font("微软雅黑", Font.PLAIN, 18));
            g.drawString("得分: " + score, PANEL_WIDTH / 2 - 40, PANEL_HEIGHT / 2 + 20);
            g.setFont(new Font("微软雅黑", Font.PLAIN, 14));
            g.drawString("按 空格 重新开始", PANEL_WIDTH / 2 - 60, PANEL_HEIGHT / 2 + 50);
            return;
        }

        g.setColor(Color.RED);
        g.fillOval(food.x * CELL_SIZE + 2, food.y * CELL_SIZE + 2,
                   CELL_SIZE - 4, CELL_SIZE - 4);

        for (int i = 0; i < snake.size(); i++) {
            Point p = snake.get(i);
            if (i == 0) {
                g.setColor(Color.GREEN);
            } else {
                g.setColor(new Color(45, 180, 0));
            }
            g.fillRoundRect(p.x * CELL_SIZE + 1, p.y * CELL_SIZE + 1,
                            CELL_SIZE - 2, CELL_SIZE - 2, 5, 5);
        }

        g.setColor(Color.WHITE);
        g.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        g.drawString("得分: " + score, 10, 20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (gameOver) return;

        Point head = snake.getFirst();
        Point newHead = new Point(head);

        switch (direction) {
            case UP:    newHead.y--; break;
            case DOWN:  newHead.y++; break;
            case LEFT:  newHead.x--; break;
            case RIGHT: newHead.x++; break;
        }

        if (newHead.x < 0 || newHead.x >= GRID_WIDTH ||
            newHead.y < 0 || newHead.y >= GRID_HEIGHT ||
            snake.contains(newHead)) {
            gameOver = true;
            repaint();
            return;
        }

        snake.addFirst(newHead);

        if (newHead.equals(food)) {
            score += 10;
            spawnFood();
        } else {
            snake.removeLast();
        }

        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (gameOver) {
            if (key == KeyEvent.VK_SPACE) {
                resetGame();
                repaint();
            }
            return;
        }

        switch (key) {
            case KeyEvent.VK_UP:    case KeyEvent.VK_W:
                if (direction != Direction.DOWN)  direction = Direction.UP;
                break;
            case KeyEvent.VK_DOWN:  case KeyEvent.VK_S:
                if (direction != Direction.UP)    direction = Direction.DOWN;
                break;
            case KeyEvent.VK_LEFT:  case KeyEvent.VK_A:
                if (direction != Direction.RIGHT) direction = Direction.LEFT;
                break;
            case KeyEvent.VK_RIGHT: case KeyEvent.VK_D:
                if (direction != Direction.LEFT)  direction = Direction.RIGHT;
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("贪吃蛇小游戏");
        game_test game = new game_test();
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}