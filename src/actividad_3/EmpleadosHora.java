
package actividad_3;

public class EmpleadosHora extends Empleado{
    //propiedades de los objeto
    private double horasTrabajadas;
    private double tarifaHora;
    private boolean aceptarFondo;

    //constructor del objeto
    public EmpleadosHora(double horasTrabajadas, double tarifaHora, boolean aceptarFondo, String nombre, int tiempoEmpresa) {
        super(nombre, tiempoEmpresa);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
        this.aceptarFondo = aceptarFondo;
        
        //si las horas ingresadas son negativas se estabecen como 0
        if (horasTrabajadas <0){
        horasTrabajadas = 0;
        }
        
       }
    
            @Override
    public double calcularSalarioBruto() {
        
        //variable para almacenar el salario
        double salario;
        
        //Verificar si el trabajador cumple con mas de las 40 horas trabajadas
        if(horasTrabajadas > 40){
            
            //conocer las horas extras excactas que se hizo el trabajo
            double extras = horasTrabajadas - 40;
            
            //conocer el salario que se le debe pagar junto a las horas extras
            salario = (40 * tarifaHora) + (extras * tarifaHora * 1.5);
            
            //si no cuemple con el veneficio de las horas estras se facturan las 40 horas
        }else {
        
            //multiplicamos las horas trabajadas por la tarifa por hora
            salario = horasTrabajadas * tarifaHora;
          
        }
        
        // se verifiac si tiene mas de un año de permanecia y si acepta el acceso al fondo de pension
        if(tiempoEmpresa > 1 && aceptarFondo){
        
            //operacion para almacenar el 2 % del salario depositado
            salario += salario * 0.02;
        }
        return salario;
        }
    }
        
    
    
    

    
            
    

