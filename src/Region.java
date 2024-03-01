import javax.crypto.spec.DESKeySpec;

public enum Region {
 OSH("Sulaiman - Too"),
JALAL_ABAD("Sary - Chelek"),
CHUI("Burana"),
BATKEN("Aigul - flower"),
NARYN("Tash - Rabat"),
YSSYK_KOL("Yssyk - kol"),
TALAS("Manas - Ordo"),
    ;
 public String esspecily;
    Region(String esspecily) {
        this.esspecily= esspecily;
    }

    public String getEsspecily() {
        return esspecily;
    }

    public void setEsspecily(String esspecily) {
        this.esspecily = esspecily;
    }
}

