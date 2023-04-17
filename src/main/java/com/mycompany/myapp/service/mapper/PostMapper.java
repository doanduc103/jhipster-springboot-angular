package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.CategoryProduct;
import com.mycompany.myapp.domain.Post;
import com.mycompany.myapp.service.dto.CategoryDTO;
import com.mycompany.myapp.service.dto.PostDTO;

public class PostMapper {

    public PostDTO PostToPostDTO(Post post){
        PostDTO postDTO = new PostDTO();
        postDTO.setTitle_post(post.getTitle_post());
        postDTO.setHeader_post(post.getHeader_post());
        postDTO.setBody_post(post.getBody_post());
        postDTO.setTags(post.getTags());
        postDTO.setImage(post.getImage());
        postDTO.setUser(post.getUser());
        return postDTO;
    }

    public Post PostDTOToPost(PostDTO postDTO){
        Post post  = new Post();
        post.setTitle_post(postDTO.getTitle_post());
        post.setHeader_post(postDTO.getHeader_post());
        post.setBody_post(postDTO.getBody_post());
        post.setTags(postDTO.getTags());
        post.setImage(postDTO.getImage());
        post.setUser(postDTO.getUser());
        return post;
    }
}
