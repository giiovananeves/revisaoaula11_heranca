public class Administrador extends Empregado 
{
    private double ajudaCustos;
    
    public double getAjudaCustos() 
    {
        return ajudaCustos;
    }

    public void setAjudaCustos(double ajudaCustos) {
        this.ajudaCustos = ajudaCustos;
    }



    public double calculaSalario(double ajudaCustos)
    {
        double salarioLiq;

        salarioLiq = calculaSalario() + ajudaCustos ;
        return salarioLiq;
    }
}