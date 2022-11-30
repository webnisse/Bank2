import java.util.Scanner;

public class User {

    //Attribut
    String name;
    int val;
    int pernum;
    Konto konto;

    //contructor
    public User() {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Inloggning");

        System.out.println("------------------------------------------");

        askNP();

        System.out.println("Namn: " + name);
        System.out.println("Personnummer: " + pernum);
        System.out.println("------------------------------------------");

        System.out.println("Vill du sätta in pengar [1]");

        System.out.println("Vill du sätta int pengar på spar konto [2]");

        val =myScan.nextInt();

        if ( val == 1){
            Konto myKonto = new Konto();
        } else if (val==2) {
            Sparkonto mySpar = new Sparkonto();

        }


    }
    // skriva in person nummer och namn
    public void askNP (){
        Scanner myScan = new Scanner(System.in);
        System.out.println("Skriv Namn: ");
        name = myScan.next();

        System.out.println("Skriv Personnummer: ");
        pernum = myScan.nextInt();

        return;
    }

}
