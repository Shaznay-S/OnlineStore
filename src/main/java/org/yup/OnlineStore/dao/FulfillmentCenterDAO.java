package org.yup.OnlineStore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yup.OnlineStore.models.FulfillmentCenter;

import java.util.List;

public interface FulfillmentCenterDAO extends JpaRepository<FulfillmentCenter, Long> {

    public List<FulfillmentCenter> getFulfillmentCenterByCountry(String country);
}
