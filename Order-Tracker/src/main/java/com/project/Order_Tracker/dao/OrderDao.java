package com.project.Order_Tracker.dao;

import com.project.Order_Tracker.entity.OrderResponseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends JpaRepository<OrderResponseEntity, Long> {

    OrderResponseEntity findByConsignment_idAndInvoice(int cid, String invoice);

}
