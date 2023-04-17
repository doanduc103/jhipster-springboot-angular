package com.mycompany.myapp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.awt.*;

@Table(name = "Post")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Post extends AbstractAuditingEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Title_post")
    private String Title_post;

    @Column(name = "header_post")
    private String header_post;

    @Column(name = "body_post")
    private TextArea body_post;

    @Column(name = "imagge")
    private String image;

    @Column(name = "tags")
    private String tags;

    @ManyToOne
    @JoinColumn(name = "user_post")
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle_post() {
        return Title_post;
    }

    public void setTitle_post(String title_post) {
        Title_post = title_post;
    }

    public String getHeader_post() {
        return header_post;
    }

    public void setHeader_post(String header_post) {
        this.header_post = header_post;
    }

    public TextArea getBody_post() {
        return body_post;
    }

    public void setBody_post(TextArea body_post) {
        this.body_post = body_post;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
