package com.example.shop_web.controller;

import com.example.shop_web.domain.dto.ProductResDTO;
import com.example.shop_web.service.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping()
    public String showProduct(Model model) {
        List<ProductResDTO> products = productService.findAllProductResDTO();
        model.addAttribute("products", products);
        return "admin/createProduct";
    }

}