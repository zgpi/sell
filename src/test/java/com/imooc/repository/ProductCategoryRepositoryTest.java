package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository respository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = respository.findOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("我我我", 1);
        ProductCategory result = respository.save(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void updateTest(){
        ProductCategory productCategory = respository.findOne(2);
        productCategory.setCategoryName("男生最爱");
        productCategory.setCategoryType(5);
        respository.save(productCategory);
    }

    @Test
    public void findByCategoryTypeIn(){
        List<Integer> categoryTypeList = Arrays.asList(2,3,4);
        List<ProductCategory> productCategoryList = respository.findByCategoryTypeIn(categoryTypeList);
        Assert.assertNotEquals(0,productCategoryList.size());
    }
}