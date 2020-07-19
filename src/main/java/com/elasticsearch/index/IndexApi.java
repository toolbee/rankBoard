package com.elasticsearch.index;

import org.elasticsearch.action.support.ActiveShardCount;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.common.xcontent.XContentType;

import com.elasticsearch.config.ElasticConfig;

public class IndexApi {

	ElasticConfig elasticConfig;

	
	public RestHighLevelClient setClient() throws Exception {
		RestHighLevelClient client = elasticConfig.client();
		
		return client;
	}
	
	public String createIndex(String index) throws Exception {
		RestHighLevelClient client = setClient();
		
		CreateIndexRequest request = new CreateIndexRequest(index); 
		request.source("{ \n" +
				"    \"settings\" : { \n" +
				"    	\"number_of_shards\" : 3, \n" +
				"    	\"number_of_replicas\" : 2, \n" +
				"    	\"analysis\" : { \n" +
				"      		\"tokenizer\": { \n" +
				"        		\"korean_nori_tokenizer\" : { \n" +
				"          			\"type\" : \"nori_tokenizer\", \n" +
				"          			\"decompound_mode\" : \"mixed\", \n" +
				"         			\"user_dictionary\" : \"userdict_ko.txt\" \n" +
				"        		} \n" +
				"      		}, \n" +
				"      		\"analyzer\" : { \n" +
				"        		\"nori_analyzer\" : { \n" +
				"         			\"type\" : \"custom\", \n" +
				"         			\"tokenizer\" : \"korean_nori_tokenizer\", \n" +
				"          			\"filter\" : [ \n" +
				"            			\"nori_posfilter\" \n" +    
				"          			] \n" +
				"        		} \n" +
				"      		}, \n" +
				"      		\"filter\" : { \n" +
				"        		\"nori_posfilter\" : { \n" +
				"          			\"type\" : \"nori_part_of_speech\", \n" +
				"          			\"stoptags\" : [ \n" +
				"            			\"E\", \n" +
				"            			\"IC\", \n" +
				"            			\"J\", \n" +
				"            			\"MAG\", \"MAJ\", \"MM\", \n" +
				"            			\"SP\", \"SSC\", \"SSO\", \"SC\", \"SE\", \n" +
				"            			\"XPN\", \"XSA\", \"XSN\", \"XSV\", \n" +
				"            			\"UNA\", \"NA\", \"VSV\" \n" +
				"          			] \n" +
				"        		} \n" +
				"      		} \n" +
				"    	} \n" +
				"  	}, \n" +
				"  	\"mappings\" : { \n" +
				"    	\"properties\" : { \n" +
				"      		\"col1\" : { \n" +
				"        		\"type\" : \"text\", \n" +
				"				\"analyzer\" : \"nori_analyzer\" \n" +
				"      		}, \n" +
				"      		\"col2\" : { \n" +
				"        		\"type\" : \"text\", \n" +
				"        		\"analyzer\" : \"nori_analyzer\" \n" +
				"      		}, \n" +
				"      		\"col3\" : { \n" +
				"        		\"type\" : \"text\", \n" +
				"        		\"analyzer\" : \"nori_analyzer\" \n" +
				"      		}, \n" +
				"      		\"col4\" : { \n" +
				"        		\"type\" : \"text\", \n" +
				"        		\"analyzer\" : \"nori_analyzer\" \n" +
				"      		} \n" +
				"    	} \n" +
				"  	} \n" +
				"}", XContentType.JSON);

		request.setTimeout(TimeValue.timeValueMinutes(2)); 
		request.setMasterTimeout(TimeValue.timeValueMinutes(1)); 
		request.waitForActiveShards(ActiveShardCount.DEFAULT); 
		CreateIndexResponse response = client.indices().create(request, RequestOptions.DEFAULT);
		
		client.close();
		
		return index;
	}
	
}
