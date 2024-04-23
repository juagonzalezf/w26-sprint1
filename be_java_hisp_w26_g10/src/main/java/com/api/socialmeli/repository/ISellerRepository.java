package com.api.socialmeli.repository;

import com.api.socialmeli.entity.Seller;

public interface ISellerRepository {
    void save();
    Seller getById(int id);
    Seller update(Seller seller);
    void delete(int id);
}
