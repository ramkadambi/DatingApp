package com.iiht.training.datingapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iiht.training.datingapp.entity.Like;

@Repository
public interface LikesRepository extends CrudRepository<Like, Long> {

	@Modifying
	@Query("SELECT l FROM Like l WHERE l.likedUserId = :userId")
	List<Like> getAllLikedUsers(@Param("userId") Long userId);

}
