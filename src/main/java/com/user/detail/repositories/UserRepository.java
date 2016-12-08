package com.user.detail.repositories;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.querydsl.core.types.dsl.StringPath;
import com.user.detail.models.QUser;
import com.user.detail.models.User;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long>,
		QueryDslPredicateExecutor<User>, QuerydslBinderCustomizer<QUser>{

	User findAllUserById(long Id);
	
	User findAllUserByFirstName(@Param("fn") String firstName, 
			@Param("ln") String lastName, @Param("em") String email, @Param("pn") String phoneNumber);
	
	@Override
	default void customize(QuerydslBindings bindings, QUser root) {
		bindings.bind(String.class).first((StringPath path, String value) -> path.containsIgnoreCase(value));
	}
	
}
