
public class FactoryMethod {

    public LeitoresDeConfiguracao criar (String tipo){

        switch (tipo){

            case "XML": return new XML();

            case "YAML": return new YAML();

            case "JSON": return new JSON();

            default:
                System.out.println("Tipo inválido");
                break;
        }

        return null;
    }
}
