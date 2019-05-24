package zut.cs.network.dao;

import org.junit.Test;
import zut.cs.network.bean.Product;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class ProductDaoTest {

    @Test
    public void addProduct() {
        Product product =new Product();
        product.setId("12456");
        product.setName("小米8");
        product.setCategory("手机");
        product.setPnum(12);
        ProductDao productDao =new ProductDao();
        try {
            productDao.addProduct(product);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void listAll() {
    }

    @Test
    public void findAllCount() {
    }

    @Test
    public void findByPage() {
    }

    @Test
    public void findProductById() {
    }

    @Test
    public void changeProductNum() {
    }

    @Test
    public void salesList() {
    }

    @Test
    public void findProductByManyCondition() {
    }

    @Test
    public void editProduct() {
    }

    @Test
    public void updateProductNum() {
    }

    @Test
    public void getWeekHotProduct() {
    }

    @Test
    public void findBookByName() {
    }

    @Test
    public void findBookByNameAllCount() {
    }

    @Test
    public void deleteProduct() {
    }
}