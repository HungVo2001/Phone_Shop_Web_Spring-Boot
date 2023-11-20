package com.example.shop_web.repository;


import com.example.shop_web.domain.Cart;
import com.example.shop_web.domain.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

}