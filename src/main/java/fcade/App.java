package fcade;

/**
 * @author hellen
 * @date 2018/7/15
 */
public class App {
    public static void main(String[] args) {
        ControllerFacde facde = new ControllerFacde(new Light(), new Sersor());
        facde.controllerstart();
        facde.controllerstop();
    }
}
