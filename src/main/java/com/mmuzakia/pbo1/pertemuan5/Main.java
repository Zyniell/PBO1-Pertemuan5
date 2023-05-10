/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mmuzakia.pbo1.pertemuan5;

/**
 *
 * @author mmuzaki.a
 */
public class Main {
    public static void main(String[] args){
        Switch switch1 = new Switch();
        switch1.nama   = "Nitendo Switch V1";
        switch1.jenis  = "Lite";
        
        Switch switch2 = new Switch();
        switch2.nama   = "Nitendo Switch V2";
        switch2.jenis  = "Pro";
        
        Switch switch3 = new Switch();
        switch3.nama   = "Nitendo Switch V3";
        switch3.jenis  = "Oled";
        
        
        switch1.info();
        switch2.info();
        switch3.info();
    }
}
