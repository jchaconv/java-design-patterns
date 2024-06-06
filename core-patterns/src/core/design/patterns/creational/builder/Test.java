package core.design.patterns.creational.builder;

import core.design.patterns.creational.builder.HttpClient.HttpClientBuilder;

public class Test {

	public static void main(String[] args) {
		
		
		HttpClient uglyClient = new HttpClient("GET",
				"http://test.com", null, null, null, null);
		
		
		HttpClient httpClient = new HttpClient.HttpClientBuilder()
				.method("GET").url("http//method-get-test.com")
				.body("{}").secure("jchaconv", "thejok3r")
				.build();
		
		System.out.println(httpClient);
		
		//Another way to write
		HttpClientBuilder builder = new HttpClient.HttpClientBuilder();
		HttpClient httpClient2 = builder.method("POST").url("test-url")
				.body("{}").build();
		System.out.println(httpClient2);
				
		

	}

}
