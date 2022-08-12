package com.tugas;

import java.io.IOException;
import java.util.Scanner;

class Tugas {
    protected String a = "Tugas";

    public void honk() {
        System.out.println("\t  Menu");
    }

}

class ClsMenu extends Tugas {
    private String list = "Lihat";
    private String plus = "tambah";
    private String exit = "Exit";
    private String garis = "========================";

    public static void main(String[] args) throws IOException {

        Fitur myFitur = new Fitur();
    ClsMenu myObj = new ClsMenu();
        Babu B = new Babu();
        ListTugas daftar = new ListTugas();
        TambahTugas tambah = new TambahTugas();
        Scanner menu = new Scanner(System.in);
        boolean back = true;

        while (back) {
            B.clearScreen();
            System.out.println(myObj.garis);
            myObj.honk();
            System.out.println(myObj.garis);
            System.out.println("1. "+ myObj.list +" "+myObj.a );
            System.out.println("2. "+ myObj.plus +" "+myObj.a);
            System.out.println("3. "+myObj.exit+"");
            System.out.print("\ninput : " );
            String pilih = menu.nextLine();
            switch (pilih) {
                case "1":
                B.clearScreen();
                    myFitur.setFitur("List Tugas");
                    System.out.println("\n\t"+myFitur.getFitur());
                    daftar.listTugas();
                    break;
                case "2":
                B.clearScreen();
                    myFitur.setFitur("Catat Tugas");
                    System.out.println("\n\t"+myFitur.getFitur()+"\n");
                    tambah.tambahTugas();
                    break;
                case "3":
                B.clearScreen();
                    myFitur.setFitur("Exit Tugas");
                    System.out.println("\n\t"+myFitur.getFitur());
                    break;
    
                default:
                B.clearScreen();
                System.err.println("tolong input 1-3");
                    break;
            }
            back = B.yesNo("ingin kemabli ke menu? ");
        }
    }

}
