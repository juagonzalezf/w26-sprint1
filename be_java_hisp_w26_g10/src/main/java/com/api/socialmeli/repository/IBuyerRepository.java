package com.api.socialmeli.repository;

import com.api.socialmeli.entity.Buyer;

public interface IBuyerRepository {
    Buyer save();
    Buyer getById(int id);
    Buyer update(Buyer buyer);
    void delete(int id);
}
