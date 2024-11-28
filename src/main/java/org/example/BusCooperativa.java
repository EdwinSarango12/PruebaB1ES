package org.example;

import java.util.Scanner;

public class BusCooperativa extends BusEstado{
    private String cooperativa;

    public BusCooperativa(String tipo, String marca, String modelo, String color, int capacidad,String estado ,String cooperativa) {
        super(tipo, marca, modelo, color, capacidad, estado);
        this.cooperativa = cooperativa;
    }
    public String getCooperativa() {
        return cooperativa;
    }

    @Override
    public void MostrarDatos(){
        super.MostrarDatos();
        System.out.println("\tMostrar datos de la cooperativa del bus: \n");
        System.out.println("Cooperativa: " + cooperativa);
    }


    @Override
    public void CambiarDatos(){
        Scanner sc = new Scanner(System.in);
        super.CambiarDatos();
        cooperativa = sc.nextLine();
    }
}


/*Termina con las herencias de buses*/