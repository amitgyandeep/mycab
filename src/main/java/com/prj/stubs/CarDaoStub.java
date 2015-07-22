package com.prj.stubs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;

import com.prj.dao.ICarDao;
import com.prj.model.Car;
import com.prj.model.CarHub;
import com.prj.model.CarModel;

public class CarDaoStub implements ICarDao {

	public List<Car> getAvailableCars(CarHub hub, Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Car> getAvailableCarsByModel(CarModel model, CarHub hub,
			Date startDate, Date endDate) {

		Car car1 = new Car();
		car1.setHub(hub);
		car1.setModel(CarModelStub.AudiA6);
		car1.setSegment(CarSegmentStub.luxury);

		Car car2 = new Car();
		car2.setHub(hub);
		car2.setModel(CarModelStub.AudiQ7);
		car2.setSegment(CarSegmentStub.luxury);

		Car car3 = new Car();
		car3.setHub(hub);
		car3.setModel(CarModelStub.BMW5_Series);
		car3.setSegment(CarSegmentStub.luxury);

		Car car4 = new Car();
		car4.setHub(hub);
		car4.setModel(CarModelStub.Ford_EcoSports);
		car4.setSegment(CarSegmentStub.hatchback);
		
		Car car5 = new Car();
		car5.setHub(hub);
		car5.setModel(CarModelStub.Ford_Figo);
		car5.setSegment(CarSegmentStub.hatchback);
		
		Car car6 = new Car();
		car6.setHub(hub);
		car6.setModel(CarModelStub.Honda_Amaze);
		car6.setSegment(CarSegmentStub.sedan);
		
		Car car7 = new Car();
		car7.setHub(hub);
		car7.setModel(CarModelStub.Honda_City);
		car7.setSegment(CarSegmentStub.sedan);
		
		
		Car car8 = new Car();
		car8.setHub(hub);
		car8.setModel(CarModelStub.Honda_Mobilio);
		car8.setSegment(CarSegmentStub.hatchback);
		
		
		Car car9 = new Car();
		car9.setHub(hub);
		car9.setModel(CarModelStub.Mahindra_Scorpio);
		car9.setSegment(CarSegmentStub.suv);
		
		Car car10 = new Car();
		car10.setHub(hub);
		car10.setModel(CarModelStub.Maruti_Dzire);
		car10.setSegment(CarSegmentStub.sedan);
		
		Car car11 = new Car();
		car11.setHub(hub);
		car11.setModel(CarModelStub.Merc_C_Class);
		car11.setSegment(CarSegmentStub.luxury);
		
		Car car12 = new Car();
		car12.setHub(hub);
		car12.setModel(CarModelStub.MercE_Class);
		car12.setSegment(CarSegmentStub.luxury);
		
		Car car13 = new Car();
		car13.setHub(hub);
		car13.setModel(CarModelStub.Nisaan_Go);
		car13.setSegment(CarSegmentStub.compact);
		
		Car car14 = new Car();
		car14.setHub(hub);
		car14.setModel(CarModelStub.Nissan_Sunny);
		car14.setSegment(CarSegmentStub.sedan);
		
		Car car15 = new Car();
		car15.setHub(hub);
		car15.setModel(CarModelStub.Nissan_Terrano);
		car15.setSegment(CarSegmentStub.crossover);

		List<Car> cars = new ArrayList<Car>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		cars.add(car6);
		cars.add(car7);
		cars.add(car8);
		cars.add(car9);
		cars.add(car10);
		cars.add(car11);
		cars.add(car12);
		cars.add(car13);
		cars.add(car14);
		cars.add(car15);
		
		Car modelCar=new Car();
		modelCar.setModel(model);
		if(cars.contains(modelCar)){
			List<Car> singleCarList=new ArrayList<Car>();
			singleCarList.add(cars.get(cars.indexOf(modelCar)));
			return singleCarList;
		}

		return cars;
	}

	public boolean exists(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public Car get(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Car> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void remove(Integer arg0) {
		// TODO Auto-generated method stub

	}

	public Car save(Car arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
