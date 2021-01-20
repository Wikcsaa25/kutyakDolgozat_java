
package kutyaForm;

public class kutyaClass {
    private String fajta;
    private String nem;
    private String kor;
    private String nev;
    
    public String getFajta() {
        return fajta;
    }

    public String getNem() {
        return nem;
    }

    public String getKor() {
        return kor;
    }

    public String getNev() {
        return nev;
    }

    public kutyaClass(String fajta, String nem, String kor, String nev) {
        this.fajta = fajta;
        this.nem = nem;
        this.kor = kor;
        this.nev = nev;
    }
    
}
