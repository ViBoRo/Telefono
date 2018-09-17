package com.example.vicent.telefono;
import java.util.ArrayList;


public class Persona {

    private String nombre;
    private String apellido;
    private ArrayList<Telefono> telefonos = new ArrayList<Telefono>();

    public Persona(String nombre,String apellido){

        this.nombre=nombre;
        this.apellido=apellido;

    }

    public void anyadir( Telefono tel){

    telefonos.add(tel);   //push

    }

    public void mostrarTelefonos(){

        for(int i=0 ; i<telefonos.size(); i++ ){

            System.out.println( telefonos.get(i).getTipo() + ": "+ Integer.toString(telefonos.get(i).getNumero()));

        }

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public ArrayList<Telefono> getTelefonos() {
        return telefonos;
    }
}
