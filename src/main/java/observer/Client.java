package observer;

/**
 * @author hellen
 * @date 2018/7/22
 */
public class Client  {
    public static void main(String[] args) {
        WatcherSubject watcherSubject = new WatcherSubject();
        watcherSubject.attach(new Orcs());
        watcherSubject.attach(new HobbyObserver());
        watcherSubject.timespace();
    }
}
