package org.yup.OnlineStore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yup.OnlineStore.dao.FulfillmentCenterDAO;
import org.yup.OnlineStore.models.FulfillmentCenter;

import java.util.List;

@Service
public class FulfillmentCenterService {

    private FulfillmentCenterDAO fulfillmentCenterDAO;

    @Autowired

    public FulfillmentCenterService(FulfillmentCenterDAO fulfillmentCenterDAO) {
        this.fulfillmentCenterDAO = fulfillmentCenterDAO;
    }

    public List<FulfillmentCenter> getAllFulfillmentCenters(){
        return this.fulfillmentCenterDAO.findAll();
    }

    public FulfillmentCenter getFulfillmentCenterById(Long Id){
        return this.fulfillmentCenterDAO.findById(Id).orElse(new FulfillmentCenter());
    }

    public List<FulfillmentCenter> getFulfillmentCenterByCountry(String country){
        return this.fulfillmentCenterDAO.getFulfillmentCenterByCountry(country);
    }
    public FulfillmentCenter createFulfillmentCenter(FulfillmentCenter fulfillmentCenter){
        return this.fulfillmentCenterDAO.save(fulfillmentCenter);
    }

    public FulfillmentCenter updateFulfillmentCenter(FulfillmentCenter fulfillmentCenter, Long Id){
        FulfillmentCenter fulfillmentCenter1 = this.fulfillmentCenterDAO.findById(Id).orElse(null);

        if(fulfillmentCenter1 == null){
            return new FulfillmentCenter();
        }

        fulfillmentCenter1.setAddress(fulfillmentCenter.getAddress());
        fulfillmentCenter1.setCountry(fulfillmentCenter.getCountry());
        fulfillmentCenter1.setWarehouseManager(fulfillmentCenter.getWarehouseManager());
        fulfillmentCenter1.setPhoneNumber(fulfillmentCenter.getPhoneNumber());

        return this.fulfillmentCenterDAO.save(fulfillmentCenter1);

    }

    public void deleteFulfillmentCenter(Long id){
        this.fulfillmentCenterDAO.deleteById(id);
    }
}
