public class Turista {


    // Atributos - Variaves de
    private String nome;
    private String cpf;

    //construtor
    Turista(){}
    //Construtor personalizado
    Turista(String _nome){
       this.nome = _nome;
    }

    //Métodos
    public String viajar(){
        return "Viajou!!";
    }
    //  Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        // Validar CPF

        this.cpf = cpf;
    }
}
