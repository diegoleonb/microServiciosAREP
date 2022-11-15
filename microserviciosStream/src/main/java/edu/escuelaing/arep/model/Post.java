package edu.escuelaing.arep.model;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicReference;

public class Post {

    LocalDate fecha;
    String contenido;
    AtomicReference<String> author;

    /**
     * Constructor de la clase Post
     * @param fecha
     * @param contenido
     * @param author
     */
    public Post(String contenido, String author) {
        this.fecha = LocalDate.now();
        this.contenido = contenido;
        this.author = new AtomicReference<String>(author);
    }


    public LocalDate getFecha() {
        return this.fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getContenido() {
        return this.contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public AtomicReference<String> getAuthor() {
        return this.author;
    }

    public void setAuthor(AtomicReference<String> author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "{" +
            " fecha='" + getFecha() + "'" +
            ", contenido='" + getContenido() + "'" +
            ", author='" + getAuthor() + "'" +
            "}";
    }
}
