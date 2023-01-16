public class Main {
    public static void main(String[] args) {

        Eleman eleman = new Eleman(new Adepartman(), new Calisan());
        int CalisanMaas = eleman.MaasHesapla();
        System.out.println(CalisanMaas);

    }
}