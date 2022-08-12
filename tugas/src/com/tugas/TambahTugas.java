package com.tugas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class TambahTugas {
    public void tambahTugas() throws IOException {
        Babu B = new Babu();
        FileWriter fileOutput = new FileWriter("catatan.txt", true);
        BufferedWriter buffer2 = new BufferedWriter(fileOutput);

        Scanner tulis = new Scanner(System.in);
        String tugas, tanggat;

        LocalDateTime tPengisian = LocalDateTime.now();
        DateTimeFormatter Format = DateTimeFormatter.ofPattern("dd-MMM");
        String DayMount = tPengisian.format(Format);



        System.out.print("masukan nama tugas : ");
        tugas = tulis.nextLine();
        System.out.print("tanggat tugas (dd-MMM) : ");
        tanggat = tulis.nextLine();

        String[] keyWords = { DayMount + "," + tugas + "," + tanggat };
        System.out.println(Arrays.toString(keyWords));

        boolean tambah = B.yesNo("apakah anda ingin menyimpan? ");

        if (tambah) {
            buffer2.write(DayMount + "," + tugas + "," + tanggat);
            buffer2.newLine();
            buffer2.flush();
        }
        buffer2.close();
    }
}
