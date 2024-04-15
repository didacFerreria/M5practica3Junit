/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica3m5junit;

import static java.lang.String.format;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Raúl Classe de funcions pròpies utils.
 */
public class MyUtils {

    /**
     *
     * @param cadena Strint cadena que es vol invertir
     * @return cadena invertida (null per cadenes nulls).
     */
    public static String inverteix(String cadena) {
        String resultat = "";

        if (cadena == null) {
            resultat = null;
        } else {
            String caracteres[] = cadena.split("");

            for (int i = caracteres.length - 1; i >= 0; i--) {
                resultat += caracteres[i];
            }
        }

        return resultat;
    }

    /**
     *
     * @param day int dia del naixement
     * @param month int mes del naixement
     * @param year int any del naixement
     * @return edat de la persona, per edat>150 retorna -1, per dates
     * impossibles retorna -2
     * @throws java.text.ParseException
     *
     */
    public static double edat(int day, int month, int year) throws ParseException {
        int resultat;
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String nacimiento = format("%02d", day) + "/"
                + format("%02d", month) + "/" + year;

        LocalDate fechaNacimiento = LocalDate.parse(nacimiento, fmt);

        Period periodo = Period.between(fechaNacimiento, fechaActual);
        resultat = periodo.getYears();

        if (resultat > 150) {
            resultat = -1;
        } else if (resultat < 0) {
            resultat = -2;
        }

        return resultat;
    }

    /**
     *
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna
     * -1.
     */
    public static double factorial(double numero) {
        
        double resultat;
        
        if (numero == 0) {
            resultat = 1;
        }else if(numero <0){
            resultat = -1;
        } else {
            resultat = numero * factorial(numero - 1);
            
        }
        
        return resultat;
    }
}
