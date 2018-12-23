package com.imooc.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    SUCCESS(0, "成功"),
    PARAM_ERROR(10,"参数不正确"),
    PRODUCT_NOT_EXIST(11,"商品不存在"),
    PRODUCT_STOCK_ERROR(12,"库存不足"),
    ORDER_NOT_EXIST(13,"订单不存在"),
    ORDERDETAIL_NOT_EXIST(14,"订单详情不存在"),
    ORDER_STATUS_ERROR(15,"订单状态不正确"),
    ORDER_UPDATE_FAIL(16,"订单更新失败"),
    ORDER_DETAIL_EMPTY(17,"订单详情为空"),
    ORDER_PAY_STATUS_ERROR(18,"订单支付状态不正确"),
    CART_EMPTY(19,"购物车为空"),
    ORDER_OWNER_ERROR(20,"该订单不属于当前用户"),
    WECHAT_MP_ERROR(21, "微信公众账号错误"),
    ORDER_CANCEL_SUCCESS(22, "订单取消成功"),
    ORDER_FINISH_SUCCESS(23, "订单完结成功"),
    PRODUCT_STATUS_ERROR(24, "商品状态不正确"),
    PRODUCT_ONSALE_ESUCCESS(25, "商品上架成功"),
    ;

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }
}
