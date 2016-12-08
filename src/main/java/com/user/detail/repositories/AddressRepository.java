package com.user.detail.repositories;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.querydsl.core.types.dsl.StringPath;
import com.user.detail.models.Address;
import com.user.detail.models.QAddress;

@Repository
public interface AddressRepository extends PagingAndSortingRepository<Address, Long>,
		QueryDslPredicateExecutor<Address>, QuerydslBinderCustomizer<QAddress> {

	Address findAddressById(long id);

	Address findAllAddressByCity(@Param("c") String city);

	@Override
	default void customize(QuerydslBindings bindings, QAddress root) {
		bindings.bind(String.class).first((StringPath path, String value) -> path.containsIgnoreCase(value));
	}
}
