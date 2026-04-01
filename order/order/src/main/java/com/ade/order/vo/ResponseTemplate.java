package com.ade.order.vo;

import com.ade.order.model.Order;
import lombok.Data;
@Data
public class ResponseTemplate {
    Order order;
    Produk produk;
}
