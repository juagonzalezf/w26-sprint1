package com.api.socialmeli.service;

import com.api.socialmeli.repository.ISellerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface IBuyerService {
    void unfollowUser(int followerId, int toUnfollowId);
}
