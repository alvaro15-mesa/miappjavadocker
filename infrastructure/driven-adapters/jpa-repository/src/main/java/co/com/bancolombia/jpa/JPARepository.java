package co.com.bancolombia.jpa;

import co.com.bancolombia.jpa.entities.AnimalEntities;
import org.springframework.data.repository.CrudRepository;


import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPARepository extends CrudRepository<AnimalEntities/* change for adapter model */, String>, QueryByExampleExecutor<AnimalEntities/* change for adapter model */> {
}
