package it.beTalent.entity;

import it.beTalent.utility.TreeInitializer;
import it.beTalent.utility.TreeMath;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Menu {


    public static void readMenu(){

        Scanner scan = new Scanner(System.in);

        int option ;

        do {
            try {
                System.out.println("Menu:");
                System.out.println("Calcola il numero di rami, conoscendo l'età dell'albero. Digita 1");
                System.out.println("Determina gli anni necessari per sviluppare un certo numero di rami. Digita 2");
                System.out.println("L'albero è malato. Digita 3");
                System.out.println("Esci Digita 0");
                System.out.print("Seleziona un'opzione: ");
                option = scan.nextInt();



                switch (option) {
                    case 1:
                        Tree tree1 = TreeInitializer.treeInitializer(scan);
                        int treeHeight = TreeInitializer.ageInitializer(scan) / Tree.period;
                        int totBranches = TreeMath.numberOfBranches(tree1.getBranches(), treeHeight);
                        System.out.println("Il numero totale dei rami è di: " + totBranches);
                        break;
                    case 2:
                        Tree tree2 = TreeInitializer.treeInitializer(scan);
                        int finalBranches = TreeInitializer.totBranchesInitializer(scan);
                        if(finalBranches>=tree2.getBranches()){
                            int ageOfTree = (TreeMath.ageOfTree(tree2.getBranches(), finalBranches)) * Tree.period;
                            System.out.println("L'età dell'albero è di: " + ageOfTree + " anni.");
                        }else{
                            System.out.println("L'albero è malato o morto.");
                        }
                        break;
                    case 3:
                        readSubMenu();
                        break;
                    case 0:
                        System.out.println("Il programma è terminato.");
                        break;
                    default:
                        System.out.println("Opzione non valida.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input non valido. ");
                scan.next();
                option = -1;
            }
        }while (option !=0);

    }

    public static void readSubMenu() {

        Scanner scan2 = new Scanner(System.in);
        Random random = new Random();

        int choise;

        do {
            try {
                System.out.println("Menu dell'albero malato:");
                System.out.println("Se l'albero ogni anno perde un ramo, digita 1");
                System.out.println("Se l'albero ogni anno perde un numero di rami precisi, digita 2");
                System.out.println("Se l'albero ogni anno perde un numero casuale di rami, digita 3");
                System.out.println("Per tornare al menù principale, digita 0");
                System.out.print("Seleziona un'opzione: ");
                choise = scan2.nextInt();


                switch (choise) {
                    case 1:
                        Tree tree1 = TreeInitializer.treeInitializer(scan2);
                        int treeHeight = TreeInitializer.ageInitializer(scan2) / Tree.period;
                        int totBranches = TreeMath.oneSickTree(tree1.getBranches(),treeHeight);
                        System.out.println("Dato che ogni anno si ammala un solo ramo. L'albero è malato ma non muore. Rimangono in totale: "+totBranches+" rami");
                        break;
                    case 2:
                        Tree tree2 = TreeInitializer.treeInitializer(scan2);
                        TreeMath.specificSickTree(tree2.getBranches(),scan2);
                        break;
                    case 3:
                        Tree tree3 = TreeInitializer.treeInitializer(scan2);
                        TreeMath.randomSickTree(tree3.getBranches(),scan2,random);
                        break;
                    case 0:
                        System.out.println("Torna al menu principale.");
                        break;
                    default:
                        System.out.println("Opzione non valida.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input non valido. ");
                scan2.next();
                choise = -1;
            }
        }while (choise !=0);

    }



}
