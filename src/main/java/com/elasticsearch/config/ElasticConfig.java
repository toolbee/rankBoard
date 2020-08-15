package com.elasticsearch.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories
@ComponentScan
public class ElasticConfig {

	@Value(value = "{elastic.host}")
	private String host;

	@Value(value = "{elastic.port}")
	private int port;

	@Value("${elastic.clustername}")
	private String clusterName;

//https://www.baeldung.com/spring-data-elasticsearch-tutorial
//	@EnableElasticsearchRepositories(basePackages = "com.elasticsearch.repository")
//	@ComponentScan(basePackages = { "com.elasticsearch.service" })
	
	@Bean
	public RestHighLevelClient client() {
		ClientConfiguration clientConfiguration 
		= ClientConfiguration.builder()
		.connectedTo(host+":"+port)
		.build();

		return RestClients.create(clientConfiguration).rest();
	}

	@Bean
	public ElasticsearchOperations elasticsearchTemplate() {
		return new ElasticsearchRestTemplate(client());
	}


}
