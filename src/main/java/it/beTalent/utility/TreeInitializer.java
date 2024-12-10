package it.beTalent.utility;

import it.beTalent.entity.Tree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TreeInitializer {


    public static Tree treeInitializer(Scanner scan) throws InputMismatchException {
        int num;
        do{
            System.out.println("Inserisci il numero iniziale di rami (deve essere maggiore di zero)");
            num = scan.nextInt();
            if (num <= 0) {
                System.out.println("Numero di rami non valido. Deve essere maggiore di 0.");
            }
        }while(num<=0);


        return new Tree(num);
    }

    public static int ageInitializer(Scanner scan) throws InputMismatchException {
        int age;
        do{
            System.out.println("Inserisci l'età dell'albero, espressa in anni (deve essere maggiore di 0)");
            age= scan.nextInt();
            if (age <= 0) {
                System.out.println("Età non valida. Deve essere maggiore di 0.");
            }
        }while(age<=0);

        return age;
    }

    public static int totBranchesInitializer(Scanner scan) throws InputMismatchException{
        System.out.println("Inserisci il numero totale dei rami che costituiscono l'albero");
        return scan.nextInt();
    }

}
