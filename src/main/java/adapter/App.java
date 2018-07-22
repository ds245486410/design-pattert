package adapter;

/**
 * @author hellen
 * @date 2018/7/14
 */
public class App {
    public static void main(String[] args) {
        Caption caption = new Caption(new MyFishBoatAdapter());
        caption.go();
    }
}
