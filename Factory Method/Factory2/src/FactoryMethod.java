public class FactoryMethod {

    public Inimigos criar (String tipo){

        switch (tipo){

            case "Soldado": return new Soldado();

            case "Monstro": return new Monstro();

            case "Chefe": return new Chefe();

            default:
                System.out.println("Tipo de inimigo inválido");
                break;
        }

        return null;
    }
}