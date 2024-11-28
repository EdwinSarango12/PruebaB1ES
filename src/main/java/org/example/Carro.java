package org.example;

import java.util.Scanner;

public class Carro extends Transportes {
    private String dueno;

    public Carro(String tipo, String marca, String modelo, String color, String dueno) {
        super(tipo, marca, modelo, color);
        this.dueno= dueno;
    }
    private String getDueno() {
        return dueno;
    }

    @Override
    public void MostrarDatos(){
        super.MostrarDatos();
        System.out.println("Datos del Dueño del carro");
        System.out.println("Dueno: " + getDueno());
    }

    @Override
    public void CambiarDatos(){
        Scanner sc = new Scanner(System.in);
        super.CambiarDatos();
        this.dueno = sc.nextLine();
    }

}
