package com.estrobacknew.servernew.model.mongorepo;

import com.estrobacknew.servernew.model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<UserModel,Integer> {
    UserModel findByEmail(String email);
}
