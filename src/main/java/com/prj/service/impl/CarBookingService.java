package com.prj.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.appfuse.service.impl.GenericManagerImpl;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

import com.prj.dao.ICarDao;
import com.prj.model.ApplicationConstants;
import com.prj.model.Car;
import com.prj.model.CarHub;
import com.prj.model.CarModel;
import com.prj.model.CarStatusEnum;
import com.prj.service.ICarBookingService;
import com.prj.service.ICarPricingService;
import com.prj.service.ISecurityDepositService;

public class CarBookingService extends GenericManagerImpl<Car,Integer> implements ICarBookingService {

	private ICarDao carDAO;

	private ICarPricingService pricingService;

	private ISecurityDepositService securityDepositService;

	private RestTemplate restTemplate;

	public CarBookingService( ICarDao carDAO ) {

		super( carDAO );
		this.carDAO = carDAO;
	}

	public List<Car> getAvailableCars( CarHub hub , Date startDate , Date endDate ) {

		return getCarsWithPrice( null , hub , startDate , endDate );
	}

	public List<Car> getAvailableCars( Date startDate , Date endDate ) {

		return getCarsWithPrice( null , null , startDate , endDate );

	}

	public List<Car> getAvailableCarsByModel( CarModel model , CarHub hub , Date startDate , Date endDate ) {

		String response = restTemplate.getForObject( ApplicationConstants.availableCarsURL , String.class , 202 , 3354 , 111513 );

		List<Car> cars = new ArrayList<Car>();

		JSONObject jsonObject = new JSONObject( response );
		JSONArray detailArray = jsonObject.getJSONArray( "Cars" );

		for ( int i = 0 ; i < detailArray.length() ; i++ ) {
			jsonObject = ( JSONObject ) detailArray.get( i );

		}

		return getCarsWithPrice( model , hub , startDate , endDate );

	}

	private List<Car> getCarsWithPrice( CarModel model , CarHub hub , Date startDate , Date endDate ) {

		List<Car> cars = carDAO.getAvailableCarsByModel( model , hub , startDate , endDate );

		for ( Car car : cars ) {

			car.setTariffs( pricingService.getCarPrice( car.getModel() , startDate , endDate ) );

			car.setSecurityDesposit( securityDepositService.getPrice( car.getSegment() ) );
		}

		return cars;
	}

	@Override
	public List<Car> getAll() {

		Car car;
		CarModel carModel;
		CarHub carHub;
		List<Car> cars = new ArrayList<Car>();
		Set<Car> carSet = new HashSet<Car>();

		String response = restTemplate.getForObject( ApplicationConstants.allCarsURL , String.class , ApplicationConstants.SYSTEM_ID , ApplicationConstants.CLIENT_ID );
		JSONObject jsonObject = new JSONObject( response );
		JSONArray detailArray = jsonObject.getJSONArray( "Cars" );
		for ( int i = 0 ; i < detailArray.length() ; i++ ) {
			jsonObject = ( JSONObject ) detailArray.get( i );
			car = new Car();
			carModel = new CarModel( ( String ) jsonObject.get( "Model" ) );
			car.setModel( carModel );

			carSet.add( car );
		}
		cars.addAll( carSet );
		return cars;
	}

	public void setPricingService( ICarPricingService pricingService ) {

		this.pricingService = pricingService;
	}

	public void setSecurityDepositService( ISecurityDepositService securityDepositService ) {

		this.securityDepositService = securityDepositService;
	}

	public ICarPricingService getPricingService() {

		return pricingService;
	}

	public ISecurityDepositService getSecurityDepositService() {

		return securityDepositService;
	}

	public RestTemplate getRestTemplate() {

		return restTemplate;
	}

	public void setRestTemplate( RestTemplate restTemplate ) {

		this.restTemplate = restTemplate;
	}

	public List<Car> getAvailableCarsByModel( CarModel model , CarStatusEnum available ) {

		// TODO Auto-generated method stub
		return carDAO.getAvailableCarsByModel( model , available );
	}

	public Car getCarByRegNo( String regNo ) {

		return carDAO.getCarByRegNo( regNo );

	}

}
