import Modelos.ConversorDeMonedas;
import Modelos.SelectorDePais;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String monedaInicial;
        String monedaFinal;
        double monto;


        System.out.println("###########Conversor de monedas###########");
        String menu = """
                1. Peso argentino
                2. Boliviano
                3. Real Brasileño
                4. Peso Chileno
                5. Peso Colombiano
                6. Dolar EstadoUnidense
                7. salir
                Tu opcion:""";


        //Ciclo operativo de la moneda inicial
        while(true){
            System.out.println("Especifique la moneda que desea ingresar");
            System.out.println(menu);
            int opcion;
            try{
                opcion = teclado.nextInt();
                if (opcion == 7){
                    System.out.println("Terminando el programa");
                    System.exit(0);
                } else {
                    monedaInicial = SelectorDePais.obtenerPais(opcion);
                    if (monedaInicial.equals("XXX")){
                        System.out.println("La opción seleccionada no es valida, intentelo de nuevo");
                        System.out.println("######################################################");
                    } else {
                        break;
                    }
                }
            }catch(InputMismatchException e){
                System.out.println("La opción seleccionada no es valida, intentelo de nuevo");
                System.out.println("######################################################");
                teclado.next();
            }


        }

        //Ciclo operativo del monto
        while(true){
            System.out.println("######################################################");
            System.out.println("Ingrese el monto que desea convertir");
            System.out.println("* Use puntos para separar los decimales");
            System.out.println("Su monto: ");

            try{
                monto = teclado.nextDouble();
                if(monto <= 0){
                    System.out.println();
                } else {
                    break;
                }
            }catch (InputMismatchException e){
                System.out.println("El Valor ingresado no es válido");
                System.out.println("* Recuerde usar puntos para separar los decimales");
                teclado.next();
            }


        }


        //Ciclo operativo del monto final
        while(true){
            System.out.println("######################################################");
            System.out.println("Especifique a que moneda desea convertir el monto");
            System.out.println(menu);
            int opcion;
            try{
                opcion = teclado.nextInt();
                if (opcion == 7){
                    System.out.println("Terminando el programa");
                    System.exit(0);
                } else {
                    monedaFinal = SelectorDePais.obtenerPais(opcion);
                    if (monedaFinal.equals("XXX")){
                        System.out.println("La opción seleccionada no es valida, intentelo de nuevo");
                        System.out.println("######################################################");
                    } else {
                        break;
                    }
                }
            }catch(InputMismatchException e){
                System.out.println("La opción seleccionada no es valida, intentelo de nuevo");
                System.out.println("######################################################");
                teclado.next();
            }


        }



        System.out.println("######################################################");
        System.out.println("Moneda Inicial: " + monedaInicial);
        System.out.println("Moneda Final: " + monedaFinal);
        System.out.println("Monto: " + monto);






        double resultado = ConversorDeMonedas.convertirMoneda(monedaInicial,monedaFinal,monto);
        System.out.println("Resultado: " + resultado);



    }
}
