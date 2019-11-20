package Proje;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hazar-Legion
 */
public class TestClass {

    //konsol temizlemek için bir fonksiyon oluşturdum.
    public static void cleanScreen() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.flush();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Urun> list = new ArrayList<Urun>();

        Urun temporary_mal = new Urun();

        Urun memory_mal = new Urun();

        Randomizer memory_randomizer = new Randomizer();

        int i;

        while (true) { //Burada bir loop açarak kısmen bir kullanıcı paneli oluşturmayı amaçladım.

            System.out.println("Komutlar icin 'help' yazınız.\nYapmak istediginiz islemi seciniz.\n");

            String secenek = scan.nextLine();

            cleanScreen();

            switch (secenek) {

                case "help":
                    System.out.println("additem : Urun ekle");
                    System.out.println("addrandom : Random bilgilerle dilenen sayida urun yarat.");
                    System.out.println("listall : Tum urunleri goster");
                    System.out.println("choose : Degisiklik yapmak icin bir urun sec.");
                    System.out.println("remove : Var olan bir ürünü sil.");

                    System.out.println("");
                    int size = list.size();

                    break;

                case "additem":
                    System.out.println("Urun adi giriniz\n");
                    int index = list.size();

                    memory_mal = new Urun();
                    list.add(memory_mal);

                    list.get(index).urun_adi = scan.nextLine();
                    System.out.println("");

                    break;

                case "addrandom":

                    System.out.println("Yaratmak istediginiz urun sayisi giriniz.");
                    int random_urun_sayisi = scan.nextInt();

                    if (random_urun_sayisi < 1) {
                        System.out.println("Gecersiz sayi girdiniz.");
                    } else {

                        memory_mal = new Urun();
                        memory_randomizer.Randomizer(random_urun_sayisi, memory_mal, list);

                    }

                    memory_mal.tehlikeli_mi(list, list.size());

                    break;

                case "listall":

                    size = list.size();

                    if (list.isEmpty()) {
                        System.out.println("Henuz bir urun bulunmamakta.\n");
                    }

                    memory_mal.listall(list, size);

                    System.out.println("Tehlike türünü görmek istediğiniz ürünü seçmek için 1 ana menü için 0 a basınız.");

                    break;

                case "choose":

                    memory_mal.listall(list, list.size());

                    if (list.isEmpty()) {

                        System.out.println("Urun bulunmamaktadır.");
                        break;

                    }

                    System.out.println("Degisim yapmak istediginiz urun kodunu giriniz.");

                    int urunkodu = scan.nextInt();

                    cleanScreen();

                    memory_mal.listforchoose(list, urunkodu);

                    System.out.println("Degisiklik yapmak istediginiz bilgiyi seciniz.");

                    int girdi = scan.nextInt();

                    scan.nextLine();
                    switch (girdi) {

                        case (1):

                            System.out.println("Yeni ürün adı giriniz.");
                            String yeniad = scan.nextLine();

                            list.get(urunkodu).urun_adi = yeniad;

                            break;

                        case (2):

                            System.out.println("Yeni stok sayısı giriniz.");
                            int yenistok = scan.nextInt();
                            list.get(urunkodu).stok_sayisi = yenistok;

                            break;

                        case (3):

                            System.out.println("Yeni alis fiyati giriniz.");
                            int yenialis = scan.nextInt();
                            list.get(urunkodu).stok_sayisi = yenialis;

                            break;

                        case (4):

                            System.out.println("Yeni satis fiyati giriniz.");
                            int yenisatis = scan.nextInt();
                            list.get(urunkodu).stok_sayisi = yenisatis;

                            break;

                        case (5):

                    }

                    break;

                case "remove":

                    memory_mal.listall(list, list.size());

                    System.out.println("Kaldırmak istediğiniz ürün kodunu giriniz.");

                    int kaldirilacak = scan.nextInt();

                    list.remove(kaldirilacak);

            }

        }

    }

}
