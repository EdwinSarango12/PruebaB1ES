package org.example;

import java.util.Scanner;

public class CarroEstado extends CarroCapacidad {
    private String estado;
    public CarroEstado(String tipo, String marca, String modelo, String color, String dueno,int capacidad, String estado) {
        super(tipo, marca, modelo,color, dueno,capacidad);
        this.estado = estado;
    }
    public String getEstado() {
        return estado;
    }

    @Override
    public void MostrarDatos(){
        super.MostrarDatos();
        System.out.println("\tEstado del automovil: \n");
        System.out.println("Estado: " + estado);
    }

    @Override
    public void CambiarDatos(){
        Scanner sc = new Scanner(System.in);
        super.CambiarDatos();
        estado = sc.nextLine();
    }
}

/*Termina con las herencias de Carros*/
