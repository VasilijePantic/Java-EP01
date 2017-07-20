/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfejs.vezba;

/**
 *
 * @author Vasilije Pantic
 */
public class Main {

    public static void main(String[] args) {
        Filip filip = new Filip();
        System.out.println("zavisnost");
        filip.zavisnosti();
        filip.brojGodina(15);
        filip.zanimanje("programer", 1000);

        Vasa vasa = new Vasa();
        System.out.println("zavisnost");
        vasa.zavisnosti();
        vasa.brojGodina(69);
        vasa.zanimanje("pornicar", 5000);

        Pecic pecic = new Pecic();
        System.out.println("zavisnost");
        pecic.zavisnosti();
        pecic.brojGodina(5);
        pecic.zanimanje("ispijanje kafe", 50);
    }
}
