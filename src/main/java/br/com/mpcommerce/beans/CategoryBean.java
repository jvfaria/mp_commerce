package br.com.mpcommerce.beans;

import br.com.mpcommerce.dao.CategoryDAO;
import br.com.mpcommerce.models.Category;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

@ManagedBean
@Getter @Setter
@RequestScoped
public class CategoryBean implements Serializable {
    private List<Category> categories;
    private Long categories_quantity;
    private Long id;
    private String name;



    @PostConstruct
    public void init() {
        try{
            this.categories = new CategoryDAO().findAll();
            this.categories_quantity = (long) this.categories.size();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
