package actividad_3;
//clase empleado a salariado que es hija de la clase padre empleado

public class EmpleadoAsalariado extends Empleado {

    //este empleado pose un salario mensual establecido
    private double salarioMensual;

    //costructor de la clase empleado asalariado 
    public EmpleadoAsalariado(String nombre, int tiempoEmpresa, double salarioMensual) {
        super(nombre, tiempoEmpresa);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalarioBruto() {
        //los empleados a salaridos poseen un bono de alimentacion con un valor de 1.000.000
        double bonoAlimentacion = 1000000;
        //retorna el valor de su salario bruto
        return this.salarioMensual + bonoAlimentacion;
    }

}
