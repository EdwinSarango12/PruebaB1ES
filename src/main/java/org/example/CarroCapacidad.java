package org.example;

import java.util.Scanner;

public class CarroCapacidad extends Carro{
    private int capacidad;

    public CarroCapacidad(String tipo, String marca, String modelo, String color, String dueno, int capacidad) {
        super(tipo, marca, modelo, color, dueno);
        this.capacidad = 0;
    }
    private int getCapacidad() {
        return capacidad;
    }

    @Override
    public void MostrarDatos(){
        super.MostrarDatos();
        System.out.println("\tDatos de la capacidad del carro: \n");
        System.out.println("Capacidad: " + getCapacidad());
    }

    @Override
    public void CambiarDatos(){
        Scanner sc = new Scanner(System.in);
        super.CambiarDatos();
        capacidad = sc.nextInt();
    }
}
