package main;

import javax.swing.JFrame;

public class GameWindow {
    private JFrame jFrame;

    public GameWindow(GamePanel gamePanel) {
        jFrame = new JFrame();// 創建一個畫面
        jFrame.setTitle("Puzzle game"); // 視窗標題
        jFrame.setResizable(false); // 鎖定視窗大小(使用者不可調整適窗)
        jFrame.setLocationRelativeTo(null); // 不依賴其他物件位置
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 退出時關閉視窗

        jFrame.add(gamePanel);
        jFrame.pack(); // 視窗框自適應調整

        jFrame.setVisible(true); // 視窗改成可見
    }
}
