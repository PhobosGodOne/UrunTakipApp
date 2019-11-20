package Proje;

/**
 *
 * @author Hazar-Legion
 */
public class TehlikeliUrun extends Urun {

    String tehlike_turu;

    public TehlikeliUrun(String tehlike_turu) {

        super();
        this.tehlike_turu = tehlike_turu;
    }

    @Override
    public void deneme() {

        System.out.println("overriding denemesi Tehlikeli Ürün class ından başarılı.");

    }

}
