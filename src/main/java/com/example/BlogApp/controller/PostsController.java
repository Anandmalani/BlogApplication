package com.example.BlogApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BlogApp.dto.PostsDto;
import com.example.BlogApp.service.PostsService;

@RestController
@RequestMapping("/posts")
public class PostsController {
	private PostsService postsService;
    @Autowired
	public PostsController(PostsService postsService) {
		super();
		this.postsService = postsService;
	}
    @PostMapping
    public ResponseEntity<PostsDto> createPosts(@RequestBody PostsDto postsDto) {
    	PostsDto postsDto1=postsService.createPosts(postsDto);
    	return new ResponseEntity<>(postsDto1,HttpStatus.OK);
    	
    	
    }
    @GetMapping("/{id}")
    public ResponseEntity<PostsDto> getPosts(@PathVariable Integer id) {
    	PostsDto postsDto1=postsService.getPosts(id);
    	return new ResponseEntity<>(postsDto1,HttpStatus.OK);
    	
    	
    }
    @PutMapping("/{id}")
    public ResponseEntity<PostsDto> updatePosts(@RequestBody PostsDto postsDto,@PathVariable int id) {
    	PostsDto postsDto1=postsService.updatePosts(postsDto, id);
    	return new ResponseEntity<>(postsDto1,HttpStatus.OK);
    	
    	
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePosts( @PathVariable int id) {
    	postsService.deletePosts( id);
    	return new ResponseEntity<>("Posts Deleted Successfully",HttpStatus.OK);
    	
    	
    }
	

}
