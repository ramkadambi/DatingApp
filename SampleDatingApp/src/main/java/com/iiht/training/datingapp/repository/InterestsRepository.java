package com.iiht.training.datingapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iiht.training.datingapp.entity.Interests;

@Repository
public interface InterestsRepository extends CrudRepository<Interests, Long> {

	@Query("SELECT i FROM Interests i WHERE i.userId = :userId")
	List<Interests> findByUserId(@Param("userId") Long userId);
}
