import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UgyfelLista implements IDAO<Ugyfel> {
    private List<Ugyfel> Adatlista;
    public UgyfelLista(String filepath) {
        this.Adatlista = new ArrayList<Ugyfel>();
        try {
            Scanner sc = new Scanner(new File(filepath));
            while(sc.hasNext()) {
                int id = sc.nextInt();
                String rendszam = sc.next();
                int belepes = sc.nextInt();
                int kilepes = sc.nextInt();
                Ugyfel seged = new Ugyfel(id, rendszam, belepes, kilepes);
                this.Adatlista.add(seged);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("A fajl nem talalhato!");
        }
    }

    public List<Ugyfel> getAdatlista() {
        return Adatlista;
    }

    public void setAdatlista(List<Ugyfel> adatlista) {
        Adatlista = adatlista;
    }

    public int Lekerdez(String rendszam) {
        for(Ugyfel i : this.Adatlista) {
            if(i.getRendszam().equals(rendszam)) return i.parkolasiDij();
        }
        return 0;
    }

    @Override
    public ArrayList<Ugyfel> getAll() {
        return (ArrayList<Ugyfel>) this.Adatlista;
    }

    @Override
    public Ugyfel getItemById(int id) {
        for(Ugyfel u : this.Adatlista) {
            if(u.getId() == id) return u;
        }
        return null;
    }

    @Override
    public void insert(Ugyfel ugyfel) {
        this.Adatlista.add(ugyfel);
    }
}
