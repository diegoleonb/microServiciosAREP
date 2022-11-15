package edu.escuelaing.arep.model;

public class User {

    private String userName;
    private String passwd;

    /**
     * Constructor de la clase User
     * @param user
     * @param passwd
     */

    public User(String user, String passwd) {
        this.userName = user;
        this.passwd = passwd;
    }


    public String getUser() {
        return this.userName;
    }

    public void setUser(String user) {
        this.userName = user;
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
