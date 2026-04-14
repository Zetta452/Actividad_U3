
package actividad_3;

//clase de los empleados por comision la cula es una hija de la clase padre empleado
public class EmpleadoComision extends Empleado{

//propiedades de la clase 
    private double salarioBase;
    private double ventas;
    private double porcentajeComision;
    private double bonoAlimentacion = 1000000;
    //constructor de la clase
    public EmpleadoComision(double salarioBase, double ventas, double porcentajeComision, String nombre, int tiempoEmpresa) {
        super(nombre, tiempoEmpresa);
        //comprovacion que las ventas no tienes valores negativos y si es asi los deja como 0 
        if (ventas < 0){
        ventas = 0;}
        
        this.salarioBase = salarioBase;
        this.ventas = ventas;
        this.porcentajeComision = porcentajeComision;
        
    }
    
    @Override
    public double calcularSalarioBruto() {
       
        //calulamos el valor del porsentaje de comision
        //dividimos el valor entre 100 para poder obtener el valor del porsentaje con decimal y que el usuario 
        //pueda escribir el numero normal
        double comisionVentas = ventas * (porcentajeComision/100) ;
        double bonoExtra = 0;
        
        //comprovacion del la condicion de 20.000.000 en venta
        if (ventas > 20000000){
            //obtenemos el valor del bono extra el cula tiene un porsentaje de 3%
        bonoExtra = ventas * 0.03;
        }
        //sumatoria de todos los valores agregados para conocer su salario bruto
        return comisionVentas + bonoExtra + this.salarioBase + this.bonoAlimentacion;    
    }
    
    
}
