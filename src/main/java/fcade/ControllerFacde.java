package fcade;

/**
 * @author hellen
 * @date 2018/7/15
 */
public class ControllerFacde {
    private Light light;
    private Sersor sersor;

    public ControllerFacde(Light light, Sersor sersor) {
        this.light = light;
        this.sersor = sersor;
    }
    public void controllerstart(){
        sersor.start();
        light.light();
    }

    public void controllerstop(){
        sersor.stop();
        light.stop();
    }
}
