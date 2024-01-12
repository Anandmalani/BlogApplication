package com.example.BlogApp.service;

import java.util.List;

import com.example.BlogApp.dto.PostsDto;
import com.example.BlogApp.entity.Posts;
import com.example.BlogApp.entity.Userr;

public interface PostsService {
	PostsDto createPosts(PostsDto postsDto);
	PostsDto updatePosts(PostsDto postsDto, int id);
	PostsDto getPosts(int id);
	void deletePosts(int id);
//	List<Posts> getAllPostsForUser(Userr user);

}
