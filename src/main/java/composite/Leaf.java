package composite;

/**
 * @author hellen
 * @date 2018/7/15
 */
public class Leaf implements Component {
    @Override
    public Component get() {
        return this;
    }

    @Override
    public void sampleComponent() {
        System.out.println("sample something");
    }
}
