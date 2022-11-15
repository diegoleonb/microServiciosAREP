package edu.escuelaing.arep.model;

import java.util.ArrayList;
import java.util.List;

public class UserAuthentificate {
    
    List<User> users;


    /**
     * Constructor de la clase UserAuthentificate
     */
    public UserAuthentificate() {
        users = new ArrayList<User>();
    }

    /**
     * Constructor de la clase UserAuthentificate
     * @param users
     */

    public UserAuthentificate(List<User> users) {
        this.users = users;
    }
    

    public List<User> getUsers() {
        return this.users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    /**
     * Metodo que agrega un usuario a la lista de usuarios
     * @param user
     */
    public void addUser(User user){
        this.users.add(user);
    }

    /**
     * Metodo que verifica si el usuario y la contraseña son correctos(existen)
     * @param userName
     * @param userPasswd
     * @return
     */
    public boolean existsUser(String userName, String userPasswd) {
        boolean exists= false;
        for (User user: users) {
            if (user.getUser().equals(userName) && user.getPasswd().equals(userPasswd)) {
                exists = true;
            }
        }
        return exists;
    }

    @Override
    public String toString() {
        return "{" +
            " users='" + getUsers() + "'" +
            "}";
    }

}
