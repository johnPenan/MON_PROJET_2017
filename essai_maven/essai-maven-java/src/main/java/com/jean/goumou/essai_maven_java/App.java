package com.jean.goumou.essai_maven_java;

/*
 * Creation : 16 mars 2017
 */
/**
 * 
 */

/**
 * TODO : Description
 * 
 * @author U512446
 */
public class App {

    String tab[][] = { { "Raphael", "Martin", "Jean" }, { "Penan", "Goumou", "Alphonse" } };
    int i = 0, j = 0;

    public int nombrePair(int n) {
        if (n % 2 == 0)
            System.out.println("\tNombre pair");
        else
            System.out.println("\tNombre impair");
        return n;

    }

    public void chaine() {
        System.out.println("\n\tParcours du tableau de string !");
        for (String tab1[] : tab) {
            i = 0;
            for (String str : tab1) {

                System.out.println("La valeur du tableau à l'indice [" + i + "][" + j + "] est " + tab[j][i]);
                i++;
            }
            j++;
        }

    }

}
