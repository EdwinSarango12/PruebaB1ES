package org.example;

import java.util.Scanner;

public class BusEstado extends Bus{
    private String estado;

    public BusEstado(String tipo, String marca, String modelo, String color, int capacidad, String estado) {
        super(tipo, marca, modelo, color, capacidad);
        this.estado = estado;
    }
    public String getEstado() {
        return estado;
    }

    @Override
    public void MostrarDatos(){
        super.MostrarDatos();
        System.out.println("\tMostrar el estado del AutoBus: \n");
        System.out.println("Estado: " + estado);
    }

    @Override
    public void CambiarDatos(){
        Scanner sc = new Scanner(System.in);
        super.CambiarDatos();
        estado = sc.nextLine();

    }
}
