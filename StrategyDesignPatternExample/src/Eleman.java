public class Eleman {
    public IzinHesapla izinHesapla;
    public MaasHesapla maasHesapla;

    public Eleman(IzinHesapla izinHesapla, MaasHesapla maasHesapla) {
        this.izinHesapla = izinHesapla;
        this.maasHesapla = maasHesapla;
    }

    public int IzinHesapla(){

        return izinHesapla.izinHesapla();
    }
    public int MaasHesapla(){

        return maasHesapla.maasHesapla();
    }
}
