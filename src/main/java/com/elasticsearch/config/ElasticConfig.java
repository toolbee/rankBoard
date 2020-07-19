package com.elasticsearch.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;


@EnableElasticsearchRepositories
@Configuration
public class ElasticConfig {

	@Value(value = "{elastic.host}")
	private String host;

	@Value(value = "{elastic.port}")
	private int port;

	public RestHighLevelClient client() throws Exception {

		RestHighLevelClient client = new RestHighLevelClient(
	        RestClient.builder(
	                new HttpHost(host, port, "http")));
		return client;
	}	


}
