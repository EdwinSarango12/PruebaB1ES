package org.example;

import java.util.Scanner;

public class avion extends Transportes{
    private double TiempoLlegada;

    public avion(String tipo, String marca, String modelo, String color, double tiempoLlegada) {
        super(tipo, marca, modelo, color);
        TiempoLlegada = tiempoLlegada;
    }
    public double getTiempoLlegada() {
        return TiempoLlegada;
    }

    @Override
    public void MostrarDatos(){
        super.MostrarDatos();
        System.out.println("\tEstimación del tiempo de llegada del avión: \n");
        System.out.println("Tiempo Llegada: " + TiempoLlegada);
    }
    @Override
    public void CambiarDatos(){
        Scanner sc = new Scanner(System.in);
        super.CambiarDatos();
        TiempoLlegada = sc.nextInt();
    }

}
