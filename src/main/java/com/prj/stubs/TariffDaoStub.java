package com.prj.stubs;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.prj.dao.ITariffDao;
import com.prj.model.CarModel;
import com.prj.model.DaysOfWeek;
import com.prj.model.Tariff;
import com.prj.model.TariffType;

public class TariffDaoStub extends GenericDaoHibernate<Tariff,Integer> implements ITariffDao {

	public TariffDaoStub() {

		super( Tariff.class );
		// TODO Auto-generated constructor stub
	}

	public Tariff getTariffplanByType( final TariffType type , final CarModel model ) {

		return ( Tariff ) getHibernateTemplate().execute( new HibernateCallback() {

			public Object doInHibernate( final Session session ) throws HibernateException, SQLException {

				List<DaysOfWeek> days = new ArrayList<DaysOfWeek>();
				if ( type == TariffType.StandardWeekdayTariff ) {

					days.add( DaysOfWeek.MON );
					days.add( DaysOfWeek.TUE );
					days.add( DaysOfWeek.WED );
					days.add( DaysOfWeek.THU );
				} else {
					days.add( DaysOfWeek.FRI );
					days.add( DaysOfWeek.SAT );
					days.add( DaysOfWeek.SUN );
				}
				Criteria criteria = getSession().createCriteria( Tariff.class );
				criteria.add( Restrictions.eq( "type" , type ) );
				criteria.createAlias( "model" , "model" );
				criteria.add( Restrictions.eq( "model.id" , model.getId() ) );
				Tariff tariff = ( Tariff ) criteria.uniqueResult();
				if ( tariff != null ) {
					tariff.setApplicableDays( days );
				}
				return tariff;
			}
		} );

		/*Tariff tariff = new Tariff();

		if ( TariffType.StandardWeekdayTariff == type ) {

			List<DaysOfWeek> days = new ArrayList<DaysOfWeek>();
			days.add( DaysOfWeek.MON );
			days.add( DaysOfWeek.TUE );
			days.add( DaysOfWeek.WED );
			days.add( DaysOfWeek.THU );

			tariff.setApplicableDays( days );

		}

		if ( TariffType.StandardWeekendTariff == type ) {

			List<DaysOfWeek> days = new ArrayList<DaysOfWeek>();
			days.add( DaysOfWeek.FRI );
			days.add( DaysOfWeek.SAT );
			days.add( DaysOfWeek.SUN );

			tariff.setApplicableDays( days );

			if ( CarModelStub.Nisaan_Go.getName().equals( model.getName() ) ) {

				tariff.setRatePerHour( 99 );
			}

			if ( CarModelStub.Ford_Figo.getName().equals( model.getName() ) ) {

				tariff.setRatePerHour( 99 );
			}

			if ( CarModelStub.Maruti_Dzire.getName().equals( model.getName() ) ) {

				tariff.setRatePerHour( 129 );
			}

			if ( CarModelStub.Toyota_Etios.getName().equals( model.getName() ) ) {

				tariff.setRatePerHour( 129 );
			}
			if ( CarModelStub.Honda_Amaze.getName().equals( model.getName() ) ) {

				tariff.setRatePerHour( 129 );
			}

			if ( CarModelStub.Nissan_Sunny.getName().equals( model.getName() ) ) {

				tariff.setRatePerHour( 145 );
			}
			if ( CarModelStub.Honda_City.getName().equals( model.getName() ) ) {

				tariff.setRatePerHour( 145 );
			}

			if ( CarModelStub.Ford_EcoSports.getName().equals( model.getName() ) ) {

				tariff.setRatePerHour( 145 );
			}
			if ( CarModelStub.Nissan_Terrano.getName().equals( model.getName() ) ) {

				tariff.setRatePerHour( 175 );
			}

			if ( CarModelStub.Renault_Duster.getName().equals( model.getName() ) ) {

				tariff.setRatePerHour( 175 );
			}
			if ( CarModelStub.Toyota_Altis.getName().equals( model.getName() ) ) {

				tariff.setRatePerHour( 209 );
			}

			if ( CarModelStub.Toyota_Innova.getName().equals( model.getName() ) ) {

				tariff.setRatePerHour( 169 );
			}
			if ( CarModelStub.XUV.getName().equals( model.getName() ) ) {

				tariff.setRatePerHour( 155 );
			}

			if ( CarModelStub.Mahindra_Scorpio.getName().equals( model.getName() ) ) {

				tariff.setRatePerHour( 150 );
			}

			if ( CarModelStub.Honda_Mobilio.getName().equals( model.getName() ) ) {

				tariff.setRatePerHour( 155 );
			}

			if ( CarModelStub.Toyota_Fortuner.getName().equals( model.getName() ) ) {

				tariff.setRatePerHour( 271 );
			}

			if ( CarModelStub.Toyota_Camry.getName().equals( model.getName() ) ) {

				tariff.setRatePerHour( 300 );
			}

			if ( CarModelStub.Merc_C_Class.getName().equals( model.getName() ) ) {

				tariff.setRatePerHour( 263 );
			}

			if ( CarModelStub.MercE_Class.getName().equals( model.getName() ) ) {

				tariff.setRatePerHour( 438 );
			}

			if ( CarModelStub.BMW5_Series.getName().equals( model.getName() ) ) {

				tariff.setRatePerHour( 438 );
			}

			if ( CarModelStub.AudiA6.getName().equals( model.getName() ) ) {

				tariff.setRatePerHour( 438 );
			}

			if ( CarModelStub.AudiQ7.getName().equals( model.getName() ) ) {

				tariff.setRatePerHour( 708 );
			}

		}	return tariff;
		*/

	}

	public boolean exists( Integer arg0 ) {

		// TODO Auto-generated method stub
		return false;
	}

	public Tariff get( Integer arg0 ) {

		// TODO Auto-generated method stub
		return null;
	}

	public List<Tariff> getAll() {

		// TODO Auto-generated method stub
		return null;
	}

	public void remove( Integer arg0 ) {

		// TODO Auto-generated method stub

	}

	public Tariff save( Tariff arg0 ) {

		// TODO Auto-generated method stub
		return null;
	}

}
