package com.api.socialmeli.repository.impl;

import com.api.socialmeli.entity.Buyer;
import com.api.socialmeli.entity.Seller;
import com.api.socialmeli.repository.IBuyerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BuyerRepositoryImpl implements IBuyerRepository {

    List<Buyer> buyers ;

    public BuyerRepositoryImpl(){
        loadUsers();
    }

    private void loadUsers() {
        buyers = new ArrayList<>();
        Seller seller_one = new Seller(1,"Hector Salamanca",new ArrayList<>());
        Seller seller_two = new Seller(2,"Carl Johnson", new ArrayList<>());
        Seller seller_three = new Seller(3,"Ayrton Senna",new ArrayList<>());

        Buyer buyer_one = new Buyer(1,"Juanito Cliente",new ArrayList<>());
        buyer_one.getFollowed().add(seller_one);
        buyer_one.getFollowed().add(seller_three);

        Buyer buyer_two = new Buyer(2,"Adriana Cliente",new ArrayList<>());
        buyer_two.getFollowed().add(seller_two);
        buyer_two.getFollowed().add(seller_three);

        buyers.add(buyer_one);
        buyers.add(buyer_two);
    }

    @Override
    public Buyer save() {
        return null;
    }

    @Override
    public Buyer getById(int id) {
        return buyers.stream().filter(e -> e.getUser_id()==id).findFirst().orElse(null);
    }

    @Override
    public Buyer update(Buyer buyer) {
        return null;
    }

    @Override
    public void delete(int id) {}
}
