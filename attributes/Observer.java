package attributes;

public interface Observer<E> {
    public void addObserver(E object);

    public void removeObserver(E object);

}
