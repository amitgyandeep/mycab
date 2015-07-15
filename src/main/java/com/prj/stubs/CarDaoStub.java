package com.prj.stubs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;

import com.prj.dao.interfaces.ICarDao;
import com.prj.model.Car;
import com.prj.model.CarHub;
import com.prj.model.CarModel;

public class CarDaoStub extends GenericDaoHibernate<Car,Integer> implements ICarDao {

	public CarDaoStub() {

		super( Car.class );
	}

	public List<Car> getAvailableCars( CarHub hub , Date startDate , Date endDate ) {

		// TODO Auto-generated method stub
		return null;
	}

	public List<Car> getAvailableCarsByModel( CarModel model , CarHub hub , Date startDate , Date endDate ) {

		Car car1 = new Car();
		car1.setHub( hub );
		car1.setModel( CarModelStub.AudiA6 );
		car1.setSegment( CarSegmentStub.sedan );

		Car car2 = new Car();
		car2.setHub( hub );
		car2.setModel( CarModelStub.BMW5_Series );
		car2.setSegment( CarSegmentStub.sedan );

		Car car3 = new Car();
		car3.setHub( hub );
		car3.setModel( CarModelStub.Nisaan_Go );
		car3.setSegment( CarSegmentStub.compact );

		Car car4 = new Car();
		car4.setHub( hub );
		car4.setModel( CarModelStub.XUV );
		car4.setSegment( CarSegmentStub.suv );

		List<Car> cars = new ArrayList<Car>();
		cars.add( car1 );
		cars.add( car2 );
		cars.add( car3 );
		cars.add( car4 );

		return cars;
	}

	public boolean exists( Integer arg0 ) {

		// TODO Auto-generated method stub
		return false;
	}

	public Car get( Integer arg0 ) {

		// TODO Auto-generated method stub
		return null;
	}

	public List<Car> getAll() {

		// TODO Auto-generated method stub
		return null;
	}

	public void remove( Integer arg0 ) {

		// TODO Auto-generated method stub

	}

	public Car save( Car arg0 ) {

		// TODO Auto-generated method stub
		return null;
	}

}
