package prog05_tarea;

import java.time;
import java.time.LocalDate;

public class PROG05_Tarea {

    public static void main(String[] args) {
        
        //instanciamos un objeto Scanner para pedir datos al usuario
        
        Scanner lectura=new Scanner(System.in);
        
        //creamos el menú que aparecerá en consola
        
        System.out.println("SELECCIONE UNA OPCIÓN");
        System.out.println("1. Nuevo barco");
        System.out.println("2. Ver matrícula");
        System.out.println("3. Ver número de horas del motor");
        System.out.println("4. Actualizar número de horas delo motor");
        System.out.println("5. Ver años de antigüedad");
        System.out.println("6. Mostrar propietario anterior");
        System.out.println("7. Mostrar descripción");
        System.out.println("8. Mostrar precio");
        System.out.println("9. Salir");
        
        //con un swith seleccionamos cada una de las opciones del menú
        // variable opcion para usar en el switch
        //if para comprobar que el número del usuario está entre 1-9
        
        byte opcion=lectura.nextByte();
        
        if (opcion>0 && opcion<10) {
            switch (opcion) {
                case 1:
                    //instanciamos objeto barco (constructor vacío)
                    Barco nave=new Barco();
                    break;
                case 2:
                    //comprobamos matrícula. If comprueba si "nave" existe o no
                    if(nave != null){
                        nave.getMatricula();
                    }else{
                        System.out.println("No se ha introducido ningún barco.");
                    }
                    break;
                case 3:
                    if(nave != null){
                        nave.getMatricula();
                    }else{
                        System.out.println("No se ha introducido ningún barco.");
                    }
                    break;
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                default:
                    throw new AssertionError();
            }
        }else{
            System.out.println("Introduzca un número entre 1 y 9");
        }
    }
    
}
