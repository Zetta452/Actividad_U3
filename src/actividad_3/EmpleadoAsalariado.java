package actividad_3;
//clase empleado a salariado que es hija de la clase padre empleado

public class EmpleadoAsalariado extends Empleado {

    //este empleado pose un salario mensual establecido
    private double salarioMensual;
    private double bonoAntiguedad = 0;
    private double bonoAlimentacion = 1000000;

    //costructor de la clase empleado asalariado 
    public EmpleadoAsalariado(String nombre, int tiempoEmpresa, double salarioMensual) {
        super(nombre, tiempoEmpresa);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalarioBruto() {
        //los empleados a salaridos poseen un bono de alimentacion con un valor de 1.000.000
        //retorna el valor de su salario bruto
        //vaiable para guardar el beneficio de antiguedad

        //comprobar si posee mas de 5 años de permanecia en la empresa
        if (tiempoEmpresa > 5) {
            //si cumple con la condicion obtien un bono del 10% por antiguedad
            bonoAntiguedad= salarioMensual * 0.10;
        }
        return this.salarioMensual + bonoAlimentacion + bonoAntiguedad;
    }

    @Override
    public void imprimir() {
        System.out.println("Empleado a salariado:");
        System.out.println("Nombre = " + this.nombre);
        System.out.println("_____________________________________________");
        System.out.println("Salaro fijo mensual = $" + this.salarioMensual);
        if (tiempoEmpresa > 5) {
            System.out.println("bono antiguedad = $" + bonoAntiguedad );
        }
        System.out.println("Bono de alimentacion = $" + this.bonoAlimentacion );
        System.out.println("________________________________________________");
        System.out.println("salario burto = $" + calcularSalarioBruto());
        System.out.println("Arl  = $-" +retencionarl(calcularSalarioBruto()) );
        System.out.println("salud = $-" +retencionSalud(calcularSalarioBruto()) );
        System.out.println("__________________________________________________");
        System.out.println("Salario neto a pagar = $" + salarioNeto() );
    }

}
