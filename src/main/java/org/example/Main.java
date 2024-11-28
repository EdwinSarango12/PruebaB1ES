package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Transportes transporte = new Transportes("","","","");
        /*Carro*/
        Carro carro = new Carro("","","","","");
        CarroCapacidad ccapacidad = new CarroCapacidad("","","","","",0);
        CarroEstado cestado = new CarroEstado("","","","","",0,"");

        /*Bus*/
        Bus bus = new Bus("","","","",0);
        BusEstado bestado = new BusEstado("","","","",0,"");
        BusCooperativa bcooperativa = new BusCooperativa("","","","",0,"","");

        /*Avion*/
        avion avion= new avion("","","","",0.0);
        AvionCapacidad acapacidad = new AvionCapacidad("","","","",0.0,0);
        AvionCosto acosto = new AvionCosto("","","","",0,0,0);

        int opcion;
        boolean continuar = true;
        while (continuar){
            System.out.println("----------Bienvenido al sistema");
            System.out.println("Ingrese una opción para mostrar datos");
            System.out.println("1. Carro");
            System.out.println("2. Bus");
            System.out.println("3. Avion");
            System.out.println("4. salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese los datos del carro");
                    carro.CambiarDatos();
                    carro.MostrarDatos();
                    break;
                case 2:
                    System.out.println("Ingrese los datos del bus");
                    bus.CambiarDatos();
                    bus.MostrarDatos();
                    break;
                case 3:
                    System.out.println("Ingrese los datos del avion");
                    avion.MostrarDatos();
                    avion.CambiarDatos();
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    try{
                        opcion = sc.nextInt();
                    }catch (NullPointerException e){
                        System.out.println("Ingrese correctamente los datos");
                    } catch (Exception e){
                        System.out.println("Error en el ingreso de datos." + e.getMessage());
                    }finally {
                        continuar = true;
                        System.out.println("Correcto!");
                    }
            }

        }
        
    }
}