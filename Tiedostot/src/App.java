import java.io.*;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.Files;

public class App {
    public static void main(String[] args) throws Exception {

        File f = new File("C:/Temp/oma");

        f.mkdirs();

        File doc = new File(f.getAbsolutePath() + "/dokumentti.txt");
        doc.createNewFile();

        FileWriter fw = new FileWriter(doc, true);

        fw.write("Jukka" + System.lineSeparator());
        fw.write("Mauno" + System.lineSeparator());
        fw.write("Seppo" + System.lineSeparator());

        fw.close();

        Files.copy(Path.of(f.getAbsolutePath() + "/dokumentti.txt"),
            Path.of(f.getAbsolutePath() + "/backup.txt"), StandardCopyOption.REPLACE_EXISTING);
    }
}
