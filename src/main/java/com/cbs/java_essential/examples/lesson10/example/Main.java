package com.cbs.java_essential.examples.lesson10.example;

import com.cbs.java_essential.examples.lesson10.example.dto.Comment;
import com.cbs.java_essential.examples.lesson10.example.dto.CommentResponse;
import com.cbs.java_essential.examples.lesson10.example.dto.Post;
import com.cbs.java_essential.examples.lesson10.example.dto.PostResponse;
import com.cbs.java_essential.examples.lesson10.example.util.ObjectBuilder;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            String commentData = getData("https://gorest.co.in/public-api/comments");

            System.out.println("--------------COMMENTS--------------------");
            List<Comment> comments = ObjectBuilder.build(commentData, CommentResponse.class);
            for (Comment comment : comments) {
                System.out.println(comment);
            }
            System.out.println("--------------POSTS--------------------");

            String postData = getData("https://gorest.co.in/public-api/posts");
            List<Post> posts = ObjectBuilder.build(postData, PostResponse.class);
            for (Post post : posts) {
                System.out.println(post);
            }
        } catch (IOException e) {
            log.error(e);
        }
    }

    public static String getData(String resourceUrl) throws IOException {
        URL url = new URL(resourceUrl);
        InputStream inputStream = url.openConnection().getInputStream();
        return new String(inputStream.readAllBytes());
    }
}
