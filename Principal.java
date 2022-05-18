public class Principal 
{
    public static void main(String[] args) 
    {
        Empregado empregado = new Empregado();
        Operario operario = new Operario();
        Administrador administador = new Administrador();   

        operario.setSalarioBase(2000);
        administador.setSalarioBase(3500);

        System.out.println(operario.calculaSalario());
        System.out.println(administador.calculaSalario());

        System.out.println(operario.calculaSalario());
    }
   
}