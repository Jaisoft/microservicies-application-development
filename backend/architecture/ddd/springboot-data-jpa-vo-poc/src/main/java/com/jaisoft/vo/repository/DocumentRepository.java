package com.jaisoft.vo.repository;

import com.jaisoft.vo.entity.DocumentAggregate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<DocumentAggregate, Long> {


}
