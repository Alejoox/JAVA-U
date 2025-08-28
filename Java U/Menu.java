
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner opcion = new Scanner(System.in);

        System.out.println( "Bienvenido a la Heladería J & A \r\n" +
                            "Nuestro menú es el siguiente: \r\n " +
                            " __________________________________________\r\n " +
                            "|                                          |\r\n" +
                            "|           Menú Heladería J & A           |\r\n" +
                            "|__________________________________________|\r\n" +
                            "|                                          |\r\n" +
                            "|  1.Cono sin helado -------------$3.500   |\r\n" +
                            "|  2.Mr Basket--------------------$5.500   |\r\n" +
                            "|  3.Malteada O´Neal--------------$10.500  |\r\n" +
                            "|  4.Frappe Michael Jackson-------$8.000   |\r\n" +
                            "|  5.Brownie Blanco---------------$9.000   |\r\n" +
                            "|  6.Malteada Jaider--------------$12.000  |\r\n" +
                            "|                                          |\r\n" +
                            "|__________________________________________|\r\n" +

                            "Escoge una opción que te gustaría ordenar?: "); 

        int eleccion = opcion.nextInt();

        if (eleccion == 1) {
            System.out.println("Eligió un Cono sin helado");
        } else if (eleccion == 2) { 
            System.out.println("Eligió una Mr Basket");
        } else if (eleccion == 3){
            System.out.println("Eligió una Malteada O´Neal");
        } else if (eleccion == 4) { 
            System.out.println("Eligió un Frappe Michael Jackson");
        } else if (eleccion == 5) { 
            System.out.println("Eligió un Brownie Blanco");
        } else if (eleccion == 6){
            System.out.println("Eligió La malteada Jaider");
        } else {
            System.out.println("Opciones no válidas. Por favor escoja otra opción");
        } 

        opcion.close();
    }
    
}



