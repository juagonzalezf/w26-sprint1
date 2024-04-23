package com.api.socialmeli.repository;

import com.api.socialmeli.entity.Post;

public interface IPostRepository {
    Post save();
    Post getById(int id);
    Post update(Post post);
    void delete(int id);
}
