package inheritanceRelations;

public class Memur extends Calisan {
    private String depatrman;
    private String mesai;

    public Memur(String adSoyad, String telefon, String eposta, String depatrman, String mesai) {
        super(adSoyad,telefon,eposta);
        this.depatrman = depatrman;
        this.mesai = mesai;
    }

    public String getDepatrman() {
        return depatrman;
    }

    public void setDepatrman(String depatrman) {
        this.depatrman = depatrman;
    }

    public String getMesai() {
        return mesai;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }
}
