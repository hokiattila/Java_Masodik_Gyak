import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        final String filepath = "C:\\Users\\T470S\\Desktop\\Gyak02\\src\\adatok.txt";
        UgyfelLista lista = new UgyfelLista(filepath);
        Collections.sort(lista.getAdatlista());
        for(Ugyfel i : lista.getAdatlista()) {
            System.out.println(i);
        }
        System.out.println(lista.Lekerdez("Nincs ilyen"));
        System.out.println(lista.Lekerdez("AHJ034"));

    }
}
