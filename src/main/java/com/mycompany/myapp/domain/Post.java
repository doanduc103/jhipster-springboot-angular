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
@Getter
@Setter
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
}
