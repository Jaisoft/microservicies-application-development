package com.jaisoft.aggregate.infrastructure;

import com.jaisoft.aggregate.infrastructure.data.AggregateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AggregateRepository extends JpaRepository<AggregateEntity,Long> {
}
