package com.prj.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.appfuse.service.impl.GenericManagerImpl;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.prj.dao.ICarHubDao;
import com.prj.model.ApplicationConstants;
import com.prj.model.CarHub;
import com.prj.service.ICarHubService;

public class CarHubService extends GenericManagerImpl<CarHub,Integer> implements ICarHubService {

	private ICarHubDao carHubDAO;

	private RestTemplate restTemplate;

	private CarHub carHub;

	public CarHubService( ICarHubDao carHubDAO ) {

		super( carHubDAO );
		this.carHubDAO = carHubDAO;
	}

	public List<CarHub> getCarHubs() {

		String response = restTemplate.getForObject( ApplicationConstants.hubsURL , String.class , ApplicationConstants.SYSTEM_ID , ApplicationConstants.CLIENT_ID );

		List<CarHub> carHubs = new ArrayList<CarHub>();
		Gson carHubJson = new Gson();
		JSONObject jsonObject = new JSONObject( response );
		JSONArray detailArray = jsonObject.getJSONArray( "hubs" );

		for ( int i = 0 ; i < detailArray.length() ; i++ ) {
			CarHub carHub = carHubJson.fromJson( detailArray.get( i ).toString() , CarHub.class );
			carHubs.add( carHub );
		}

		return carHubs;

	}

	public CarHub getCarHub() {

		return carHub;
	}

	public void setCarHub( CarHub carHub ) {

		this.carHub = carHub;
	}

	public RestTemplate getRestTemplate() {

		return restTemplate;
	}

	public void setRestTemplate( RestTemplate restTemplate ) {

		this.restTemplate = restTemplate;
	}

}
