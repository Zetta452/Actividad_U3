package actividad_3;

//clase padre empleado de la cal se van a ligar las diferentes clases hijos
//con la segregacion de los diferentes empleados 
//se va a usar en clase asbtract para crear funciones sin nececidad de 
//definirle una accion expesifica
abstract public class Empleado {

    //atributos de la clase padre 
    //alamcena el nombre del trabajador 
    protected String nombre;
    //almacena el tiempo que lleva en la empresa 
    protected int tiempoEmpresa;

    //constructor de la clase
    public Empleado(String nombre, int tiempoEmpresa) {
        this.nombre = nombre;
        this.tiempoEmpresa = tiempoEmpresa;
    }

    //Metodo abtracto para calaular el salari
    public abstract double calcularSalarioBruto();

    //calcular las reducion por salud
    public double retencionSalud(double salairioBruto) {

        //calular la retencion por salud y pension 
        //la retencion de la salud y a pension va hacer del 4%
        double saludPension = salairioBruto * 0.4;

        //retorna el valor de la reduccion de pension
        return saludPension;
    }
    //calcular la reduccion por arl 
    public double retencionarl(double salarioBruto) {

        //almacena el valor de deduccion por ARL
        //la reduccion por arl es de 5%
        double arl = salarioBruto * 0.5;

        //retorna el valor calcualdo de la ARL
        return arl;
    }

    //funcion para calular el salario neto del empleado    
    public double salarioNeto(){
        //salario bruto sin deducciones
        double bruto = calcularSalarioBruto();
        //deduciones por arl, salud y pension
        double retencion = retencionSalud(bruto) + retencionarl(bruto);
        //salario neto a pagar
        double neto = bruto - retencion; 
        //retorno del salario neto
        return neto;
    }
}
