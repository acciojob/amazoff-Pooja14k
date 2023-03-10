package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class AmazonService {
    @Autowired
    DeliveryPartnerRepository ORepository;

    public void addOrder(Order order){
        ORepository.addOrder(order);
    }

    public void addPartner(String id){
        ORepository.addPartner(id);
    }

    public void addOrderPartnerPair(String oid,String pid){
        ORepository.addOrderPartnerPair(oid,pid);
    }

    public Order getOrderById(String id){
        return ORepository.getOrderById(id);
    }

    public DeliveryPartner getPartnerById(String id){
        return ORepository.getPartnerById(id);
    }

    public int getOrderCountByPartnerId(String id){
        return ORepository.getOrderCountByPartnerId(id);
    }

    public List<String> getOrdersByPartnerId(String id){
        return ORepository.getOrdersByPartnerId(id);
    }

    public List<String> getAllOrders(){
        return ORepository.getAllOrders();
    }

    public int getCountOfUnassignedOrders(){
        return ORepository.getCountOfUnassignedOrders();
    }

    public int getOrdersLeftAfterGivenTimeByPartnerId(String time,String id){
        return ORepository.getOrdersLeftAfterGivenTimeByPartnerId(time,id);
    }

    public String getLastDeliveryTimeByPartnerId(String id){
        return ORepository.getLastDeliveryTimeByPartnerId(id);
    }

    public void deletePartnerById(String id){
        ORepository.deletePartnerById(id);
    }

    public void deleteOrderById(String id){
        ORepository.deleteOrderById(id);
    }
}
