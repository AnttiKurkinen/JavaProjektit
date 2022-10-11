import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
import java.text.NumberFormat.Style;

import jdk.jfr.StackTrace;

public class Lasku {

    static Scanner sc = new Scanner(System.in);
    static FileWriter log;
    public static void main(String[] args) throws Exception{

        log = new FileWriter(new File("log.txt"), true);

        try{
            System.out.println("Anna luku1");
            int luku1 = Integer.parseInt(sc.nextLine());
            System.out.println("Anna luku 2");
            int luku2 = Integer.parseInt(sc.nextLine());
            System.out.println(luku1 + luku2);
            System.out.println(luku1 - luku2);
        }catch(Exception e){
            StackTraceElement[] st = e.getStackTrace();
            String indent = "";
            log.write(e.getMessage() + System.lineSeparator());
            for (StackTraceElement el : st){
                log.write(indent + el.toString() + System.lineSeparator());
                indent += " ";
            }
        }
    }
    
}
