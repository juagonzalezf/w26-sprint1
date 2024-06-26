package com.api.socialmeli.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seller {
    private int user_id;
    private String user_name;
    private List<Buyer> followers;
}
