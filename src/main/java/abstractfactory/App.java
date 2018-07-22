package abstractfactory;

/**
 * @author hellen
 * @date 2018/7/8
 */

public class App {

    private Army army;
    private Castle castle;
    private King king;


    public static void main(String[] args) {
        App app = new App();
        app.create(FactoryMacker.maker("tang"));
        app.order();
        app.create(FactoryMacker.maker("han"));
        app.order();
    }
    static class FactoryMacker{
        static MyFactory  maker(String name){
            MyFactory result = null;
            switch (name){
                case "tang" :  result = new TangFactory();break;
                case  "han" :  result = new HanFactory();break;
                default:System.out.println("something error");
            }
            return result;
        }
    }
    public void create(MyFactory factory){
         army = factory.createArmy();
         castle = factory.createCastle();
         king = factory.createKing();
    }

    public void order(){
        army.attack();
        castle.building();
        king.order();
    }


}
