/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan57;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle b = new Bicycle();
        b.setBrand("Trek Bike");
        b.setModel("7.4FX");
        b.setGearCount(23);
        System.out.println("Brand : "+b.getBrand());
        System.out.println("Model : "+b.getModel());
        System.out.println("Jumlah Gear : "+b.getGearCount());
        System.out.println();
        Skateboard s = new Skateboard();
        s.setBrand("Ally Skate");
        s.setModel("Rocket");
        s.setBoardLength(54.5);
        System.out.println("Brand : "+s.getBrand());
        System.out.println("Model : "+s.getModel());
        System.out.println("Panjang Board : "+s.getBoardLength());
    }

}
