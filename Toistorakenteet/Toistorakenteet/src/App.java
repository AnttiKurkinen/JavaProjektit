import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        //while esimerkki
        
        int sijoitus = 1;

        switch(sijoitus){
            case 1:
            System.out.println("Numero 1");
            break;

            case 2:
            System.out.println("Numero 2");

            default:
            System.out.println("Sijoitus joku muu");
            break;
        }
        //1.tehtävä
        /*int i = 0;

        while(i<3){
            System.out.println("Tervetuloa");
            i++;
        }*/
        
        //2.tehtävä
        /*int i = 1;

        while(i<4){
            System.out.println(i);
            i++;
        }*/

        //3.tehtävä
        /*int i = 1;

        while(i < 10){
            System.out.println((i++)+ "*5");
        }*/

        //4.tehtävä
        /*int i = 0;

        while(i < 21){
            System.out.println(i);
            i+=2;
        }*/

        //5.tehtävä
        /*Scanner sc = new Scanner(System.in);

        int luku = 1;

        while( luku !=0 ){
            System.out.println("Anna numero");
            luku = Integer.parseInt(sc.nextLine());
        }
        sc.close();*/

        //6.tehtävä

        /*Scanner sc = new Scanner(System.in);

        int luku = 0;
        int summa = 0;

        while(luku++ <5){
            System.out.println("Anna 5 lukua");
            summa += Integer.parseInt(sc.nextLine());
        }
        System.out.println(summa);

        sc.close();*/

        //7.tehtävä

        /*Scanner sc = new Scanner(System.in);
        
        int luku = 0;

        while(luku < 1 || luku >10){
            System.out.println("Anna luku");
            luku = Integer.parseInt(sc.nextLine());
        }*/

    }
}
