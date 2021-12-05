package com.epam.restapiarchitecture.event_service_rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@ApiIgnore
@RequestMapping
@RestController
public class MainController {
	@GetMapping
	public void getApiDocumentation(HttpServletResponse response) throws IOException {
		response.sendRedirect("swagger-ui.html");
	}
}
