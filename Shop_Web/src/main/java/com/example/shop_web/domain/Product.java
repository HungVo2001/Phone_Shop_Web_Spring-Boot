package com.example.shop_web.domain;

import com.example.shop_web.domain.enumaration.EPriceRange;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    @ManyToOne
    @JoinColumn(name = "branch_id", referencedColumnName = "id", nullable = false)
    private Branch branch;

    @OneToMany(mappedBy = "product")
    private List<Image> images;



    private BigDecimal price;
    private int quantity;
    private String warrantyPeriod;
    private String ram;
    private String size;
    private String color;
    private String camera;
    private String operatingSystem;
    private String pin;
    @Enumerated(value = EnumType.STRING)
    @Column(name="price_range")
    private EPriceRange ePriceRange;

    @Column(name = "deleted", columnDefinition = "TINYINT(1)")
    private Boolean deleted;

    public Product(Long id) {
        this.id = id;
    }

}
