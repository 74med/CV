package MonPremierProjet;


import java.util.Scanner;

public class Exo9 {
    static int jeune, moyen, vieux, age = 0; //on déclare les variables qui vont nous êtres utiles

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in); // import scanner

        do{

            System.out.println("Veuillez saisir votre âge : ");

    //        int jeune = sc.nextInt(); // recup l'age des utilisteurs >20
    //        int moyen = sc.nextInt(); // recup l'age des utilisteurs <40
    //        int vieux = sc.nextInt(); // recup l'age des utilisteurs >=40
    //
    //        System.out.println("Vous avez saisi : " + jeune + moyen + vieux);

            age = sc.nextInt();
            System.out.println("Vous avez saisi : " + age);

            sc.nextLine();


            //if((jeune < 20) | (moyen < 40) | (vieux >= 40)) {
         

            if(age < 20){
                jeune++;
                System.out.println("Il y a désormais " + jeune + " jeune(s) personne(s)");
            }else if(age < 40) {
                moyen++;
                System.out.println("Il y a désormais " + moyen + " personne(s) d'age moyen");
            }else if(age < 100){
                vieux++;
                System.out.println("Il y a désormais " + vieux + " personne(s) agée(s)");
        }}while(age < 100);

        vieux++;
        System.out.println("Il y a désormais " + vieux + " personne(s) agée(s) et nous avons trouvé un centenaire, fin du programme...");

        sc.close();
    }
}