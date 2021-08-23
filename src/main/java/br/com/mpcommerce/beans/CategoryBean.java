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
import java.util.List;

@ManagedBean
@Getter @Setter
@ViewScoped
public class CategoryBean implements Serializable {
    private List<Category> categories;
    private Long id;
    private String name;


//
//    @PostConstruct
//    public void init() {
//        try{
//            this.categories = new CategoryDAO().findAll();
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
}
