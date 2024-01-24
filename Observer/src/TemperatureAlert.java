public class TemperatureAlert extends Subject{

    private int temperatura;

    public void mudarTemperatura (int novTemp){
        this.temperatura = novTemp;
        System.out.println(" ");
        System.out.println("Temperatura mudada para " + this.temperatura + "°");
        notifyAl();
        System.out.println(" ");

    }
}
