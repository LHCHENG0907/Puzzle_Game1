package main;

public class Game {
    private GamePanel gamePanel;

    public Game() {

        gamePanel = new GamePanel(); // 創建遊戲控制板
        new GameWindow(gamePanel);

        gamePanel.startGameThread(); // GameLoop，啟動！
        gamePanel.requestFocus();
    }
}
