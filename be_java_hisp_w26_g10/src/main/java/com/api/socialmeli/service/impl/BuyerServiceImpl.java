package com.api.socialmeli.service.impl;

import com.api.socialmeli.entity.Buyer;
import com.api.socialmeli.entity.Seller;
import com.api.socialmeli.exception.NotFoundException;
import com.api.socialmeli.repository.IBuyerRepository;
import com.api.socialmeli.repository.ISellerRepository;
import com.api.socialmeli.service.IBuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuyerServiceImpl implements IBuyerService {
    @Autowired
    IBuyerRepository buyerRepository;

    @Override
    public void unfollowUser(int followerId, int toUnfollowId) {
        Buyer buyer = buyerRepository.getById(followerId);
        Optional<Seller> seller = buyer.getFollowed().stream().filter(e->e.getUser_id()==toUnfollowId).findFirst();

        if(buyer == null){
            throw new NotFoundException("No se encuentra el comprador con el id ingresado");
        }
        if(seller.isEmpty()){
            throw new NotFoundException("No sigues al vendedor");
        }


        buyerRepository.getById(followerId).getFollowed().removeIf(e->e.getUser_id() == toUnfollowId);
    }
}
