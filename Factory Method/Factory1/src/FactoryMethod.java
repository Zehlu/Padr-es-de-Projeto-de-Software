
public class FactoryMethod {

    public Documentos criar (String tipo){

        switch (tipo){

            case "PDF": return new PDF();

            case "Word": return new Word();

            case "HTML": return new HTML();

            default:
                System.out.println("Tipo de documento inválido");
                break;
        }

        return null;
    }
}
