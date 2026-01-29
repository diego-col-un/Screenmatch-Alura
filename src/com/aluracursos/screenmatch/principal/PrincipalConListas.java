
package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.*;


public class PrincipalConListas {
    public static void main(String[] args) {
        
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.evalua(9);
        Pelicula otraPeliculaAvatar = new Pelicula("Avatar", 2023);
        otraPeliculaAvatar.evalua(6);
        Serie casaDragon = new Serie("la casa del dragon", 2022);
        
        List<Titulo> lista = new LinkedList<>();
        lista.add(miPelicula);
        lista.add(otraPeliculaAvatar);
        lista.add(otraPelicula);
        lista.add(casaDragon);
        
        for (Titulo item: lista) {
            System.out.println(item);
            
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2){
                System.out.println(pelicula.getClasificacion());
            }
            
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darín");
        System.out.println("Lista de Artistas no ordenada: " + listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de Artistas ordenada: " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("lista de titulos ordenada por fechas: " + lista);
    }
}
