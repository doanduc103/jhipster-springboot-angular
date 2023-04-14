package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.Post;
import com.mycompany.myapp.repository.PostRepository;
import com.mycompany.myapp.service.dto.PostDTO;
import com.mycompany.myapp.service.mapper.PostMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PostService {

    PostRepository PostRepository;

    PostMapper PostMapper;

    private final Logger log = LoggerFactory.getLogger(PostService.class);

    public List<Post> GetAllCatory() {
        return PostRepository.findAll();
    }

    public Post CreateNewPost(PostDTO PostDTO) {
        Post Post = new Post();
        Post = PostMapper.PostDTOToPost(PostDTO);
        PostRepository.save(Post);
        return Post;
    }

    public Optional<Post> EditPost(Long id, PostDTO PostDTO) {
        return Optional.of(PostRepository.findById(id)).filter(Optional::isPresent)
            .map(Optional::get).map(Post -> {
                Post = PostMapper.PostDTOToPost(PostDTO);
                return Post;
            });
    }

    public void DeletePost(Long id, Post Post){
        PostRepository.delete(Post);
    }
}
