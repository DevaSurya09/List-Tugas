package com.tugas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ListTugas {
    public void listTugas() throws IOException {

        FileReader fileInput;
        BufferedReader buffer1;
        
        try {
            fileInput = new FileReader("catatan.txt");
            buffer1 = new BufferedReader(fileInput);
        } catch (Exception e) {
            System.err.println("error");
            return;
        }
        String data = buffer1.readLine();
        int angka = 0;
        System.out.println("________________________________________________________");
        System.out.println("| No. | tanggal membuat | mata Pelajaran |   Tanggat   |");
        System.out.println("|-----+-----------------+----------------+-------------|");
        while (data != null) {
            
            StringTokenizer token = new StringTokenizer(data, ",");
            angka++;
            System.out.printf("|  %-3d|", angka);
            System.out.printf("\t %-7s\t|", token.nextToken());
            System.out.printf("  %-7s\t |", token.nextToken());
            System.out.printf(" %-10s  |", token.nextToken());
            System.out.print("\n");

            data = buffer1.readLine();
        }

    }
}
