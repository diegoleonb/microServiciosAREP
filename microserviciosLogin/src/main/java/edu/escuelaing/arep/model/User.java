package edu.escuelaing.arep.model;

public class User {
    String user;
    String passwd;

    /**
     * Constructor de la clase User
     * @param user
     * @param passwd
     */

    public User(String user, String passwd) {
        this.user = user;
        this.passwd = passwd;
    }


    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPasswd() {
        return this.passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "{" +
            " user='" + getUser() + "'" +
            ", passwd='" + getPasswd() + "'" +
            "}";
    }
}
