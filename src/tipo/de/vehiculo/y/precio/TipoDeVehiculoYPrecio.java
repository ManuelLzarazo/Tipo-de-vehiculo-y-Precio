
package tipo.de.vehiculo.y.precio;

import java.util.Scanner;

public class TipoDeVehiculoYPrecio {

    
    public static void main(String[] args) {
        
        Scanner Teclado =new Scanner(System.in);
        
        int opc;
        {            
           
    double  Camioneta, Automovil, Impuesto, Precio, Precioneto;
    
    System.out.println("Seleccione el tipo de Vehiculo que quiere comprar:");
    System.out. println("1.Camioneta");
    System.out. println("2.Automovil");
    
    
    opc= Teclado. nextInt();
    
    switch(opc){
        
        case 1:
            System.out. println("Ingrese el precio de la Camioneta");
            Precio = Teclado.nextDouble();
            if (Precio>80){
                Impuesto = (double)(Precio/2);
                Precioneto =(double)(Precio + Impuesto);
                   
            System.out.print("El impuesto a pagar por la camioneta es"+Impuesto);
            System.out.println("pesos");
            System.out.print("El precio neto de la camioneta es"+Precioneto);
            System.out.println("pesos");
            }
            if (Precio <=80){
               Impuesto = 0;
               Precioneto =(double)(Precio+Impuesto);
               
            System.out.print("El impuesto a pagar por la camioneta es"+Impuesto);
            System.out.println("pesos");
            System.out.print("El precio neto de la camioneta es"+Precioneto);
            System.out.println("pesos");
            }
            break;
            
                    
         case 2:
      
           System.out.println("Ingrese el precio del Automovil");
            Precio = Teclado.nextDouble();
            if (Precio<20) {
                Impuesto = 5;
                Precioneto =(double)(Precio+Impuesto);
                   
            System.out.print("El impuesto a pagar por el Automovil es"+Impuesto);
            System.out.println("pesos");
            System.out.print("El precio neto del Automovil es"+Precioneto);
            System.out.println("pesos");
            }
            
            if (Precio >= 20 && Precio <=40){
               Impuesto = Precio/5;
               Precioneto =(double)(Precio+Impuesto);
              
            System.out.print("El impuesto a pagar por el Automovil es"+Impuesto);
            System.out.println("pesos");
            System.out.print("El precio neto del automovil es"+Precioneto);
            System.out.println("pesos");
            }
                        
            if (Precio>40){
                Impuesto = 9;
                Precioneto =(double)(Precio+Impuesto);
                   
            System.out.print("El impuesto a pagar por el automovil"+Impuesto);
            System.out.println("pesos");
            System.out.print("El precio neto del automovil es"+Precioneto);
            System.out.println("pesos");
            }
                       
            break;
      default:
            System.out. println("La opción seleccionada no es válida");          
            }
        }
        
    }
}

            
    
    
            
    
     
    
        
        
            
    
