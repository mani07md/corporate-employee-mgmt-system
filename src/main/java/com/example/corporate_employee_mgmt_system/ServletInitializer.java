package com.example.corporate_employee_mgmt_system;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CorporateEmployeeMgmtSystemApplication.class);
		/* new commnetes are added
			test is updated*/
	}

}
