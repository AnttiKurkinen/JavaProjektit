import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        /*int luku1 = 5;
        int luku2 = 8;

        System.out.println("Mielestäni ");

        if (luku1 < luku2){
            System.out.println("ohjelmointi");
        }
        if (luku2 == luku1){
            System.out.println("on");
        }
        else{
            System.out.println("ei ole");
        }
        if (luku1 > luku2 || luku1 != luku2){
            System.out.println("helppoa!");
        }
        else{
            System.out.println("vaikeaa!");
        }
        System.out.println("vai mitä?");
        */

        //2. tehtävä

        /*Scanner sc = new Scanner(System.in);

        System.out.println("Kerro pisteesi");

        int pisteet = Integer.parseInt(sc.nextLine());

        if (pisteet < 10){
            System.out.println("Tuloksesi oli huono");
        }
        else{
            System.out.println("Hyvä tulos");
        }
        sc.close();*/

        //2.a tehtävä

        Scanner sc = new Scanner(System.in);

        System.out.println("Pelaaja 1: Kerro pisteesi");
        int pelaaja1 = Integer.parseInt(sc.nextLine());
        
        System.out.println("Pelaaja 2: Kerro pisteesi");
        int pelaaja2 = Integer.parseInt(sc.nextLine());
        if (pelaaja1 > pelaaja2){
            System.out.println("Pelaaja 1 pisteet: " + pelaaja1
            + System.lineSeparator() + "Pelaaja 2 pisteet: " + pelaaja2
            + System.lineSeparator() + "pelaaja 1 voitti!");
        }
        if(pelaaja1 < pelaaja2){
            System.out.println("Pelaaja 1 pisteet: " + pelaaja1
            + System.lineSeparator() + "Pelaaja 2 pisteet: " + pelaaja2
            + System.lineSeparator() + "pelaaja 2 voitti!");
        }
        if (pelaaja1 == pelaaja2){
            System.out.println("Pelaaja 1 pisteet: " + pelaaja1
            + System.lineSeparator() + "Pelaaja 2 pisteet: " + pelaaja2
            + System.lineSeparator() + "tasapeli!");
        }
    }
}
