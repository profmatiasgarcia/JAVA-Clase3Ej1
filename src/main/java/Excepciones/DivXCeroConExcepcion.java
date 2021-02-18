package Excepciones;
/**
 * @author Prof Matias Garcia.
 * <p> Copyright (C) 2017 para <a href = "https://www.profmatiasgarcia.com.ar/"> www.profmatiasgarcia.com.ar </a>
 * - con licencia GNU GPL3.
 * <p> Este programa es software libre. Puede redistribuirlo y/o modificarlo bajo los términos de la
 * Licencia Pública General de GNU según es publicada por la Free Software Foundation, 
 * bien con la versión 3 de dicha Licencia o bien (según su elección) con cualquier versión posterior. 
 * Este programa se distribuye con la esperanza de que sea útil, pero SIN NINGUNA GARANTÍA, 
 * incluso sin la garantía MERCANTIL implícita o sin garantizar la CONVENIENCIA PARA UN PROPÓSITO
 * PARTICULAR. Véase la Licencia Pública General de GNU para más detalles.
 * Debería haber recibido una copia de la Licencia Pública General junto con este programa. 
 * Si no ha sido así ingrese a <a href = "http://www.gnu.org/licenses/"> GNU org </a>
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivXCeroConExcepcion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;

        do {
            try {
                System.out.println("Ingrese numerador ");
                int n = sc.nextInt();
                System.out.println("Ingrese denominador ");
                int d = sc.nextInt();
                int resultado = cociente(n, d);
                System.out.printf("Resultado: %d / %d = %d\n", n, d, resultado);
                seguir = false;
            } catch (ArithmeticException ae) {
                System.err.printf("Excepcion: %s\n", ae);
                System.out.println("Cero es un denominador no valido");
            } catch (InputMismatchException ime) {
                System.err.printf("Excepcion: %s\n", ime);
                sc.nextLine();
                System.out.println("Debe introducir valores numericos");
            }
        } while (seguir);
    }

    public static int cociente(int num, int den) {
        return (num / den);
    }
}
