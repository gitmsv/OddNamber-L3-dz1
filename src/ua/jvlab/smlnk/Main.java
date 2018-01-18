package ua.jvlab.smlnk;

/*calculating the odd numbers in the array*/

/* @version 1.0.0;
 * @date 2018-01-18;
 * @author "$.m.lnk";
 */

public class Main {

    public static void main(String[] args) {

        // We declare and initialize an array;

        int[] mass = {0, 5, 2, 4, 7, 1, 3, 19};

        int nbr = 0; // declare variable;

        for (int a = 0; a < mass.length; a++) {

            if (mass[a] % 2 != 0) {
                nbr = nbr + 1;
            }
        }
        System.out.println("In this array "+ nbr +" odd numbers.");
    }
}
