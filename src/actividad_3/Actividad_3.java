package actividad_3;

public class Actividad_3 {

    public static void main(String[] args) {
        Empleado e1 = new EmpleadoAsalariado("sebastian", 6, 2000000);
        //calulamos el salario bruto
        e1.calcularSalarioBruto();
        //calulamos el salario total
        e1.salarioNeto();
        //imprimir los datos
        e1.imprimir();

        System.out.println("");
        System.out.println("*************************************");
        Empleado e2 = new EmpleadoComision(1000000, 23000000, 20, "Navarro", 2);
        e2.imprimir();

        System.out.println("");
        System.out.println("*************************************");
        Empleado e3 = new EmpleadoTemporal(2000000, "ponton", 6);
        e3.imprimir();

        System.out.println("");
        System.out.println("**********************************");
        Empleado e4 = new EmpleadosHora(50, 20000, true, "Marlon", 6);
        e4.imprimir();

    }
}
