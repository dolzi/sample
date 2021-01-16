package com.sample.web;

import java.sql.Connection;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.junit.Test;

public class DBTest extends Configure {
	
	@Test
	public void dbConnect() throws Exception {
		DataSource dataSource = (DataSource) ctx.getBean("dataSrouce");
		Connection connection = (Connection) dataSource.getConnection();
	}
	
}
