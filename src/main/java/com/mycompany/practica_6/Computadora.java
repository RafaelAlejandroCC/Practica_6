/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_6;

/**
 *
 * @author Rafael Alejandro
 */
public class Computadora extends ComponentesElectronicos implements IOtrosComponentesE{

    @Override
    public String encender() {
        return "Computadora Encendido";
    }

    @Override
    public String apagar() {
        return "Computadora Apagada";
    }
    
}
