package com.string;

import java.util.ArrayList;

public class StringHandler {
    public static void main(String[] args) {
        String libro = "Harry Potter y el Caliz de Fuego, 324583025, J.K. Rowling, 2004";

        String[] datos = libro.split(",");

        System.out.println("Numero de datos: " + datos.length);
        Libro l1 = new Libro(Integer.valueOf(datos[3].trim()), datos[1].trim().toUpperCase(), datos[2].trim().toUpperCase(), datos[0].trim().toUpperCase());

        System.out.println(l1.toString());

        //Arreglo de string

        ArrayList<String>librosStr = new ArrayList();

        librosStr.add("Harry Potter y la piedra filosofal, 54986576, J.K. Rowling, 1997");
        librosStr.add("Harry Potter y la  camara de los secretos, 93493893, J.K. Rowling, 1998");
        librosStr.add("Harry Potter y el Prisionero de Azkaban, 324583025, J.K. Rowling, 1999");
        librosStr.add("Harry Potter y el Caliz de Fuego, 65367832, J.K. Rowling, 2000");
        librosStr.add("Harry Potter y la orden del Fenix, 94534967, J.K. Rowling, 2001");

        ArrayList<Libro>libros = new ArrayList();

        for(String l : librosStr){
            String[] datos1 = l.split(",");
            libros.add(new Libro(Integer.valueOf(datos1[3].trim()), datos1[1].trim().toUpperCase(), datos1[2].trim().toUpperCase(), datos1[0].trim().toUpperCase()));

        }

        System.out.println("Total libros agragados " + libros.size());

        //System.out.println(libros.get(0).toString());

        for(int i = 0; i < libros.size(); i++){
            System.out.println(libros.get(i).toString());
        }

    }
}
