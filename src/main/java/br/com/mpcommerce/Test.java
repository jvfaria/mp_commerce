package br.com.mpcommerce;

import br.com.mpcommerce.beans.CategoryBean;
import br.com.mpcommerce.dao.CategoryDAO;
import br.com.mpcommerce.models.Category;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) throws Exception {
        Category category1 = new Category();
        category1.setName("Eletrodomésticos");
        CategoryDAO categoryDAO = new CategoryDAO();

        categoryDAO.save(category1);


    }
}
