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

    
}
