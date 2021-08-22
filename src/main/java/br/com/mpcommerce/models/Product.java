package br.com.mpcommerce.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Getter @Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private Integer stock_balance;

    @Column
    private String image_id;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category_id;

    @Column
    private Double price;
}
