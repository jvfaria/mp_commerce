package br.com.mpcommerce.beans;


import br.com.mpcommerce.models.Category;
import br.com.mpcommerce.models.Image;
import br.com.mpcommerce.models.Product;
import lombok.Getter;
import lombok.Setter;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@Getter @Setter
public class ProductBean implements Serializable {
    private List<Product> products;
    private String name;
    private Integer stock_balance;
    private Image image_id;
    private Category category_id;
    private Double price;

}
