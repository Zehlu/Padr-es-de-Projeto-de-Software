public class AdapterPreexistente implements Interface{
    Preexistente preexistente;

    public AdapterPreexistente() {
        this.preexistente = new Preexistente();
    }

    public void insert(){
        this.preexistente.insertMysql();
    }
    public void update(){
        this.preexistente.updateMysql();
    }
    public void delete(){
        this.preexistente.deleteMysql();
    }
}