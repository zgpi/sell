package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.junit.Assert;
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
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    @Test
    public void findByBuyerOpenid(){
        PageRequest request = new PageRequest(0,2);
        Page<OrderMaster> orderMasterPage = repository.findByBuyerOpenid("ewr", request);
        System.out.println(orderMasterPage.getTotalElements());
    }

    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("124");
        orderMaster.setBuyerName("zgpi");
        orderMaster.setBuyerPhone("21421");
        orderMaster.setBuyerAddress("深圳市");
        orderMaster.setBuyerOpenid("ewbfgrwbgri");
        orderMaster.setOrderAmount(new BigDecimal(4314.4));
        OrderMaster result = repository.save(orderMaster);
        Assert.assertNotNull(result);

    }
}