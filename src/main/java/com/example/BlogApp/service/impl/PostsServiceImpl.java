package com.example.BlogApp.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BlogApp.dto.PostsDto;
import com.example.BlogApp.entity.Posts;
import com.example.BlogApp.exception.ResourceNotFoundException;
import com.example.BlogApp.repository.PostsRepository;
import com.example.BlogApp.service.PostsService;

@Service
public class PostsServiceImpl implements PostsService {
	private PostsRepository postsRepository;
	private ModelMapper modelMapper;
	
    @Autowired
    public PostsServiceImpl(PostsRepository postsRepository, ModelMapper modelMapper) {
		super();
		this.postsRepository = postsRepository;
		this.modelMapper = modelMapper;
	}
    
	

	public void setPostsRepository(PostsRepository postsRepository) {
		this.postsRepository = postsRepository;
	}
	
	public Posts dtoToPosts(PostsDto postsDto) {
		return modelMapper.map(postsDto, Posts.class);
		
	}
	public PostsDto postsToDto(Posts posts) {
		return modelMapper.map(posts, PostsDto.class);
		
	}

	@Override
	public PostsDto createPosts(PostsDto postsDto) {
		// TODO Auto-generated method stub
		Posts posts=dtoToPosts(postsDto);
		Posts updatedPosts=postsRepository.save(posts);
		return postsToDto(updatedPosts);
		
	}

	@Override
	public PostsDto updatePosts(PostsDto postsDto, int id) {
		// TODO Auto-generated method stub
		Posts posts=postsRepository.findById(id)
		.orElseThrow(()->new ResourceNotFoundException("Posts","id",id));
		
		
		Posts posts1=modelMapper.map(postsDto,Posts.class);
		posts1.setPostId(posts.getPostId());
		postsRepository.save(posts1);
		
		PostsDto postDto=postsToDto(posts1);
		
		return postDto;
	}

	@Override
	public PostsDto getPosts(int id) {
		// TODO Auto-generated method stub
		Posts posts=postsRepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Posts","id",id));
		PostsDto postDto=postsToDto(posts);
				
		return postDto;
		
		
	}

	@Override
	public void deletePosts(int id) {
		// TODO Auto-generated method stub
		Posts posts=postsRepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Posts","id",id));
		postsRepository.deleteById(id);
		
		
	}

}
