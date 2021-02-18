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
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class LeerNumerosConsola {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<Integer>();

        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce numeros. El cero para salir");

        int numero = 0;

        do {

            try {
                numero = reader.nextInt();
                lista.add(numero);
            } catch (InputMismatchException ime) {
                System.out.println("¡Cuidado! Solo puedes insertar numeros. ");
                // Eliminamos el valor que no queriamos
                reader.next();
            }

        } while (numero != 0);

        int suma = 0;
        for (int num : lista) {
            suma += num;
        }

        System.out.println("La suma de los numeros es " + suma);

        reader.close();

    }

}
