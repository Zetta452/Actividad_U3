package actividad_3;

//calse hija para los empelados temporales
public class EmpleadoTemporal extends Empleado {

    //propiedades de la clase 
    private double salarioMensual;

    //constructor de la clase
    public EmpleadoTemporal(double salarioMensual, String nombre, int tiempoEmpresa) {
        super(nombre, tiempoEmpresa);
        this.salarioMensual = salarioMensual;
    }

    //como este empleado no tiene ni bono ni beneficios pues solo se le retorna el valor de su salaio bruto 
    @Override
    public double calcularSalarioBruto() {

        return salarioMensual;
    }

    @Override
    public void imprimir() {
        System.out.println("Empleado temporal");
        System.out.println("Nombre = " + nombre);
        System.out.println("______________________________");
        System.out.println("salario mensual = $" + salarioMensual );
        System.out.println("ARL  = -$" + retencionarl(salarioMensual) );
        System.out.println("SALUD = -$" + retencionSalud(salarioMensual) );
        System.out.println("_______________________________");
        System.out.println("Salario neto a pagar = $" + salarioNeto());
        
    }

    
}
