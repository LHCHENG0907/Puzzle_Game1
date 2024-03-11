package attributes;

import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;

public class _暫時封印_危險_隨時解封_DragDecorator extends JComponent implements MouseMotionListener {
    JComponent element;
    boolean isDragging = false;

    public _暫時封印_危險_隨時解封_DragDecorator(JComponent c) {
        super();
        element = c;

    }

    public void EnableDragging() {
        for (MouseMotionListener listener : element.getMouseMotionListeners()) {
            if (listener == this) { // MouseMotionListener中已有this
                return; // 使用回傳中斷程式
            }
        }
        element.addMouseMotionListener(this);
    }

    public void DisableDragging() {
        element.removeMouseMotionListener(this);
    }

    @Override
    public void mouseDragged(MouseEvent e) { // 這個好像就直接是Visitor pattern
        if (isDragging) {
            int mouseX = e.getX();// 取得滑鼠X座標
            int mouseY = e.getY();// 取得滑鼠Y座標
            element.setLocation(mouseX, mouseY); // 把物件位置設定至滑鼠座標
        }
    } // 點選並拖曳元件

    @Override
    public void mouseMoved(MouseEvent e) {
    }

}
