package inheritanceRelations;

public class OgretimGorevlisi extends Akademisyen {
    private String kapino;

    public OgretimGorevlisi(String adSoyad, String telefon, String eposta, String bolum, String unvan, String kapino){
        super(adSoyad,telefon,eposta,bolum,unvan);
        this.kapino = kapino;
    }

    public String getKapino() {
        return kapino;
    }

    public void setKapino(String kapino) {
        this.kapino = kapino;
    }
}
