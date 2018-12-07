package com.imooc.service.impl;

import com.imooc.dataobject.ProductInfo;
import com.imooc.enums.ProductStatusEnum;
import com.imooc.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {

    @Autowired
    private ProductService productInfoService;

    @Test
    public void findOne() {
        ProductInfo productInfo = productInfoService.findOne("1");
        System.out.println(productInfo.toString());
    }

    @Test
    public void findUpAll() {
    }

    @Test
    public void findAll() {
        PageRequest pageRequest = new PageRequest(0,2);
        Page<ProductInfo> productInfoPage = productInfoService.findAll(pageRequest);
        System.out.println(productInfoPage.getTotalElements());
    }

    @Test
    public void findByProductStatus() {
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1");
        productInfo.setProductName("蛋炒饭");
        productInfo.setProductPrice(new BigDecimal("23.4"));
        productInfo.setCategoryType(1);
        productInfo.setProductStock(12);
        productInfo.setProductStatus(ProductStatusEnum.UP.getCode());
        productInfoService.save(productInfo);
    }
}