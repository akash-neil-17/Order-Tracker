package com.project.Order_Tracker.service;

import com.project.Order_Tracker.model.CheckBalanceModel;
import com.project.Order_Tracker.model.CheckStatusModel;

public interface QueryService {

    CheckBalanceModel checkBalance();

    CheckStatusModel checkStatusByConsignmentId(int id);

    CheckStatusModel checkDeliveryStatus(String id);

}
