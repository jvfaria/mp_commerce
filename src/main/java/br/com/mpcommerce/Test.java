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
        category1.setName("Eletronicos");
        CategoryBean categoryBean = new CategoryBean();
        categoryBean.setName("Eletronicos");
        CategoryDAO categoryDAO = new CategoryDAO();

        List<Category> categories = categoryDAO.findAll();

        System.out.println("Categories: ");
        for (Category c: categories) {
            System.out.println(c);
        }
    }
}
