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
public class Pecic implements Drugari {

    @Override
    public void zavisnosti() {
        System.out.println("anime");
    }

    @Override
    public void brojGodina(int brojGodina) {
        System.out.println("Pele ima: " + brojGodina);
    }

    @Override
    public void zanimanje(String zanimanje, int plata) {
        System.out.println("zanimanje: " + zanimanje + " plata: " + plata);
    }

}
