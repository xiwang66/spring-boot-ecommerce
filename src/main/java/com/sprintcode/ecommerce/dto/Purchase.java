package com.sprintcode.ecommerce.dto;

import com.sprintcode.ecommerce.entity.Address;
import com.sprintcode.ecommerce.entity.Customer;
import com.sprintcode.ecommerce.entity.Order;
import com.sprintcode.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
