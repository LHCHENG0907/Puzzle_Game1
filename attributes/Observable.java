package attributes;

public interface Observable<E> {
    public void notify(E source);
}
