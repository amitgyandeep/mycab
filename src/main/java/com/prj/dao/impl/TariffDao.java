package com.prj.dao.impl;

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

public class TariffDao extends GenericDaoHibernate<Tariff,Integer> implements ITariffDao {

	public TariffDao() {

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

				criteria.add( Restrictions.eq( "modelId" , model.getId() ) );
				Tariff tariff = ( Tariff ) criteria.uniqueResult();
				if ( tariff != null ) {
					tariff.setApplicableDays( days );
				}
				return tariff;
			}
		} );

	}

}
