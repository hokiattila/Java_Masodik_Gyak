public class Ugyfel implements Comparable<Ugyfel>{
    private int Id;
    private String Rendszam;
    private int belepes;
    private int kilepes;

    public Ugyfel(int id, String rendszam, int belepes, int kilepes) {
        Id = id;
        Rendszam = rendszam;
        this.belepes = belepes;
        this.kilepes = kilepes;
    }

    public int parkolasiDij() {
        if((this.kilepes - this.belepes) <= 600) return 0;
        else return (((this.kilepes - this.belepes)/3600)+1) * 500;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getRendszam() {
        return Rendszam;
    }

    public void setRendszam(String rendszam) {
        Rendszam = rendszam;
    }

    public int getBelepes() {
        return belepes;
    }

    public void setBelepes(int belepes) {
        this.belepes = belepes;
    }

    public int getKilepes() {
        return kilepes;
    }

    public void setKilepes(int kilepes) {
        this.kilepes = kilepes;
    }

    @Override
    public String toString() {
        return this.Id + " " + this.Rendszam + " " + this.belepes + " " + this.kilepes + " " + this.parkolasiDij() + " Ft";
    }


    @Override
    public int compareTo(Ugyfel o) {
        if(this.parkolasiDij() > o.parkolasiDij()) return 1;
        else if(this.parkolasiDij() == o.parkolasiDij()) return 0;
        return -1;
        // return Integer.compare(this.parkolasiDij(), o.parkolasiDij());
    }
}
