package com.estrobacknew.servernew.model.mongorepo;

import com.estrobacknew.servernew.model.ReportModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReportRepo extends MongoRepository<ReportModel,String> {

    List<ReportModel> findAllByImei(String imei);
}
