package attributes;

import java.awt.Graphics2D;

public class DrawbleComposite extends Composite<Drawble> implements Drawble {

    @Override
    public void draw(Graphics2D g2d) {
        for (Drawble d : compositeChilds) { // 跑過每個字節點
            d.draw(g2d); // 繪製
        }
    }

}
