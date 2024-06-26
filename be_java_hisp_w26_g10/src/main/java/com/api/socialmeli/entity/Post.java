package com.api.socialmeli.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    private int post_id;
    private LocalDate date;
    private int category;
    private double price;
    private int user_id;
    private Product product;
    private boolean has_promo;
    private double discount;

}
