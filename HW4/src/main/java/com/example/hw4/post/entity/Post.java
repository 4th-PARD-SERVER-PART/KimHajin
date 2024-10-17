package com.example.hw4.post.entity;

import com.example.hw4.like.entity.Like;
import com.example.hw4.user.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "post")
    private List<Like> likes;

    public static Post form(String title, String content, User user){
        return new Post(null, title, content, user, null);
    }

    public void setPost(String title, String content){
        this.title = title;
        this.content = content;
    }
}
