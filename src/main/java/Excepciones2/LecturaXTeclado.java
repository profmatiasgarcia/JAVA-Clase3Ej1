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
public class LecturaXTeclado {

    public static void main(String arg[]) {
        StringBuffer salida = new StringBuffer();
        char caracter;
        System.out.println("\nEscribe el texto: ");
        try {
            do {
                caracter = (char) System.in.read();
                // Es necesaria una conversion de int a char
                salida.append(caracter);
            } while (caracter != '\n');
        } catch (Exception e) {
            System.err.println(e);
        }
        System.out.println("\nLa lí­nea escrita es: ");
        System.out.println(salida);
    }

}