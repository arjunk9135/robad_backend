package com.estrobacknew.servernew.model.mongorepo;

import com.estrobacknew.servernew.model.MaintedModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MaintainedRepo extends MongoRepository<MaintedModel, String> {

    void deleteByImei(String imei);
}
