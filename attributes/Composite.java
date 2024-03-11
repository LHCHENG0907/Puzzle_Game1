package attributes;

import java.util.ArrayList;

public class Composite<E> {
    public ArrayList<E> compositeChilds = new ArrayList<E>();

    public void addComposite(E c) {
        compositeChilds.add(c);// 添加到最後
    }

    public void removeComposite(E c) {
        compositeChilds.remove(c);
    }

}