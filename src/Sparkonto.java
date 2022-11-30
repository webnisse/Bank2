import java.util.Scanner;
public class Sparkonto extends Konto {
    double intrest = 1.5;
    double spar;
    double saving;

    public Sparkonto() {

        Scanner myScan = new Scanner(System.in);
        asK();

        if (saldo >= spar) {
            saving = saldo - spar;
        } else if (saldo < spar) {
            System.out.println("Inte tillräkligt med pengar");

            asK();
        }
        System.out.println("spar konto: " + saving);
        saving = spar * intrest;

        System.out.println("Pengar efter ett år" + saving);


    }

    public void asK() {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Saldo: " + saldo);
        System.out.println("Hur mycket vill du lägga in på ditt sparkonto: ");

        spar = myScan.nextInt();
    }


}
