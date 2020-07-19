package com.elasticsearch.document;

import java.util.Map;

import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;

import com.elasticsearch.config.ElasticConfig;
import com.rankBoard.domain.MatchRecord;

public class DocumentApi {

	ElasticConfig elasticConfig;
	
	public RestHighLevelClient setClient() throws Exception {
		RestHighLevelClient client = elasticConfig.client();
		
		return client;
	}

	public MatchRecord getRecord() throws Exception {
		RestHighLevelClient client = setClient();
		
		GetRequest getRequest = new GetRequest(
		        "matchRecord", 
		        "1");
		
		
		GetResponse getResponse = client.get(getRequest, RequestOptions.DEFAULT);
		Map map = getResponse.getSourceAsMap();
		
		
		return null;
	}
	
	public String putRecord() throws Exception {
		RestHighLevelClient client = setClient();
		
		GetRequest getRequest = new GetRequest(
		        "matchRecord", 
		        "1");
		
		
		GetResponse getResponse = client.get(getRequest, RequestOptions.DEFAULT);
		Map map = getResponse.getSourceAsMap();
		
		
		return null;
	}
}
