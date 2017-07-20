package interfejs.main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vasilije Pantic
 */
public class Macka implements Zivotinje{

    @Override
    public void zvuk() {
        System.out.println("mrnjau");
    }

    @Override
    public void jelo(String hrana) {
        System.out.println("Macka jede: " + hrana);
    }
    
}
