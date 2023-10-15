
public class YolcuKontrol implements IYolculukKurallari{
    private int harc;
    private String vize;
    private String sabika;
    private String adliSicil;

    public YolcuKontrol(int harc, String vize, String sabika, String adliSicil) {
        this.harc = harc;
        this.vize = vize;
        this.sabika = sabika;
        this.adliSicil = adliSicil;
    }
    
    public boolean harc_kontrol() {
        if (this.harc < 200) {
            return false;
        } else {
            return true;
        }
    }

    
    public boolean vize_kontrol() {
        if (vize.equals("evet")) {
            return true;
        } else {
            return false;
        }

    }

    
    public boolean sabika_kontrol() {
        if (sabika.equals("evet")) {
            return true;
        } else {
            return false;
        }
    }

    
    public boolean adliSicil_kontrol() {
        if (adliSicil.equals("evet")) {
            return true;
        } else {
            return false;
        }

    }

}


