package edu.escuelaing.arep;

import static spark.Spark.*;
import com.google.gson.Gson;

import edu.escuelaing.arep.model.*;

public class App 
{
    public static void main( String[] args ){

        Stream stream = new Stream();

        port(getPort());

        get("/stream", (req, res) -> {
            res.status(200);
            res.type("application/json");
            return new Gson().toJson(stream.getPosts());
        });

    }

    /**
     * Metodo que retorna el puerto en el que se va a ejecutar el servidor
     * @return
     */

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set(i.e. on localhost)
    }
}
