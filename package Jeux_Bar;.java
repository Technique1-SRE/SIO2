package Jeux_Bar;

import java.util.Scanner;

public class boucle_do_while {

    public static void main(String[] args) {
        Scanner saisieUtilisateur = new Scanner(System.in);
        
        // initialisation des valeurs
        
        int age_client = 17;
        double solde_compte = 21.8;
        int energie = 4;
        
        // initialisation des constantes
        
        final int age_majeur = 18;
        final int prix_boisson_alcool = 5;
        final double prix_boisson_sans_alcool = 4.5;
        final int prix_petit_burger = 4;
        final int prix_grand_burger = 10;
        final double prix_partie_flechette = 2.3;
        final int debit_energie = 1;
        final int restaure_energie = 3;
        
        // initialisation des choix
        
        int Choix;
        int Choix_burger;
        
        // affichage du menu 
        
        System.out.print("Bienvenue au bar ! Vous pouvez choisir :\n"
                + "\n 1 - Commander une boisson alcoolisée - Prix : 5€"
                + "\n 2 - Commander une boisson sans alcool - Prix : 4.5€"
                + "\n 3 - Jouer une partie de fléchette - Prix : 2.3€"
                + "\n 4 - Manger un burger - Prix : 4€-10€");
        
        // valeur choisi de l'utilisateur entre 1 et 4
        
        Choix = saisieUtilisateur.nextInt();
        
        do {
            switch (Choix) {
            case 1 :
                if (age_client >= age_majeur && solde_compte >= prix_boisson_alcool) {
                    solde_compte -= prix_boisson_alcool;
                    System.out.println("\nVotre boisson alcoolisée arrive ! On vous débite de 5€ !"
                            + "\nVotre solde actuel : " + solde_compte);
                }
                else {
                    System.out.println("\nVous devez avoir 18 ans et posséder au moins 5 euros !"
                            + "\nVotre solde actuel : " + solde_compte);
                }
                break;
            case 2 :
                if (solde_compte >= prix_boisson_sans_alcool) {
                    solde_compte -= prix_boisson_sans_alcool;
                    System.out.println("\nVotre boisson non-alcoolisée arrive ! On vous débite de 4.5€ !"
                            + "\nVotre solde actuel : " + solde_compte);
                }
                else {
                    System.out.println("\nVous devez posséder au moins 4.5 euros !"
                            + "\nVotre solde actuel : " + solde_compte);
                }
                break;
            case 3 :
                if (solde_compte >= prix_partie_flechette && energie >= debit_energie) {
                    solde_compte -= prix_partie_flechette;
                    energie -= debit_energie;
                    System.out.println("\nVotre partie de fléchette va débuter ! On vous débite de 2.3€ !"
                            + "\nVotre solde actuel : " + solde_compte);
                    solde_compte += 3;
                    System.out.println("\nBravo vous avez gagné la partie ! On vous restaure 3€ !"
                            + "\nVotre solde actuel : " + solde_compte);
                }
                else {
                    System.out.println("\nVous devez posséder au moins 2.3 euros et 1 en énergie !"
                            + "\nVotre solde actuel : " + solde_compte
                            + "\nVotre solde en énergie : " + energie);
                }
                break;
            case 4 :
                // menu burger
                
                System.out.println("\n1 - Petit burger - Prix : 4€ ! \n2 - Grand burger - Prix : 10€ !");
                
                // valeur choisi de l'utilisateur entre 1 et 4
                
                Choix_burger = saisieUtilisateur.nextInt();
                
                switch (Choix_burger) {
                case 1 :
                    if (solde_compte >= prix_petit_burger) {
                        solde_compte -= prix_petit_burger;
                        energie += 1;
                        System.out.println("\nVotre burger arrive ! On vous débit de 4€ et vous restaure 1 en énergie !"
                                + "\nVotre solde actuel : " + solde_compte);
                    }
                    else {
                        System.out.println("\nVous devez posséder au moins 4€ ! "
                                + "\nVotre solde actuel : " + solde_compte
                                + "\nVotre solde en énergie : " + energie);
                    }
                    break;
                case 2 :
                    if (solde_compte >= prix_grand_burger) {
                        solde_compte -= prix_grand_burger;
                        energie += restaure_energie;
                        System.out.println("\nVotre burger arrive ! On vous débit de 10€ et vous restaure 3 en énergie !"
                                + "\nVotre solde actuel : " + solde_compte
                                + "\nVotre solde en énergie : " + energie);
                    }
                    else {
                        System.out.println("\nVous devez posséder au moins 10€ ! "
                                + "\nVotre solde actuel : " + solde_compte);
                    }
                    break;
                }
                break;
                
                default :
                System.out.println("\nSaisir un chiffre entre 1 et 4 !");
            }
            System.out.println("\nSaisir 0 pour sortir du bar !");
            Choix= saisieUtilisateur.nextInt();
        } while (Choix != 0);
        
        saisieUtilisateur.close();
    }
}