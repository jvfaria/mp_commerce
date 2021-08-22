package br.com.mpcommerce.models;

import javax.persistence.*;

@Entity
@Table(name = "sales_products")
public class SaleProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product_id;

    @ManyToOne
    @JoinColumn(name = "sale_id")
    private Sale sale_id;

    @Column
    private Integer quantity;

    @Column
    private Double total_price;




}
