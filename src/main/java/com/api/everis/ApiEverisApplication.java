package com.api.everis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.api.everis.models.entity.CobGestor;

@SpringBootApplication
public class ApiEverisApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApiEverisApplication.class, args);
	}
	
	 @Autowired
	    private JdbcTemplate jdbcTemplate;
	
	 @Override
	    public void run(String... args) throws Exception {
	        String sql = "use Goya select * from GCCOBRANZAS.COB_GESTOR";
	        List<CobGestor> customers = jdbcTemplate.query(sql,
	                BeanPropertyRowMapper.newInstance(CobGestor.class));
	         
//	        customers.forEach(System.out :: println);
	        System.out.println(customers.get(0).getPRIMER_NOMBRE());
	    }

}


