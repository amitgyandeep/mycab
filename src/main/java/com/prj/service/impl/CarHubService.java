package com.prj.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.appfuse.service.impl.GenericManagerImpl;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

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

		String response = restTemplate.getForObject( ApplicationConstants.hubsURL , String.class , ApplicationConstants.SYSTEM_ID , ApplicationConstants.CLIENT_ID ,
			ApplicationConstants.UserID );

		List<CarHub> carHubs = new ArrayList<CarHub>();

		JSONObject jsonObject = new JSONObject( response );
		JSONArray detailArray = jsonObject.getJSONArray( "Hubs" );

		for ( int i = 0 ; i < detailArray.length() ; i++ ) {
			jsonObject = ( JSONObject ) detailArray.get( i );
			CarHub carHub = new CarHub();
			carHub.setName( ( String ) jsonObject.get( "HubName" ) );
			carHub.setLatitude( Double.parseDouble( ( String ) jsonObject.get( "Latitude" ) ) );
			carHub.setLongitude( Double.parseDouble( ( String ) jsonObject.get( "Longitude" ) ) );
			carHub.setId( ( Integer ) jsonObject.get( "HubId" ) );
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
