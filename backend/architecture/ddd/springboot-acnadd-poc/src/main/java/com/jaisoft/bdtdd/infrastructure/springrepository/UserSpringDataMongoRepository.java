package com.jaisoft.bdtdd.infrastructure.springrepository;

import com.jaisoft.bdtdd.infrastructure.springrepository.data.UserDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSpringDataMongoRepository extends MongoRepository<UserDocument, String> {
}

