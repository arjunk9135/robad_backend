package com.estrobacknew.servernew.model.mongorepo;

import com.estrobacknew.servernew.model.DeviceModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DeviceRepo extends MongoRepository<DeviceModel,String> {

    Optional<DeviceModel> findByIMEI(String imei);
}
