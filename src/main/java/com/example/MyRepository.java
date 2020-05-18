package com.example;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.jdbc.runtime.JdbcOperations;
import io.micronaut.data.model.query.builder.sql.Dialect;

@Repository(value = "fazemu")
@JdbcRepository(dialect = Dialect.ORACLE)
public abstract class MyRepository {
	
	protected final JdbcOperations jdbcOperations;
    
    public MyRepository(JdbcOperations jdbcOperations) {
		this.jdbcOperations = jdbcOperations;
    }
	
}
