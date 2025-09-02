import java.util.Scanner; //Se importa la librería donde el usuario puede ingresar datos
public class MenuDefinitivo { 
    public static void main(String[] args) {
        Scanner opcion = new Scanner(System.in); //Lector para recibir datos del usuario a esta opcion se le asigna el nombre de opcion

        // Se crean los diferentes menús que tendrá el restaurante
        MenuEntradas menuEntradas = new MenuEntradas();
        MenuPlatosFuertes menuPlatosfuertes = new MenuPlatosFuertes();
        MenuAcompañantes menuAcompañantes = new MenuAcompañantes();
        MenuBebidas menuBebidas = new MenuBebidas();
        MenuPostres menuPostres = new MenuPostres();

        int opcionMenuInicial; // variable que guarda el número que escriba el usuario en el menú principal
        double cuentaTotal = 0; // Variable para ir acumulado el valor total de la cuenta

        do{
            System.out.println("Bienvenido a nuestro Restaurante J&A  \r\n" +
                            "                                  \r\n"+
                            "Nuestro menú es el siguiente: \r\n " +
                            " __________________________________________ \r\n " +
                            "|                                          |\r\n" +
                            "|             Restaurante J & A            |\r\n" +
                            "|__________________________________________|\r\n" +
                            "|                                          |\r\n" +
                            "|  1. Entradas                             |\r\n" +
                            "|  2. Platos fuertes                       |\r\n" +
                            "|  3. Acompañantes                         |\r\n" +
                            "|  4. Bebidas                              |\r\n" +
                            "|  5. Postres                              |\r\n" +
                            "|  6. Terminar                             |\r\n" +
                            "|                                          |\r\n" +
                            "|__________________________________________|\r\n" +
                            "                                            \r\n"+
                            "Escoge una categoría: ");
            
            opcionMenuInicial = opcion.nextInt(); //se guarda la opciión del usuario
            switch (opcionMenuInicial) {
                case 1:
                    cuentaTotal = menuEntradas.mostrarMenu(opcion, cuentaTotal);
                    break;
                case 2:
                    cuentaTotal = menuPlatosfuertes.mostrarMenu(opcion, cuentaTotal);
                    break;
                case 3:
                    cuentaTotal = menuAcompañantes.mostrarMenu(opcion, cuentaTotal);
                    break;
                case 4:
                    cuentaTotal = menuBebidas.mostrarMenu(opcion, cuentaTotal);
                    break;
                case 5:
                    cuentaTotal = menuPostres.mostrarMenu(opcion, cuentaTotal);
                    break;
                default:
                System.out.println("Opción no Válida. Intente de nuevo."); 
                break; 
            }
        }while(opcionMenuInicial != 6); {
            System.out.println("Gracias por elegir el J&A !!");
        }
    }
}

class MenuEntradas{
    public double mostrarMenu(Scanner opcion, double totalActual){ // nombre mostrarMenu es para que sea más fácil llamar a los menús y se utiliza double totalActual para ir almacenando en cada menu el valor total y se va pasando a los diferentes menús para que se vaya sumando
        int opcionEntrada;
        do{
            System.out.println("Nuestras entradas son las siguientes:  \r\n" +
                        "                                            \r\n"+
                        " __________________________________________ \r\n " +
                        "|                                          |\r\n" +
                        "|                  ENTRADAS                |\r\n" +
                        "|__________________________________________|\r\n" +
                        "|                                          |\r\n" +
                        "|  1. Papas a la Francesa ------$10.000    |\r\n" +
                        "|  2. Aros de Cebolla ----------$12.000    |\r\n" +
                        "|  3. Dedos de Queso -----------$15.000    |\r\n" +
                        "|  4. Alitas BBQ (6 Unidades)---$20.000    |\r\n" +
                        "|  5. Ir a Platos Fuertes                  |\r\n" +
                        "|  6. Terminar y pagar                     |\r\n" +
                        "|                                          |\r\n" +
                        "|__________________________________________|\r\n" +
                        "                                            \r\n"+
            "Escoge una opción que te gustaría ordenar: ");
            opcionEntrada = opcion.nextInt();
            switch (opcionEntrada) {
                case 1:
                    totalActual += 10.000; 
                    System.out.println("Has elegido Papas a la Francesa. Total actual: $"+ totalActual);
                    break;
                case 2:
                    totalActual += 12.000;
                    System.out.println("Has elegido Aros de Cebolla. Total actual: $"+ totalActual);
                    break;
                case 3:
                    totalActual += 15.000;
                    System.out.println("Has elegido Dedos de Queso. Total actual: $"+ totalActual);
                case 4:
                    totalActual += 12.000;
                    System.out.println("Has elegido Alitas de BBQ. Total actual: $"+ totalActual);
                case 5:// Si quiere ir al menú de Platos Fuertes
                    MenuPlatosFuertes menuPlatosfuertes = new MenuPlatosFuertes(); //Se abre el menú de platos fuertes y se sigue sumando al total
                    totalActual = menuPlatosfuertes.mostrarMenu(opcion, totalActual); //Se escribe totalActual para que se actualice el total, el metodo mostrarMenu, muestra las opciones, permite escoger y suma el precio del plato al total y devuelve el nuevo total
                    return totalActual;
                case 6:
                    System.out.println("\n--- Resumen del Pedido ---");
                    System.out.println("Total a pagar: $" + totalActual);
                    return totalActual; // Devuelve el total y termina el método
                default:
                System.out.println("Opción no válida.");
                    break;
            }
        }while (opcionEntrada != 6); {
        return totalActual;
        }
    }

}

class MenuPlatosFuertes{
    public double mostrarMenu(Scanner opcion, double totalActual){

        int opcionPlatosFuertes;

        do{
            System.out.println("Nuestras platos fuertes son los siguientes:  \r\n" +
                        "                                            \r\n"+
                        " __________________________________________ \r\n " +
                        "|                                          |\r\n" +
                        "|              PLATOS FUERTES              |\r\n" +
                        "|__________________________________________|\r\n" +
                        "|                                          |\r\n" +
                        "|  1. Pasta con Carne Molida ----$15.000   |\r\n" +
                        "|  2. Carne Desmechada  ---------$16.000   |\r\n" +
                        "|  3. Pechuga   -----------------$17.000   |\r\n" +
                        "|  4. Mojarra  ------------------$20.000   |\r\n" +
                        "|  5. Ir a Bebidas                         |\r\n" +
                        "|  6. Terminar y Pagar                     |\r\n" +
                        "|                                          |\r\n" +
                        "|__________________________________________|\r\n" +
                        "                                            \r\n"+
                        "Escoge una opción que te gustaría ordenar: ");
            opcionPlatosFuertes = opcion.nextInt();

            switch (opcionPlatosFuertes) {
                case 1:
                    totalActual += 15000;
                    System.out.println("Has elegido Pasta con Carne Molida. Total actual: $"+ totalActual);
                    break;
                case 2:
                    totalActual += 16000;
                    System.out.println("Has elegido Carne Desmechada. Total actual: $"+ totalActual);
                    break;
                case 3:
                    totalActual += 17000;
                    System.out.println("Has elegido Pechuga. Total actual: $"+ totalActual);
                case 4:
                    totalActual += 20000;
                    System.out.println("Has elegido Mojarra. Total actual: $"+ totalActual);
                case 5:
                    MenuAcompañantes menuAcompañantes = new MenuAcompañantes();
                    totalActual = menuAcompañantes.mostrarMenu(opcion, totalActual);
                    return totalActual;
                case 6:
                    System.out.println("\n--- Resumen del Pedido ---");
                    System.out.println("Total a pagar: $" + totalActual);
                    return totalActual; // Devuelve el total y termina el método
                default:
                System.out.println("Opción no válida.");
                    break;
            }
        }while (opcionPlatosFuertes != 6); {
        return totalActual;
        }
        
    }
}

class MenuAcompañantes{
    public double mostrarMenu(Scanner opcion, double totalActual){

        int opcionAcompañantes;

        do{
            System.out.println("Nuestras Acompañantes son los siguientes:  \r\n" +
                        "                                            \r\n"+
                        " __________________________________________ \r\n " +
                        "|                                          |\r\n" +
                        "|                ACOMPAÑANTES              |\r\n" +
                        "|__________________________________________|\r\n" +
                        "|                                          |\r\n" +
                        "|  1. Ensalada Caliente -------- $8.000    |\r\n" +
                        "|  2. Papas Criollas ----------- $9.000    |\r\n" +
                        "|  3. Mazorca con Queso -------- $10.000   |\r\n" +
                        "|  4. Ir a Bebidas                         |\r\n" +
                        "|  5. Terminar y Pagar                     |\r\n" +
                        "|                                          |\r\n" +
                        "|__________________________________________|\r\n" +
                        "                                            \r\n"+
                        "Escoge una opción que te gustaría ordenar: ");
            opcionAcompañantes = opcion.nextInt();

            switch (opcionAcompañantes) {
                case 1:
                    totalActual += 8.000; //Se suma el valor al total
                    System.out.println("Has elegido Ensalada Caliente. Total actual: $"+ totalActual);
                    break;
                case 2:
                    totalActual += 9.000;
                    System.out.println("Has elegido Papas Criollas. Total actual: $"+ totalActual);
                    break;
                case 3:
                    totalActual += 10.000;
                    System.out.println("Has elegido Mazorca con Queso. Total actual: $"+ totalActual);
                case 4:
                    MenuBebidas menuBebidas = new MenuBebidas();
                    totalActual = menuBebidas.mostrarMenu(opcion, totalActual);
                    return totalActual;
                case 5:
                    System.out.println("\n--- Resumen del Pedido ---");
                    System.out.println("Total a pagar: $" + totalActual);
                    return totalActual; // Devuelve el total y termina el método
                default:
                System.out.println("Opción no válida.");
                    break;
            }
        }while (opcionAcompañantes != 5); {
        return totalActual;
        }
    }
}

public class MenuBebidas {

    public double mostrarMenu(Scanner opcion, double totalActual) {
        int opcionBebida;
        
        do {
            System.out.println("Nuestras bebidas son las siguientes:  \r\n" +
                    "                                            \r\n"+
                    " __________________________________________ \r\n " +
                    "|                                          |\r\n" +
                    "|                  BEBIDAS                 |\r\n" +
                    "|__________________________________________|\r\n" +
                    "|                                          |\r\n" +
                    "|  1. Coca Cola ---------------- $4.000    |\r\n" +
                    "|  2. Jugo --------------------- $9.000    |\r\n" +
                    "|  3. Ir a Postres                         |\r\n" +
                    "|  4. Terminar y Pagar                     |\r\n" +
                    "|                                          |\r\n" +
                    "|__________________________________________|\r\n" +
                    "                                            \r\n"+
                    "Escoge una opción que te gustaría ordenar: ");

            opcionBebida = opcion.nextInt();

            if (opcionBebida == 1) {
                totalActual += 4.000;
                System.out.println("Has elegido Coca Cola. Total actual: $" + totalActual);
            } else if (opcionBebida == 2) {
                totalActual += 9000;
                System.out.println("Has elegido Jugo. Total actual: $" + totalActual);
            } else if (opcionBebida == 3) {
                MenuPostres menuPostres = new MenuPostres();
                totalActual = menuPostres.mostrarMenu(opcion, totalActual);
            } else if (opcionBebida == 4) {
                System.out.println("\n--- Resumen del Pedido ---");
                System.out.println("Total a pagar: $" + totalActual);
                return totalActual; // Imprime el total y termina el programa
            } else {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcionBebida != 4);

        return totalActual; // Devolver el total al final del bucle
    }
}

public class MenuPostres {

    public double mostrarMenu(Scanner opcion, double totalActual) {
        int opcionPostres;
        
        do {
            System.out.println("Nuestras deliciosos postres son las siguientes:  \r\n" +
                    "                                            \r\n"+
                    " __________________________________________ \r\n " +
                    "|                                          |\r\n" +
                    "|                  POSTRES                 |\r\n" +
                    "|__________________________________________|\r\n" +
                    "|                                          |\r\n" +
                    "|  1. Flan de Caramelo --------- $6.000    |\r\n" +
                    "|  2. Brownie con Helado ------- $9.000    |\r\n" +
                    "|  3. Desea pedir algo más?                |\r\n" +
                    "|  4. Terminar y Pagar                     |\r\n" +
                    "|                                          |\r\n" +
                    "|__________________________________________|\r\n" +
                    "                                            \r\n"+
                    "Escoge una opción que te gustaría ordenar: ");

            opcionPostres = opcion.nextInt();

            if (opcionPostres == 1) {
                totalActual += 6000;
                System.out.println("Has elegido Flan de Caramelo. Total actual: $" + totalActual);
            } else if (opcionPostres == 2) {
                totalActual += 9000;
                System.out.println("Has elegido Brownie con Helado. Total actual: $" + totalActual);
            } else if (opcionPostres == 3) {
                return totalActual;
            } else {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcionPostres != 4);
            System.out.println("Gracias por elegir J&A\r\n" +
                                "Espero que vuelva. Buen día\r\n"+
                                "Su Cuenta total fue de: \r\n");

            System.out.println("\n--- Resumen del Pedido ---");
            System.out.println("Total a pagar: $" + totalActual);
        return totalActual;
    }
}
