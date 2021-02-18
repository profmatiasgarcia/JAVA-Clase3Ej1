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
public class EjemploExcepcion {

    public static void main(String args[]) {

        //Probando excepciones metodo 1
        int num = 5, den = 0;
        double res = 0;
        try {
            res = num / den; //division por cero
            System.out.println("Resultado = " + res);
        } catch (ArithmeticException e) {
            System.out.println("El denominador no puede ser 0");
            System.out.println(e.toString());
        }
        System.out.println("Resultado metodo 1 = " + res + "\n");

        //Probando excepciones metodo 2
        try {
            dividir(12, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error en metodo 2 por denominador 0");
            System.out.println(e.toString() + "\n");
        }

        //Probando excepciones metodo 3
        try {
            res = DivisionPorCero.dividir(8, 0);
        } catch (DivisionPorCero mie) {
            System.out.println("Error en metodo 3 por denominador 0");
            System.out.println(mie.toString());
        }
        System.out.println("Resultado metodo 3 = " + res + "\n");

    }

    public static void dividir(int num, int den) throws ArithmeticException {
        if (num / den < 1) {
            throw new ArithmeticException();
        } else {
            System.out.println(num / den);
        }
    }
}
