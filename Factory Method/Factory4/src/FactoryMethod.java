
public class FactoryMethod {

    public Eventos criar (String tipo){

        switch (tipo){

            case "Aviso": return new Aviso();

            case "Informativo": return new Informativo();

            case "Erro": return new Erro();

            default:
                System.out.println("Tipo inválido");
                break;
        }

        return null;
    }
}
