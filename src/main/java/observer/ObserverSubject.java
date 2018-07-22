package observer;

/**
 * @author hellen
 * @date 2018/7/22
 */
public interface ObserverSubject {
    void attach(ObserverAble observerAble);
    void detach(ObserverAble observerAble);
    void notice();
}
