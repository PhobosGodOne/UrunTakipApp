package Proje;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Hazar-Legion
 */
public class Randomizer {

    String[] urun_isimleri = {"Gofret", "Elma", "Rakı", "Pusula", "Muz", "Petrol", "Zenginleştirilmiş Uranyum", "LNG", "LPG", "Doğalgaz"};

    String[] limanlar = {"Shangai Limani", "Rotterdam Limani", "Tianjin Limani", "Quinghuangdao Limanı", "Hong Kong Limanı", "Mersin Limanı",
        "Ambarlı Limanı", "Haydarpaşa Limanı", "Paris Limanı", "Büyük Hollanda limanı"};
    Random random = new Random();

    //Random urun olusturmak icin bir fonksiyon
    public void Randomizer(int urunsayisi, Urun urun, ArrayList<Urun> arrlistesi) {

        for (int i = 0; i < urunsayisi; i++) {

            urun.urun_adi = this.urun_isimleri[random.nextInt(10)];
            urun.stok_sayisi = 500 + random.nextInt(999999);
            urun.alis_fiyati = 400 + random.nextInt(55555);
            urun.satis_fiyati = urun.alis_fiyati + urun.alis_fiyati * random.nextInt(10) / 10;
            urun.ayrildigi_liman = this.limanlar[random.nextInt(10)];
            urun.varis_limani = this.limanlar[random.nextInt(10)];

            arrlistesi.add(urun);
            urun = new Urun();

        }

    }

}
