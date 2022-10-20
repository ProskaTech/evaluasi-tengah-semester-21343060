/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.uts;
import javax.swing.JOptionPane;

/**
 *
 * @Created By Diuel
 */
public class UTS3 {
 public static void main(String[] args) {
        int angka;
        String ang;
        
        ang = JOptionPane.showInputDialog("Masukkan Angka");
        angka = Integer.parseInt(ang);
        
        if(angka>0) {
            JOptionPane.showMessageDialog(null,"Angka "+angka+" merupakan angka positif" );
        }
        else if (angka<0){
          JOptionPane.showMessageDialog(null, "Angka "+angka+" merupakan angka negatif" );  
        }
        else{
            JOptionPane.showMessageDialog(null, "Angka "+angka+" merupakan angka netral" );
        }
    }
}

