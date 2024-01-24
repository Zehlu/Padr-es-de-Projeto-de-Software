public class ClickCounter extends Subject{
    private int contador;

    public void click (){
        contador += 1;
        System.out.println(" ");
        System.out.println("Clicks Realizados: " + contador);
        notifyAl();
        System.out.println(" ");
    }
}
