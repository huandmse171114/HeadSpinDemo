package com.headspin.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.headspin.demo.entity.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer>{
	
//	@Query(
//			value = "update todos set Status = :status where Id = :id",
//			nativeQuery = true
//	)
//	void updateTodoStatus(@Param("id") int id,@Param("status") int status);

}
