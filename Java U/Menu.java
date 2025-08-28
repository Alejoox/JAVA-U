import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner opcion = new Scanner(System.in);

        System.out.println( "Bienvenido a la Heladeria J & A \r\n" +
                            "Nuestro menu es el siguiente: \r\n " +
                            " _____________________________________________________\r\n " +
                            "|                                                     |\r\n" +
                            "|                                                      |\r\n" +
                            "|    (_)                                               |\r\n" +
                            "|     _  ___ ___  ___ _ __ ___  __ _ _ __ ___          |\r\n" + 
                            "|    | |/ __/ _ \\/ __| '__/ _ \\/ _` | '_ ` _ \\         |\r\n" +   
                            "|    | | (_|  __/ (__| | |  __/ (_| | | | | | |        |\r\n" +
                            "|    |_|\\___\\___|\\___|_|  \\___|\\__,_|_| |_| |_|        |\r\n" +
                            "|                                                      |\r\n" +
                            "|                      HELADERIA J&A                   |\r\n" +
                            "|______________________________________________________|\r\n" +
                            "|                                                      |\r\n" +
                            "|     ()    1.Cono sin helado -------------$3.500      |\r\n" +
                            "|    (__)   2.Mr Basket--------------------$5.500      |\r\n" +
                            "|   (____)  3.Malteada O'Neal--------------$10.500     |\r\n" +
                            "|  (______) 4.Frappe Michael Jackson-------$8.000      |\r\n" +
                            "|   \\    /  5.Brownie Blanco---------------$9.000      |\r\n" +
                            "|    \\  /   6.Malteada Jaider--------------$12.000     |\r\n" +
                            "|     \\/                                               |\r\n" +
                            "|______________________________________________________|\r\n" +
                            "Escoge una opcion que te gustaria ordenar?:");
        int eleccion = opcion.nextInt();

        if (eleccion == 1) {
            System.out.println("Eligio un Cono sin helado");
        } else if (eleccion == 2) { 
            System.out.println("Eligio una Mr Basket");
        } else if (eleccion == 3){
            System.out.println("Eligio una Malteada O'Neal");
        } else if (eleccion == 4) { 
            System.out.println("Eligio un Frappe Michael Jackson");
        } else if (eleccion == 5) { 
            System.out.println("Eligio un Brownie Blanco");
        } else if (eleccion == 6){
            System.out.println("Eligio La malteada Jaider");
        } else {
            System.out.println("Opciones no validas. Por favor escoja otra opcion");
        } 

        opcion.close();
    }
    
}



