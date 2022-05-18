public class Pessoa
{
    private String nome;
    private String endereco;
    private String tel;

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getEndereco() 
    {
        return endereco;
    }

    public void setEndereco(String endereco) 
    {
        this.endereco = endereco;
    }

    public String getTel() 
    {
        return tel;
    }
    
    public void setTel(String tel) 
    {
        this.tel = tel;
    }

    public Pessoa(String nome)
    {
        this.nome = nome;
    }

    public Pessoa(String nome, String tel) 
    {
        this.nome = nome;
        this.tel = tel;
    }

    public Pessoa()
    {

    }

}