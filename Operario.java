public class Operario extends Empregado 
{
    private double valorProd;
    private double comissao;

    

    public double getValorProd() 
    {
        return valorProd;
    }

    public void setValorProd(double valorProd) 
    {
        this.valorProd = valorProd;
    }

    public double getComissao() 
    {
        return comissao;
    }

    public void setComissao(double comissao) 
    {
        this.comissao = comissao;
    }

    public double calculaSalario(double comissao)
    {
        double salarioLiq = calculaSalario() + valorProd * comissao;
        return salarioLiq;
    }
}