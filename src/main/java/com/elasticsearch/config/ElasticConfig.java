package com.elasticsearch.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.transport.TransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.h2.H2ConsoleProperties.Settings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;


@EnableElasticsearchRepositories
@Configuration
public class ElasticConfig {

	@Value(value = "{elastic.host}")
	private String host;

	@Value(value = "{elastic.port}")
	private int port;

	@Value("${elastic.clustername}")
	private String clusterName;

//https://www.baeldung.com/spring-data-elasticsearch-tutorial
	
	public RestHighLevelClient client2() throws Exception {

		RestHighLevelClient client = new RestHighLevelClient(
				RestClient.builder(
						new HttpHost(host, port, "http")));
		return client;
	}	


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
