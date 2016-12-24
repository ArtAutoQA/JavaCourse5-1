package module8.webinar.generics;

public interface DbServiceInterface<T> {
    T save(T t);

    T delete(T t);
}
