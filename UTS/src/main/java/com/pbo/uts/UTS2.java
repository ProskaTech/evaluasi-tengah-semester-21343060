/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.uts;
import java.util.Scanner;

/**
 *
 * @Created By Diuel
 */
public class UTS2 {
     public static void main(String[] args) {
    int y;
    int a;
    int jml_baris;

    System.out.print("Tampilan Hasil Program \n");
    Scanner input = new Scanner(System.in);
    System.out.print("Masukan Jumlah Baris : ");
    jml_baris = input.nextInt();
    
    for (y=1; y<=jml_baris; y++)
    {
        for (a=1; a<=y; a++)
        {
            System.out.print(" ");
        }
            for (a=5; a>=y; a--)
            {
                System.out.print("#");
                System.out.print(" ");
            }
        System.out.println();
    }
    
    for (y=1; y<=jml_baris; y++)
    {
        for (a=5; a>=y; a--)
        {
            System.out.print(" ");
        }
            for (a=1; a<=y; a++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
                System.out.println();
    }

    }
}
