public class App {
    public static void main(String[] args) throws Exception {
        /*Player pelaaja1 = new Player();

        Player pelaaja2 = new Player();
        
        Player pelaaja3 = new Player();

        pelaaja1.name = "Mikko";
        pelaaja1.points = 2;

        pelaaja2.name = "Jukka";
        pelaaja2.points = 5;

        pelaaja3 = pelaaja2;

        System.out.println(pelaaja1.name + " " + pelaaja1.points);
    
        System.out.println(pelaaja2.name + " " + pelaaja2.points);
    
        System.out.println(pelaaja3.name + " " + pelaaja3.points);*/

        Player pelaaja = new Player();
        pelaaja.setName("Markku");

        pelaaja.addPoints(10);
        pelaaja.addPoints(2);
        pelaaja.addPoints(7);

        System.out.println(pelaaja.getInfo());

        pelaaja.setName("Teuvo");

        System.out.println(pelaaja.getInfo());

        Player pelaaja2 = new Player("Jukka");
        pelaaja2.addPoints(-7);
        System.out.println(pelaaja2.getInfo());
    }
}
