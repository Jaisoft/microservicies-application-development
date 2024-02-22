package com.jaisoft.dda.domain.repository;

import com.jaisoft.dda.domain.aggregate.AccountAggregate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository<AccountAggregate, String> {

}
