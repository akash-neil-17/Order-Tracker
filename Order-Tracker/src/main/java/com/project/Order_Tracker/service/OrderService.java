package com.project.Order_Tracker.service;

import com.project.Order_Tracker.model.OrderRequestModel;
import com.project.Order_Tracker.model.OrderResponseModel;

import java.util.List;

public interface OrderService {

    public OrderResponseModel placeOrder(OrderRequestModel orderRequestModel);

    List<OrderResponseModel> checkAllOrders();

    OrderResponseModel updateDeliveryStatus();

}
