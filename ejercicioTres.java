package ciclos;

import java.util.Scanner;

public class ejercicioTres {
    public static void main(String[] args) {
        System.out.println("*****Ejercicio tres*****" );

        //           contadore         suma-promedio
        double mayor = 0, menor = 0, suma = 0, suma2 = 0, totalNotasMayor = 0, totalNotasMenor = 0, totalSuma = 0 ;    

        for (int i = 1; i <= 10; i++) {
            System.out.print("ingresa la " + i + " calificacion: ");
            double notas =Float.parseFloat(new Scanner(System.in).nextLine()) ; 
            if (notas < -1 || notas > 10) {
                System.out.println("Se ingresaron calificaciones no validas");
                break;   
            }
            totalSuma += notas;
            // Contadores
            if (notas >= 6) {
                mayor++;
                totalNotasMayor++;
                suma += notas;
            }else{ menor++;
                suma2 += notas;
                totalNotasMenor++;
            }
            while (i == 10){
            if (mayor >= 6){
                System.out.println("\nCalificaciones >= a 6: " + mayor);
                System.out.println("Promendio de las " + mayor + " calificaciones: " + suma/totalNotasMayor);
                System.out.println("Promedio general de las " + i + " calificaciones: " + totalSuma/i);
                break;
            }else{ 
                System.out.println("\ncalificaciones <= a 6: " + menor);
                System.out.println("Promendio de las " + menor + " calificaciones: "  + suma2/totalNotasMenor);
                System.out.println("Promedio general de las " + i + " calificaciones: " + totalSuma/i);
                break;
            }
        }
    }
    System.out.println("fin del programa");
    }
}
