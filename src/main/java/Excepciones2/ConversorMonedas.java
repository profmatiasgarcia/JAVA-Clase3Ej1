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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConversorMonedas {

    public static void main(String[] args) {

        float tasa = 135.66F; // 1 dolar son $135,66 pesos 
        float monedaorigen = 0;
        float monedadestino = 0;
        BufferedReader br;

        br = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Conversor de dolares a pesos
            System.out.println("Cuantos dolares tienes?");
            monedaorigen = Float.parseFloat(br.readLine());

            monedadestino = monedaorigen * tasa;

            System.out.println(monedaorigen + " dolares equivalen a " + monedadestino + " pesos argentinos");

            // Conversor de pesos a dolares
            System.out.println("Cuantos pesos tienes?");
            monedaorigen = Float.parseFloat(br.readLine());

            monedadestino = monedaorigen / tasa;

            System.out.println(monedaorigen + " pesos argentinos equivalen a " + monedadestino + " dolares");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}
