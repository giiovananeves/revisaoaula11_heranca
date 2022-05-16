public class Pessoa{

    private String nome;
    private String endereçco;
    private String telefone;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereçco() {
        return endereçco;
    }
    public void setEndereçco(String endereçco) {
        this.endereçco = endereçco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Pessoa(String nome) {
        this.nome = nome;
    }
    public Pessoa(String nome, String endereçco) {
        this.nome = nome;
        this.endereçco = endereçco;
    }

    public Pessoa(){
        
    }
}