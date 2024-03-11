package levelsHandl;

import java.awt.Graphics2D;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import attributes.DrawbleComposite;
import attributes.Scene;
import commands.LevelsMasterBackSceneCommand;
import commands.LevelsMasterNextSceneCommand;
import main.GamePanel;
import scenes.ColorFlopPuzzle;
import scenes.Desk;
import scenes.Entry;
import scenes.Finish;

public class LevelsMaster extends DrawbleComposite {
    private Scene current_scene;// 現在狀態
    private GamePanel gamePanel;

    public LevelsMaster(GamePanel gp) {
        super();
        gamePanel = gp;
        // 以下可以自由的連接場景

        LevelsMasterNextSceneCommand nextSceneCommand = new LevelsMasterNextSceneCommand(this);
        LevelsMasterBackSceneCommand backSceneCommand = new LevelsMasterBackSceneCommand(this);

        Entry entry = new Entry();
        Desk desk = new Desk();
        Finish finish = new Finish();
        ColorFlopPuzzle colorFlop = new ColorFlopPuzzle(nextSceneCommand, backSceneCommand);

        entry.setNextScene(desk);
        desk.setBackScene(entry);

        desk.setNextScene(finish);

        current_scene = colorFlop; // 設定初始場景

        loadMouse(current_scene);
    }

    private void unloadMouse(Scene s) {
        for (MouseListener mouseListener : s.getMouseListeners()) {
            gamePanel.removeMouseListener(mouseListener);
        }
        for (MouseMotionListener mouseMotionListener : s.getMouseMotionListeners()) {
            gamePanel.removeMouseMotionListener(mouseMotionListener);
        }
    }

    private void loadMouse(Scene s) {
        for (MouseListener mouseListener : s.getMouseListeners()) {
            gamePanel.addMouseListener(mouseListener);
        }
        for (MouseMotionListener mouseMotionListener : s.getMouseMotionListeners()) {
            gamePanel.addMouseMotionListener(mouseMotionListener);
        }
    }

    public void nextScene() {

        if (current_scene.getIterator().haveNext()) {
            System.out.println("下個場景");
            Scene newScene = current_scene.getIterator().getNext();
            unloadMouse(current_scene); // 釋放當前
            current_scene = newScene;// 移動場景
            loadMouse(newScene); // 載入

        }

    }

    public void backScene() {
        if (current_scene.getIterator().havetBack()) {
            System.out.println("上個場景");
            Scene newScene = current_scene.getIterator().getBack();
            unloadMouse(current_scene); // 釋放當前
            current_scene = newScene; // 移動場景
            loadMouse(newScene); // 載入
        }
    }

    @Override
    public void draw(Graphics2D g2D) {
        current_scene.getScene().draw(g2D);
    }

    public void update() {

    }

}