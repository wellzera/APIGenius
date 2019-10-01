package com.wellington.test.api;

import static com.jayway.restassured.RestAssured.given;

import org.junit.Test;

import com.jayway.restassured.path.json.JsonPath;
public class BuscaControllerTeste {
	
	@Test
	public void validaInformacoes() {
		JsonPath json = given().then().statusCode(200).get("/busca/drake").andReturn().jsonPath();
	}
}
