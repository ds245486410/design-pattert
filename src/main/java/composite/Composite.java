package composite;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hellen
 * @date 2018/7/15
 */
public class Composite implements Component {

    private   Map<String,Component> map = new HashMap();
    @Override
    public Component get() {
        return this;
    }

    @Override
    public void sampleComponent() {

    }

    void add(String name,Component component){
        map.put(name,component);
    }

    void remove(String name){
        map.remove(name);
    };
    Component getComponent(String name){
       return map.get(name);
    }
}
