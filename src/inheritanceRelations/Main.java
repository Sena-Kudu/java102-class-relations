package inheritanceRelations;

public class Main {

    public static void main(String[] args){
        Akademisyen a1 = new Akademisyen("Sena Kudu","89849729","mail@mail.com", "CENG", "docent");
        Memur m1 = new Memur("Patika Dev","89849729","patika@mail.com", "java", "09:00-18:00");

        //Hiyerarsik kalitim Calisan->Akademisyen->OgretimGorevlisi
        OgretimGorevlisi o1 = new OgretimGorevlisi("Ali Veli","0","random@mail.com", "CENG", "docent", "110");
        o1.giris();
    }
}
