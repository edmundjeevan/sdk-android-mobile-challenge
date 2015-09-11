package com.anypresence.sdk.citi_mobile_challenge;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

import org.json.JSONException;

import com.anypresence.rails_droid.*;
import com.anypresence.rails_droid.http.IRestClient;

public abstract class MockJSONRestClient implements IRestClient {

	@Override
	public abstract List<String> get(URI uri) throws JSONException,
			IOException, URISyntaxException, JSONException,
			RemoteRequestException;

	@Override
	public abstract List<String> post(URI uri, String body,
			Map<String, String> headers) throws IOException,
			RemoteRequestException;

	@Override
	public abstract List<String> post(URI uri, String body) throws IOException,
			RemoteRequestException;

	@Override
	public abstract List<String> put(URI uri, String body) throws IOException,
			RemoteRequestException;

	@Override
	public abstract List<String> get(RemoteRequest remoteRequest)
			throws IOException, URISyntaxException, JSONException,
			RemoteRequestException;

	@Override
	public abstract List<String> post(RemoteRequest remoteRequest, String body)
			throws IOException, RemoteRequestException;

	@Override
	public abstract List<String> put(RemoteRequest remoteRequest, String body)
			throws IOException, RemoteRequestException;

}
