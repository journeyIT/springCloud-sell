package cc.ccoder.sell.order.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 订单详情
 *
 * @author www.ccoder.cc
 * @date 2018-11-30 11:47:50
 */
@Data
@Entity
public class OrderDetail {

    @Id
    private String detailId;

    /**
     * 订单id.
     */
    private String orderId;

    /**
     * 商品id.
     */
    private String productId;

    /**
     * 商品名称.
     */
    private String productName;

    /**
     * 商品单价.
     */
    private BigDecimal productPrice;

    /**
     * 商品数量.
     */
    private Integer productQuantity;

    /**
     * 商品小图.
     */
    private String productIcon;

}
