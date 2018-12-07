package com.imooc.service.impl;

import com.imooc.dataobject.ProductCategory;
import com.imooc.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findOne(){
        ProductCategory productCategory = categoryService.findOne(1);
        System.out.println(productCategory.toString());
    }
}