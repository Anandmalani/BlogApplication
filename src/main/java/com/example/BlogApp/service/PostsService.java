package com.example.BlogApp.service;

import com.example.BlogApp.dto.PostsDto;

public interface PostsService {
	PostsDto createPosts(PostsDto postsDto);
	PostsDto updatePosts(PostsDto postsDto, int id);
	PostsDto getPosts(int id);
	void deletePosts(int id);

}
