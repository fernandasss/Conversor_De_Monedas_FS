import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        ConsultaMonedas consulta = new ConsultaMonedas();
        Monedas monedas = consulta.convertirMoneda();
        Scanner teclado = new Scanner(System.in);
        Menu menu = new Menu();
        int opcion = 0;


        while (true) {
            menu.muestraMenu();
            opcion = teclado.nextInt();

            if (opcion == 7) {
                System.out.println("Gracias por visitar el conversor de monedas de Fernanda.");
            break;}
            if (opcion < 1 || opcion > 7) {
                System.out.println("Opción no váida, intente nuevamente.");
            } else {

                System.out.println("¿Cuánto deseas cambiar?");
                double cantidad = teclado.nextInt();


                switch (opcion) {
                    case 1:
                        double resultado = cantidad * monedas.getConversionRate("CLP");
                        System.out.println(cantidad + "USD equivalen a " + resultado + " CLP.");
                        break;
                    case 2:
                        double resultado2 = cantidad / monedas.getConversionRate("CLP");
                        System.out.println(cantidad + "CLP equivalen a " + resultado2 + " USD.");
                        break;
                    case 3:
                        double resultado3 = cantidad * monedas.getConversionRate("ARS");
                        System.out.println(cantidad + " USD equivalen a " + resultado3 + " ARS.");
                        break;
                    case 4:
                        double resultado4 = cantidad / monedas.getConversionRate("ARS");
                        System.out.println(cantidad + " ARS equivalen a " + resultado4 + " USD.");
                        break;
                    case 5:
                        double resultado5 = cantidad * monedas.getConversionRate("BRL");
                        System.out.println(cantidad + " USD equivalen a " + resultado5 + " BRL.");
                        break;
                    case 6:
                        double resultado6 = cantidad / monedas.getConversionRate("BRL");
                        System.out.println(cantidad + " BRL equivalen a " + resultado6 + " USD.");


                }


            }

        }


    } }