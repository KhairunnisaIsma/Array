/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Khairunnisa Isma
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    ArrayList<Peta> tampung;

    public Array() {
        //instansiasi
        tampung = new ArrayList<Peta>();
    }

    public void isiData(String kota, int y, int x) {
        tampung.add(new Peta(kota, y, x));
    }

    public void hapus() {
        tampung.removeAll(tampung);
    }

    public void showData() {
        System.out.println("{Kota,Koordinat Y,Koordinat X}");

        for (Peta peta : tampung) {
            if(tampung.size()==1&&tampung.indexOf(peta)==1){
                System.out.println("{" + peta.getKota() + "" + ", " + peta.getY() + "," + peta.getX() + "}");
            }
            else{
                System.out.println("{" + peta.getKota() + "" + ", " + peta.getY() + "," + peta.getX() + "}");
            }
            

        }
    }
    

    public static void main(String[] args) {
        String a;
        int b, c;
        Array td = new Array();
        Scanner scan = new Scanner(System.in);
        int menu;
        do {
            System.out.println("Menu Peta");
            System.out.println("1. Input Data Peta");
            System.out.println("2. Delete Data Kota");
            System.out.println("3. Delete Data Koordinat Y & X");
            System.out.println("4. Searching Data Kota");
            System.out.println("5. Searching Data Koordinat Y & X");
            System.out.println("0. Keluar");
            System.out.print("Masukan Pilihan Anda : ");
            menu = scan.nextInt();

            switch (menu) {
                case 0:
                    System.out.println("Keluar");
                    break;
                case 1:
                    System.out.println("Input Data Peta");
                    System.out.print("Input jumlah Data : ");
                    int jlh_data = scan.nextInt();
//        Input tiap nilai dan masukkan ke dalam ArrayList    

                    System.out.println("\nInput nilai Data");
                    for (int i = 0; i < jlh_data; i++) {
                        System.out.println("Data ke-" + (i + 1) + " : ");
                        System.out.print("Kota\t: ");
                        a = scan.next();
                        System.out.print("y\t: ");
                        b = scan.nextInt();
                        System.out.print("x\t: ");
                        c = scan.nextInt();
                        td.isiData(a, b, c);
                    }
                    td.showData();
                    break;
                case 2:
                    System.out.println("Delete Data Kota");
                    td.hapus();
                    td.showData();

                    break;
                case 3:
                    System.out.println("Delete Data Koordinat Y & X");
                    break;
                case 4:
                    System.out.println("Searching Data Kota");

                    break;
                case 5:
                    System.out.println("Searching Data Koordinat X dan Y");

                    break;
                default:
                    System.out.println("Error");
            }
        } while (menu != 0);

    }
}
