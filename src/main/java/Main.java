import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Starting App");;
        Path txtfile = Paths.get("src/main/resources/imput.txt");
        String message = Files.readString(txtfile);
        CountingModule module = new CountingModule(message);
        module.run();
    }
}

