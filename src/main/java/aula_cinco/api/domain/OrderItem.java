package aula_cinco.api.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_order_item")
public class OrderItem {
    @EmbeddedId
    private OrderItemPK id = new OrderItemPK();
    private Integer quantity;
    private Double price;
}