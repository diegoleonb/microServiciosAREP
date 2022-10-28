package edu.escuelaing.arep.model;

import java.util.ArrayList;

public class Stream {
    
    ArrayList<Post> posts;

    /**
     * Constructor de la clase Stream que inicializa el Arreglo de Posts
     */
    public Stream(){
        this.posts = new ArrayList<Post>();
    }

    /**
     * Constructor de la clase Stream
     * @param posts
     */

    public Stream(ArrayList<Post> posts) {
        this.posts = posts;
    }


    public ArrayList<Post> getPosts() {
        return this.posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    /**
     * Metodo que agrega un post al Stream
     * @param post
     */
    public void addPost(Post post){
        this.posts.add(post);
    }

}
