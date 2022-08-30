import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class App {
    public static void main(String[] args) throws Exception {

        //1. tehtävä

        /* Scanner sc = new Scanner(System.in);
        
        System.out.println("Syota kaksi kokonaislukua");
        
        int l1 = sc.nextInt();
        sc.nextLine();
        int l2 = sc.nextInt();

        int summa = l1+l2;
        int tulo = l1*l2;
        int osamaara = l1/l2;

        System.out.println("Summa: " + summa
        + System.lineSeparator() + "Tulo: " + tulo
        + System.lineSeparator() + "Osamaara: " + osamaara);
        sc.close(); */

        //2. tehtävä

        /* Scanner sc = new Scanner(System.in);

        System.out.println("Kerro nimesi ja ikasi");

        String nimi = sc.nextLine();
        int ika = sc.nextInt();
        sc.nextLine();

        System.out.println("Hei " + nimi + "! Olet " + ika + " vuotias.");
        sc.close(); */

        //3. tehtävä

        /*Scanner sc = new Scanner(System.in);

        System.out.println("Syota kaksi kokonaislukua");
        
        int l1 = Integer.parseInt(sc.nextLine());
        int l2 = Integer.parseInt(sc.nextLine());

        int summa = l1+l2;
        int tulo = l1*l2;
        int osamaara = l1/l2;

        System.out.println(l1 + "+" + l2 + "=" + summa
        + System.lineSeparator() + l1 + "*" + l2 + "=" + tulo
        + System.lineSeparator() + l1 + "/" + l2 + "=" + osamaara);
        
        sc.close();*/
        
        //4.tehtävä

        /*Scanner sc = new Scanner(System.in);

        System.out.println("Syota summa dollareina");

        double dollar = Double.parseDouble(sc.nextLine());
        double euro = 1.00;

        System.out.printf("Euroina se on " + dollar*euro + " euroa.");

        sc.close();*/

        //5.tehtävä

        /*Scanner sc = new Scanner(System.in);

        System.out.println("Syota painosi ja pituutesi");

        double paino = sc.nextDouble();
        sc.nextLine();
        double pituus = sc.nextDouble();

        System.out.println("Painoindeksisi on " + paino/(pituus*pituus));

        sc.close();*/

        //6.tehtävä

        /*Scanner sc = new Scanner(System.in);

        System.out.println("Anna suorakulmion pituus ja leveys");

        double pituus = Double.parseDouble(sc.nextLine());
        double leveys = Double.parseDouble(sc.nextLine());
        double pinta=pituus*leveys;

        System.out.println("Anna nelion pituus ja leveys");
        double pituus2 = Double.parseDouble(sc.nextLine());
        double leveys2 = Double.parseDouble(sc.nextLine());
        double pinta2=pituus2*leveys2;

        System.out.println("Anna ympyran sade");
        double sade = Double.parseDouble(sc.nextLine());
        double pinta3 = Math.PI*sade;

        System.out.println("Suorakulmion pinta-ala on " + pinta + " neliometria."
        + System.lineSeparator() + "Nelion pinta-ala on " + pinta2 + " neliometria."
        + System.lineSeparator() + "Ympyran pinta-ala on " + pinta3 + " neliometria.");
        
        sc.close();*/

        
    }
}
