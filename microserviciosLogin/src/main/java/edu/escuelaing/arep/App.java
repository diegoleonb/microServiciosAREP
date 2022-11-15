package edu.escuelaing.arep;

import static spark.Spark.*;

import com.google.gson.Gson;

import edu.escuelaing.arep.model.*;

import java.util.concurrent.atomic.AtomicReference;


public class App 
{
    public static void main( String[] args ){

        AtomicReference<String> usuario = new AtomicReference<String>();

        UserAuthentificate userAuthentificate = new UserAuthentificate();

        inicializarUsuarios(userAuthentificate);

        port(getPort());

        staticFiles.location("/public");

        get("/login", (req, res) -> {
            res.redirect("login.html");
            res.status(200);
            return null;
        });

        get("/login/:user/:passwd", (req, res) -> {
            String user = req.params(":user");
            String passwd = req.params(":passwd");
            System.out.println("user: " + user + " passwd: " + passwd);
            boolean exists = userAuthentificate.existsUser(user, passwd);
            if (exists) {
                res.status(200);
                usuario.set(user);
            } else {
                res.status(401);
            }
            return new Gson().toJson(exists);
        });

    
    }

    /**
     * Metodo que inicializa el arreglo de usuarios
     */
    public static void inicializarUsuarios(UserAuthentificate userAuthentificate) {
        userAuthentificate.addUser(new User("Diego", "diego123"));
        userAuthentificate.addUser(new User("Alejandro", "alejo123"));
        userAuthentificate.addUser(new User("Sebastian", "sebastian123"));
        userAuthentificate.addUser(new User("Leon", "leon123"));
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
