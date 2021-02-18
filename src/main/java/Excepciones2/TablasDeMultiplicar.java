package Excepciones2;
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
import java.io.*;

public class TablasDeMultiplicar {

    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        // Variables para el manejo del numero
        String sNumero = "";
        Integer iNumero = null;
        int iNumeroCalculo;

        // Pedimos por consola el numero del cual queremos
        // la tabla de multiplicar
        System.out.println("Introduce el numero de la tabla de multiplicar");

        try {

            // Leemos del buffer
            sNumero = br.readLine();
            // Convertimos la cadena a un número Integer
            iNumero = Integer.parseInt(sNumero);

            System.out.println("El numero introducido es " + sNumero);
            iNumeroCalculo = iNumero;

            // Mostramos la tabla de multiplicar
            for (int x = 1; x < 11; x++) {
                System.out.println(iNumeroCalculo + " x " + x + " = " + (x * iNumeroCalculo));
            }

        } catch (IOException ioe) {
            System.out.println("No se pudo leer de consola");
        } catch (NumberFormatException nfe) {
            System.out.println("El valor introducido no es valido");
        }
    }

}
