package it.beTalent.utility;

import java.util.Random;
import java.util.Scanner;

public class TreeMath {

 /* public static int numberOfBranches(int branches, int height){
        double totNumOfBranches = 0;
        for (int i=0; i<height; i++){
            totNumOfBranches = totNumOfBranches+(branches* Math.pow(2,i));
        }
        return (int) totNumOfBranches;
    }*/

    public static int numberOfBranches(int branches, int height){
        return (int) (branches*(Math.pow(2, height)-1));
    }


    public static int ageOfTree(int branches, int totBranches){
        return (int) (Math.log( (double) totBranches /branches) / Math.log(2))+1;
    }

    public static int oneSickTree(int branches, int height){
        return (int) (branches*(Math.pow(2, height)-1)- height);
    }



    public static void specificSickTree(int branches, Scanner scan) {
        int counter = 1;
        int totBranches = branches;
        int countSickBranches = 0;
        int currentBranches = branches;

        do {
            System.out.println("Inserisci il numero di rami malati, per quest'anno: ");
            int numSickBranches = scan.nextInt();
            int reproduceBranches = currentBranches - numSickBranches;
            int newBranches = reproduceBranches * 2;
            countSickBranches +=  numSickBranches;
            totBranches += newBranches  - numSickBranches ;
            currentBranches = newBranches;


            if (totBranches <= 0) {
                System.out.println("L'albero è morto.");
            } else {
                System.out.println("All'anno " + counter + ", i rami TOTALI dell'albero sono " +totBranches + ", i rami malati TOTALI sono " + countSickBranches);
                System.out.println("Nello specifico:");
                System.out.println("All'anno " + counter + ", i NUOVI rami sani sono " + newBranches + ", i NUOVI rami malati sono " + numSickBranches);
            }
            counter++;
        } while (totBranches > 0);
    }

    public static void randomSickTree(int branches, Scanner scan, Random random) {
        int counter = 1;
        int totBranches = branches;
        int countSickBranches = 0;
        int currentBranches = branches;
        int maxRandomNumber = branches;

        do {
            int numSickBranches = random.nextInt(maxRandomNumber+1);
            System.out.println("Ci sono " + numSickBranches + " rami malati.");

            int reproduceBranches = currentBranches - numSickBranches;
            int newBranches = reproduceBranches * 2;
            countSickBranches +=  numSickBranches;
            totBranches += newBranches  - numSickBranches ;
            currentBranches = newBranches;
            maxRandomNumber = totBranches;

            if (totBranches <= 0) {
                System.out.println("L'albero è morto.");
            } else {
                System.out.println("All'anno " + counter + ", i rami TOTALI dell'albero sono " +totBranches + ", i rami malati TOTALI sono " + countSickBranches);
                System.out.println("Nello specifico:");
                System.out.println("All'anno " + counter + ", i NUOVI rami sani sono " + newBranches + ", i NUOVI rami malati sono " + numSickBranches);
            }
            counter++;
        } while (totBranches > 0);
    }


}
