package ciclos;

import java.util.Scanner;

public class prueva {
      
    static Scanner consola = new Scanner(System.in); //para usar en mas metodos
    static int suma = 0;
    static int contador =0;
    public static void main(String[] args) {
        
       int opciones = 0;
      do{ 
       System.out.println("\n\tBienvenidos al Restaurante el Charro\n");
        System.out.println("1.Registrar un pedido");
        System.out.println("2.Mostrar el total de ventas");
        System.out.println("3.Salir del sistema\n");
        System.out.print("Dijite  el numero de la opcion a ocupar: ");
       // opciones= Integer.parseInt(consola.nextLine());
        opciones = consola.nextInt();

        switch (opciones) {

            case 1:
                registroPedido();
                break;
            case 2:
                totalVentas();
                //break;
            case 3:
                break;

            default:
            System.out.println("\n**Opcion incorrecta vuelva a seleccionar una opccion**");
        }
        } while (opciones != 3); 
        System.out.println("Salistes del sistema vuelva pronto");
     }

     static void registroPedido (){    
         int menu = 0;   

         do{
         System.out.println("\n\t Menu del dia de hoy\n");
         System.out.println("\t 1.pollo = 30$ \t  2.barbacoa = 100$ \t 3.carnitas = 80$ \t 4.regresar al menu principal");
         System.out.print("\nDijite el numero de la opcion a ordenar: ");
         menu = consola.nextInt();
         
         switch (menu) {  
            case 1:
            System.out.println( "\nSe le realizo con exito su pago de 30 pesos por su orden de pollo\n"  ) ;
            contador++;
            suma += 30;
            break;
            case 2:
            System.out.println( "\nSe le realizo con exito su pago de 100 pesos por su orden de barbacoa\n"  ) ;
            suma += 100 ;
            contador++;
            break;
            case 3:
            System.out.println( "\nSe le realizo con exito su pago de 80 pesos por su orden de carnitas\n"  ) ;
            suma += 80 ;
            contador++;
            break;
            case 4:

            break;

            default:
            System.out.println("\n****opcion incorrecta vuelva a seleccionar****");
                break;
         }
        }while (menu !=4);
            
        }
   
    
     static void totalVentas () {
         int salir = 0;
         do{
             System.out.println("\nTotal de ventas del dia de hoy: " + contador);
             System.out.println("Ganancias: " + suma);

             System.out.print("Para poder salir preciona el numero 1: ");
             salir = consola.nextInt();          
        switch (salir) {
        case 1:
            break;
         default: System.out.println("\n***Error caracter invalido***");
        }
    }while(salir != 1 );
}     
    }
    