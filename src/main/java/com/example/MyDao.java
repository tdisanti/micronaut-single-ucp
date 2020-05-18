package com.example;

import java.sql.ResultSet;

import javax.inject.Singleton;
import javax.transaction.Transactional;

import io.micronaut.data.jdbc.runtime.JdbcOperations;

@Singleton
public class MyDao extends MyRepository {
	
	public MyDao(JdbcOperations jdbcOperations) {
		super(jdbcOperations);
	}

	@Transactional
	public Long find() {
		String sql = "select * from my_table where id = 1";
		return this.jdbcOperations.prepareStatement(sql, st -> {
			
            ResultSet rs = st.executeQuery();
            
            rs.next();
            System.out.println(rs.getString("FIELD"));
            
			return 1L;
		});
	}

}
