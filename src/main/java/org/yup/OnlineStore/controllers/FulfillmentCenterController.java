package org.yup.OnlineStore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.yup.OnlineStore.models.FulfillmentCenter;
import org.yup.OnlineStore.services.FulfillmentCenterService;

import java.util.List;

public class FulfillmentCenterController {

    private FulfillmentCenterService fulfillmentCenterService;

    @Autowired
    public FulfillmentCenterController(FulfillmentCenterService fulfillmentCenterService){
        this.fulfillmentCenterService = fulfillmentCenterService;
    }

    @GetMapping("api/fulfillmentCenter")
    public List<FulfillmentCenter> getAllFulfillmentCenters(){
        return this.fulfillmentCenterService.getAllFulfillmentCenters();
    }

    public List<FulfillmentCenter> getFulfillmentCenterByCountry(String country){
        return this.fulfillmentCenterService.getFulfillmentCenterByCountry(country);
    }

    @PostMapping("api/fulfillmentCenter")
    @ResponseStatus(value = HttpStatus.CREATED)
    public FulfillmentCenter createFulfillmentCenter(@RequestBody FulfillmentCenter fulfillmentCenter){
        return this.fulfillmentCenterService.createFulfillmentCenter(fulfillmentCenter);
    }

    @GetMapping("api/fulfillmentCenter/{id}")
    public FulfillmentCenter getFulfillmentCenterById(@PathVariable Long id){
        return this.fulfillmentCenterService.getFulfillmentCenterById(id);
    }


    @DeleteMapping("api/fulfillmentCenter/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteFulfillmentCenter(@PathVariable Long id){
        this.fulfillmentCenterService.deleteFulfillmentCenter(id);
    }

    @PutMapping("api/product/{id}")
    public FulfillmentCenter updateFulfillmentCenter(@RequestBody FulfillmentCenter fulfillmentCenter, @PathVariable Long id){
        return this.fulfillmentCenterService.updateFulfillmentCenter(fulfillmentCenter, id);
    }
}
