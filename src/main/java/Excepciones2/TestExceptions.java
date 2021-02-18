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
public class TestExceptions {

    public static void main(String[] arg) {
        System.out.println("comienzo dia");

        int cantsec = 20;// PONER 0 PARA PROBAR
        int cantAlu = 10;
        try {
            System.out.println("antes");
            System.out.println(cantAlu / cantsec);
            System.out.println("despues");
            int a = Integer.parseInt("Opa");// tira exception esta en la api
            String cadena = null;
            cadena.concat("pp");// java.lang.NullPointerException

        } catch (java.lang.ArithmeticException ae) {
            System.out.println("---");
        } catch (java.lang.NumberFormatException e) {

            System.out.println("ingrese un numero");
            e.printStackTrace();
        } catch (java.lang.NullPointerException e) {
            System.out.println("dios sabra");

        } catch (Exception e) {
            System.out.println("hubo un error");
            e.printStackTrace();
        } finally {
            System.out.println("libero recursos");
        }

        System.out.println("Final exitoso!!!");
    }
}
