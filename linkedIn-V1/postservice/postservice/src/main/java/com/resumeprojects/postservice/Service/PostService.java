package com.resumeprojects.postservice.Service;

import com.resumeprojects.postservice.DTO.PostDto;
import com.resumeprojects.postservice.DTO.PostReqDto;
import com.resumeprojects.postservice.Entity.Post;
import com.resumeprojects.postservice.Repository.PostRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private  ModelMapper modelMapper;

    private  PostRepository postRepository;

    public PostService(ModelMapper modelMapper, PostRepository postRepository) {
        this.modelMapper = modelMapper;
        this.postRepository = postRepository;
    }


	public PostDto createPosts(PostReqDto post, Long id) {
		  Post postReqToEntity =  modelMapper.map(post,Post.class);
		  System.out.println(postReqToEntity.toString());

          postReqToEntity.setUserId(id);
		 

	        Post savedPost = postRepository.save(postReqToEntity);

	        return modelMapper.map(savedPost,PostDto.class);
	}
}
