package com.example.vicent.telefono;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] main) {
        ArrayList<Persona> personas = new ArrayList<Persona>();

        Persona yo = new Persona("Andres", "Tomas");
        personas.add(yo);

        yo.anyadir(new Telefono("Movil", 625969943));
        yo.anyadir(new Telefono("Trabajo", 963782039));

        //busca una persona dado el nombre

        Persona p = buscar(personas, "Andres");

        p.mostrarTelefonos();
    }

    public static Persona buscar(ArrayList<Persona> personas, String nombre){

        for (int i = 0; i < personas.size(); i++){

            if(personas.get(i).getNombre().equals(nombre)){

                return personas.get(i);

            } //if
        } //for
        return null;
    } //fun

} // main
