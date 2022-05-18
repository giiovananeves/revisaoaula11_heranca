public class Empregado  extends Pessoa
{
    private int codSetor;
    private double salarioBase;
    private double imposto;
     
    public int getCodSetor() 
    {
        return codSetor;
    }

    public void setCodSetor(int codSetor) 
    {
        this.codSetor = codSetor;
    }

    public double getSalarioBase() 
    {
        return salarioBase;
    }

    public void setSalarioBase(double salariBase) 
    {
        this.salarioBase = salariBase;
    }

    public double getImposto() 
    {
        return imposto;
    }

    public void setImposto(double imposto) 
    {
        this.imposto = imposto;
    }

    public double calculaSalario()
    {
        double salarioLiq;

         return salarioLiq = salarioBase - imposto/100 * salarioBase;
    }
}