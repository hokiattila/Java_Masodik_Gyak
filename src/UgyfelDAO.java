import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class UgyfelDAO implements IDAO<Ugyfel>{
    private final String filename;
    public UgyfelDAO(String filename) {this.filename = filename;}

    @Override
    public ArrayList<Ugyfel> getAll() {
        ArrayList<Ugyfel> ugyfelek = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(filename));
            while(scanner.hasNext()) {
                int id = scanner.nextInt();
                String rendszam = scanner.next();
                int belepes = scanner.nextInt();
                int kilepes = scanner.nextInt();
                Ugyfel seged = new Ugyfel(id, rendszam, belepes, kilepes);
                ugyfelek.add(seged);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return ugyfelek;
    }

    @Override
    public Ugyfel getItemById(int id) {
        return null;
    }

    @Override
    public void insert(Ugyfel ugyfel) {

    }
}
