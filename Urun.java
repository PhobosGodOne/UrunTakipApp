package Proje;

import java.util.ArrayList;

/**
 *
 * @author Hazar-Legion
 */
public class Urun {

    public String urun_adi;
    public int alis_fiyati;
    int satis_fiyati;
    int stok_sayisi;
    String ayrildigi_liman;
    String varis_limani;
    boolean tehlikeli_mi;

    // Default girdi veren constructor.
    public Urun() {

        this.urun_adi = "Bilgi Bulunamadi";
        this.ayrildigi_liman = "Bilgi Bulunamadi.";
        this.varis_limani = "Bilgi Bulunamadi.";
        this.satis_fiyati = 0;
        this.alis_fiyati = 0;
        this.stok_sayisi = 0;
        this.tehlikeli_mi = false;

    }

    // overloading
    public Urun(String urunad) {

        this.urun_adi = urunad;
        this.ayrildigi_liman = "Bilgi Bulunamadi.";
        this.varis_limani = "Bilgi Bulunamadi.";
        this.satis_fiyati = 0;
        this.alis_fiyati = 0;
        this.stok_sayisi = 0;

    }

    //overriding
    public void deneme() {

        System.out.println("overriding urun classından başarılı.");

    }

    //tüm ürünleri ve özelliklerini sıralayan bir method.
    public void listall(ArrayList<Urun> arrlist, int size) {

        for (int i = 0; i < size; i++) {

            System.out.println("Urun Kodu = " + i);
            System.out.println("Urun adi = " + arrlist.get(i).urun_adi);
            System.out.println("Urun stok sayisi = " + arrlist.get(i).stok_sayisi);
            System.out.println("Urun alis fiyati = " + arrlist.get(i).alis_fiyati);
            System.out.println("Urun satis fiyati = " + arrlist.get(i).satis_fiyati);
            System.out.println("Ayrildigi Liman = " + arrlist.get(i).ayrildigi_liman);
            System.out.println("Varis Limanı = " + arrlist.get(i).varis_limani);
            if (arrlist.get(i).tehlikeli_mi == true) {
                System.out.println("!!! TEHLIKELI URUN !!!");
            }

            if (arrlist.get(i).urun_adi.equals("Zenginleştirilmiş Uranyum")) {
                System.out.println("Tehlike türü = Nükleer madde");
            } else if (arrlist.get(i).urun_adi.equals("LPG")) {
                System.out.println("Tehlike türü = Yanıcı madde");
            } else if (arrlist.get(i).urun_adi.equals("LNG")) {
                System.out.println("Tehlike türü = Yanıcı madde");
            } else if (arrlist.get(i).urun_adi.equals("LNG")) {
                System.out.println("Tehlike türü = Yanıcı madde");
            } else if (arrlist.get(i).urun_adi.equals("Petrol")) {
                System.out.println("Tehlike türü = Yüksek derecede kirletici kimyasal.");
            } else if (arrlist.get(i).urun_adi.equals("Doğalgaz")) {
                System.out.println("Tehlike türü = Yanıcı - Patlayıcı kimyasal");
            }
            System.out.println("*****************************************");

        }

    }

    // urunler arasından yanlızca belirlenen bir tanesinin özelliklerini gösteren method.
    public void listone(ArrayList<Urun> arrlist, int index) {

        System.out.println("Urun Kodu = " + index);
        System.out.println("1-Urun adi = " + arrlist.get(index).urun_adi);
        System.out.println("2-Urun stok sayisi = " + arrlist.get(index).stok_sayisi);
        System.out.println("3-Urun alis fiyati = " + arrlist.get(index).alis_fiyati);
        System.out.println("4-Urun satis fiyati = " + arrlist.get(index).satis_fiyati);
        System.out.println("5-Ayrildigi Liman = " + arrlist.get(index).ayrildigi_liman);
        System.out.println("6-Varis Limanı = " + arrlist.get(index).varis_limani);

        if (arrlist.get(index).tehlikeli_mi == true) {
            System.out.println("!!! TEHLIKELI URUN !!!");
        }
        if (arrlist.get(index).urun_adi.equalsIgnoreCase("Zenginleştirilmiş Uranyum")) {

            System.out.println("Tehlike türü = Nükleer madde");
        } else if (arrlist.get(index).urun_adi.equals("LPG")) {
            System.out.println("Tehlike türü = Yanıcı madde");
        } else if (arrlist.get(index).urun_adi.equals("LNG")) {
            System.out.println("Tehlike türü = Yanıcı madde");
        } else if (arrlist.get(index).urun_adi.equals("LNG")) {
            System.out.println("Tehlike türü = Yanıcı madde");
        } else if (arrlist.get(index).urun_adi.equals("Petrol")) {
            System.out.println("Tehlike türü = Yüksek derecede kirletici kimyasal.");
        } else if (arrlist.get(index).urun_adi.equals("Doğalgaz")) {
            System.out.println("Tehlike türü = Yanıcı - Patlayıcı kimyasal");
        }
        System.out.println("*****************************************");

    }

    //choose menüsü için mantıken limanları değiştirmek saçma olacağından varış ve ayrılma limanı olmayan bir method.
    public void listforchoose(ArrayList<Urun> arrlist, int index) {

        System.out.println("Urun Kodu = " + index);
        System.out.println("1-Urun adi = " + arrlist.get(index).urun_adi);
        System.out.println("2-Urun stok sayisi = " + arrlist.get(index).stok_sayisi);
        System.out.println("3-Urun alis fiyati = " + arrlist.get(index).alis_fiyati);
        System.out.println("4-Urun satis fiyati = " + arrlist.get(index).satis_fiyati);
        System.out.println("*****************************************");

    }

    //Urun tehkikeli ise tagini değiştiren method
    public void tehlikeli_mi(ArrayList<Urun> arrlist, int size) {

        for (int i = 0; i < size; i++) {

            if (arrlist.get(i).urun_adi.equals("LPG") || arrlist.get(i).urun_adi.equals("LNG") || arrlist.get(i).urun_adi.equals("Doğalgaz") || arrlist.get(i).urun_adi.equals("Zenginleştirilmiş Uranyum") || arrlist.get(i).urun_adi.equals("Petrol")) {

                arrlist.get(i).tehlikeli_mi = true;

            }

        }

    }
    //setter.

    public void setName(String isim) {

        this.urun_adi = isim;

    }

}
