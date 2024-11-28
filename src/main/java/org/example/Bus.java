package org.example;

import java.util.Scanner;

public class Bus extends Transportes{
    private int capacidad;

    public Bus(String tipo, String marca, String modelo, String color, int capacidad) {
        super(tipo, marca, modelo, color);
        this.capacidad = capacidad;
    }
    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public void MostrarDatos(){
        super.MostrarDatos();
        System.out.println("\tCapacidad del bus:\n");
        System.out.println("Capacidad: " + capacidad);
    }
    @Override
    public void CambiarDatos(){
        Scanner sc = new Scanner(System.in);
        super.CambiarDatos();
        capacidad = sc.nextInt();
    }
}
