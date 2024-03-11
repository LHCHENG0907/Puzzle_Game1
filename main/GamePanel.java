package main;

import java.awt.Color; //顏色
import java.awt.Dimension; //目前用於表是座標
import java.awt.Graphics;//圖像
import java.awt.Graphics2D;//2D圖像
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;//控制面版

import levelsHandl.LevelsMaster;

public class GamePanel extends JPanel implements Runnable { // 繼承JPanel，實作多執行緒run

    // 螢幕設定
    private final int screenHigh = 512; // 畫面高度
    private final int screenWidth = 768; // 畫面寬度
    private final int FPS = 60;// 每秒刷新幀數

    Thread gameThread; // 建立執行緒
    private final Timer timer = new Timer();
    private LevelsMaster levelsMaster;// 關卡封裝

    public GamePanel() {
        levelsMaster = new LevelsMaster(this); // 創建關卡

        setPreferredSize(new Dimension(screenWidth, screenHigh));// 優先畫面大小
        setBackground(Color.WHITE);// 設定背景顏色
        setDoubleBuffered(true);// 窗重劃面
        setFocusable(true); // 控制板能被選取

    }

    public void startGameThread() {
        gameThread = new Thread(this); // 把此物件加入gameThread執行緒
        gameThread.start(); // 執行緒，啟動！
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g); // 呼叫JPanel的繪製方法
        Graphics2D g2D = (Graphics2D) g;// 轉換成2D圖像

        levelsMaster.draw(g2D); // 繪製畫面

        g2D.dispose(); // 釋放

    }

    @Override
    public void run() {
        long Interval = 1000 / FPS; // 儲存所需間隔毫秒
        timer.schedule(new repaintTask(), Interval, Interval);

    }

    public class repaintTask extends TimerTask {
        public void run() {
            levelsMaster.update();
            repaint();
        }
    }

}
