package org.example;

import java.util.Scanner;

public class AvionCapacidad extends avion{
    private int capacidad;

    public AvionCapacidad(String tipo, String marca, String modelo, String color, double tiempoLlegada, int capacidad) {
        super(tipo, marca, modelo, color, tiempoLlegada);
        this.capacidad = capacidad;
    }
    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public void MostrarDatos(){
        super.MostrarDatos();
        System.out.println("\tDatos de la capacidad del avión:n");
        System.out.println("Capacidad: " + capacidad);
    }
    @Override
    public void CambiarDatos(){
        Scanner sc = new Scanner(System.in);
        super.CambiarDatos();
        capacidad = sc.nextInt();
    }
}
