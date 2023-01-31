package be.ephec.java.exercice.e02;
import java.util.*;

import static java.text.DigitList.parseInt;

public class ExerciceBase {
    public static void main(String[] args) {
       Scanner Scanner = new Scanner(System.in);

       public void base() {
            System.out.println("Entier base : ");
            String baseString = Scanner.nextLine();
            System.out.println("Entier nombre : ");
            int nbrInt = Scanner.nextInt();
            int nbrVers10 = Integer.parseInt(baseString, nbrInt);
            int nbr10 = Integer.parseInt("10", nbrVers10);
            System.out.println("Le nombre " + nbrInt + " en base " + baseString + "est égale à " + nbrVers10);
            }
        }

    }
}
