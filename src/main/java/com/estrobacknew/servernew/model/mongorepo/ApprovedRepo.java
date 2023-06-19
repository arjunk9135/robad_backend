package com.estrobacknew.servernew.model.mongorepo;

import com.estrobacknew.servernew.model.ApprovedModel;
import com.estrobacknew.servernew.model.ReportModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ApprovedRepo extends MongoRepository<ApprovedModel, String> {

    void deleteByImei(String imei);
}
