package com.weavus.demo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.weavus.demo.Entity.Member;

public interface MemberRepository extends CrudRepository<Member,Integer> {

	
	@Query("select M from Member M WHERE M.id=:id AND M.password=:password")
	Member findByIdAndPw(@Param ("id") int id,@Param ("password") String password);

}
