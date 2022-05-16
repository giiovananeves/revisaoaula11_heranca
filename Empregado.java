public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salariaBase;
    private double imposto;


    

    public int getCodigoSetor() {
        return codigoSetor;
    }




    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }




    public double getSalariaBase() {
        return salariaBase;
    }




    public void setSalariaBase(double salariaBase) {
        this.salariaBase = salariaBase;
    }




    public double getImposto() {
        return imposto;
    }




    public void setImposto(double imposto) {
        this.imposto = imposto;
    }




    public void calcularSalario(){

        double salarioLiquido;
        salarioLiquido=salarioBase-imposto/100*salarioBase;


    }
    
}
