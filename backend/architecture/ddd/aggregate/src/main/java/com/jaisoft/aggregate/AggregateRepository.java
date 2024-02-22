package com.jaisoft.aggregate;

import com.jaisoft.aggregate.data.AggregateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AggregateRepository extends JpaRepository<AggregateEntity,Long> {
}
