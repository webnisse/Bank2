  import java.util.Scanner;
public class Konto {

    //Attribut
    double saldo = 0;
    double money;
    int nummer;
    int val;

    //Konstruktor

    public Konto(){
        Scanner myScan = new Scanner(System.in);

        aSk();

        saldo = money + saldo;
        System.out.println("Konto " + nummer);
        System.out.println( "Nya saldo: " + saldo);






    }

    public void aSk(){
        Scanner myScan = new Scanner(System.in);

        System.out.println("Skriv in konto nummer: "); nummer = myScan.nextInt();


        System.out.println("Saldo: " + saldo );

        System.out.println("sätt in pengar på kontot " );

        money = myScan.nextInt();
    }

}

