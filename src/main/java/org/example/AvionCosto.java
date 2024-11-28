package org.example;

import java.util.Scanner;

public class AvionCosto extends AvionCapacidad{
    private double costo;


    public AvionCosto(String tipo, String marca, String modelo, String color, double tiempoLlegada, int capacidad, double costo) {
        super(tipo, marca, modelo, color, tiempoLlegada,capacidad);
        this.costo = costo;
    }
    public double getCosto() {
        return costo;
    }

    @Override
    public void MostrarDatos(){
        super.MostrarDatos();
        System.out.println("\tMostrar datos del costo del avión: \n");
        System.out.println("Costo: " + costo);
    }
    @Override
    public void CambiarDatos(){
        Scanner sc = new Scanner(System.in);
        super.CambiarDatos();
        costo = sc.nextInt();
    }
}

/*Se termina con las herencias de Aviones*/