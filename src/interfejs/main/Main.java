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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pas ker = new Pas();
        ker.zvuk();
        ker.jelo("granule");
        Macka pecic = new Macka();
        pecic.zvuk();
        pecic.jelo("govna");
        Krava masa =new Krava();
        masa.zvuk();
        masa.jelo("seno");
        
    }
    
}
