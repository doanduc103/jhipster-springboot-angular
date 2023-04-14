package com.mycompany.myapp.service.dto;

import com.mycompany.myapp.domain.AbstractAuditingEntity;
import com.mycompany.myapp.domain.Product;
import com.mycompany.myapp.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.awt.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PostDTO extends AbstractAuditingEntity {

    private String Title_post;

    private String header_post;

    private TextArea body_post;

    private String image;

    private String tags;

    private User user;

}
