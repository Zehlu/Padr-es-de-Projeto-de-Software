
public class Main {
    public static void main(String[] args) {

        Preexistente preexistente = new Preexistente();

        //erro ao tentar usar preexistente.insert()


        AdapterPreexistente adapterPreexistente = new AdapterPreexistente();


        adapterPreexistente.insert();
        adapterPreexistente.update();
        adapterPreexistente.delete();

    }
}