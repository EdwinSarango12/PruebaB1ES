package org.example;

import java.util.Scanner;

public class Transportes {
    private String tipo;
    private String marca;
    private String modelo;
    private String color;

    public Transportes() {
    }

    public Transportes(String tipo, String marca, String modelo, String color) {
    this.tipo = tipo;
    this.marca = marca;
    this.modelo = modelo;
    this.color = color;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }

    public void MostrarDatos() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
    }

    public void CambiarDatos(){
        Scanner sc = new Scanner(System.in);
        this.tipo = sc.nextLine();
        this.marca = sc.nextLine();
        this.modelo = sc.nextLine();
        this.color = sc.nextLine();
    }

}
