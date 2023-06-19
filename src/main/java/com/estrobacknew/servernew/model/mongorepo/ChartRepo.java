package com.estrobacknew.servernew.model.mongorepo;

import com.estrobacknew.servernew.model.ChartModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChartRepo extends MongoRepository<ChartModel,Integer> {


}
