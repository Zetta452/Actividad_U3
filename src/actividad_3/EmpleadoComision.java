
package actividad_3;

//clase de los empleados por comision la cula es una hija de la clase padre empleado
public class EmpleadoComision extends Empleado{

//propiedades de la clase 
    private double salarioBase;
    private double ventas;
    private double porcentajeComision;
    private double bonoAlimentacion = 1000000;
    private double comisionVentas;
    private double bonoExtra;
    
    //constructor de la clase
    public EmpleadoComision(double salarioBase, double ventas, double porcentajeComision, String nombre, int tiempoEmpresa) {
        super(nombre, tiempoEmpresa);
        //comprovacion que las ventas no tienes valores negativos y si es asi los deja como 0 
        if (ventas < 0){
        ventas = 0;}
        
        this.salarioBase = salarioBase;
        this.ventas = ventas;
        this.porcentajeComision = porcentajeComision;
        this.calcularSalarioBruto();
        
    }
    
    @Override
    public double calcularSalarioBruto() {
       
        //calulamos el valor del porsentaje de comision
        //dividimos el valor entre 100 para poder obtener el valor del porsentaje con decimal y que el usuario 
        //pueda escribir el numero normal
        this.comisionVentas = ventas * (porcentajeComision/100) ;
        this.bonoExtra = 0;
        
        //comprovacion del la condicion de 20.000.000 en venta
        if (ventas > 20000000){
            //obtenemos el valor del bono extra el cula tiene un porsentaje de 3%
        bonoExtra = ventas * 0.03;
        }
        //sumatoria de todos los valores agregados para conocer su salario bruto
        return comisionVentas + bonoExtra + this.salarioBase + this.bonoAlimentacion;    
    }

    @Override
    public void imprimir() {
        System.out.println("Empleado por comision");
        System.out.println("Nombre = " + this.nombre);
        System.out.println("Porcentaje de comision es de = %" + porcentajeComision);
        System.out.println("_______________________________" );
        System.out.println("Salario base = $" + this.salarioBase);
        System.out.println("Comision por venta = $" + comisionVentas);
        if (ventas > 20000000 ) {
            System.out.println("Bono extra por venta = $" + bonoExtra);
        }
        System.out.println("Bono de alimentacion = $" + bonoAlimentacion);
        System.out.println("__________________________________________");
        System.out.println("Salario bruto = $" + calcularSalarioBruto());
        System.out.println("ARL = -$" + retencionarl(calcularSalarioBruto()));
        System.out.println("SALUD = -$" + retencionSalud(calcularSalarioBruto()));
        System.out.println("______________________________________________");
        System.out.println("valor neto a pagar = $" + salarioNeto());
                
        
    }
    
    
    
}
