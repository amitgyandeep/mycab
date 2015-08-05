package com.prj.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.prj.model.Penalty;
import com.prj.model.PenaltyType;
import com.prj.model.TripPenaltyModel;
import com.prj.service.IPenaltyTypeService;

@SuppressWarnings("serial")
public class BookingServiceHelper implements Serializable {

	private IPenaltyTypeService penaltyTypeService;

	PenaltyType penaltytype;

	Penalty penalty;

	public List<Penalty> getPenalties( TripPenaltyModel model ) {

		List<Penalty> penalties = new ArrayList<Penalty>();

		if ( model.getRefuelCharge() != null ) {
			penaltytype = penaltyTypeService.getPenaltyByName( "Refuel Charge" );
			penalty = new Penalty();
			penalty.setCost( model.getRefuelCharge() + 500 );
			penalty.setType( penaltytype );
			penalties.add( penalty );
		}
		if ( model.getDelay() != null ) {
			penaltytype = penaltyTypeService.getPenaltyByName( "Delay Return" );
			penalty = new Penalty();
			penalty.setCost( model.getDelay() );
			penalty.setType( penaltytype );
			penalties.add( penalty );
		}
		if ( model.getDelayWithExt() != null ) {
			penaltytype = penaltyTypeService.getPenaltyByName( "Delay Return(Ext.)" );
			penalty = new Penalty();
			penalty.setCost( model.getDelayWithExt() );
			penalty.setType( penaltytype );
			penalties.add( penalty );
		}
		if ( model.getTowing() != null ) {
			penaltytype = penaltyTypeService.getPenaltyByName( "Towing" );
			penalty = new Penalty();
			penalty.setCost( model.getTowing() );
			penalty.setType( penaltytype );
			penalties.add( penalty );
		}
		if ( model.getOthers() != null ) {
			penaltytype = penaltyTypeService.getPenaltyByName( "Others" );
			penalty = new Penalty();
			penalty.setCost( model.getOthers() );
			penalty.setType( penaltytype );
			penalties.add( penalty );
		}
		if ( model.getOverSpeedCount() != null ) {
			penaltytype = penaltyTypeService.getPenaltyByName( "Over Speed" );
			penalty = new Penalty();
			Double total = penalty.getCost() * model.getOverSpeedCount();
			penalty.setCost( total );
			penalty.setType( penaltytype );
			penalties.add( penalty );
		}
		if ( model.getMajorDamage() != null ) {
			penaltytype = penaltyTypeService.getPenaltyByName( "Major Damage" );
			penalty = new Penalty();
			penalty.setCost( model.getMajorDamage() );
			penalty.setType( penaltytype );
			penalties.add( penalty );
		}
		if ( model.getMinorDamage() != null ) {
			penaltytype = penaltyTypeService.getPenaltyByName( "Minor Damage" );
			penalty = new Penalty();
			penalty.setCost( model.getMinorDamage() );
			penalty.setType( penaltytype );
			penalties.add( penalty );
		}
		if ( model.getFilthVomit() != null ) {
			penaltytype = penaltyTypeService.getPenaltyByName( "Filth/vomit" );
			penalty = new Penalty();
			penalty.setCost( model.getFilthVomit() );
			penalty.setType( penaltytype );
			penalties.add( penalty );
		}
		if ( model.getKeyLost() != null ) {
			penaltytype = penaltyTypeService.getPenaltyByName( "Key lost" );
			penalty = new Penalty();
			penalty.setCost( model.getRefuelCharge() );
			penalty.setType( penaltytype );
			penalties.add( penalty );
		}
		if ( model.getRefuelCharge() != null ) {
			penaltytype = penaltyTypeService.getPenaltyByName( "Refuel Charge" );
			penalty = new Penalty();
			penalty.setCost( model.getRefuelCharge() );
			penalty.setType( penaltytype );
			penalties.add( penalty );
		}
		if ( model.getRefuelCharge() != null ) {
			penaltytype = penaltyTypeService.getPenaltyByName( "Refuel Charge" );
			penalty = new Penalty();
			penalty.setCost( model.getRefuelCharge() );
			penalty.setType( penaltytype );
			penalties.add( penalty );
		}

		// TODO Auto-generated method stub
		return penalties;
	}

	public IPenaltyTypeService getPenaltyTypeService() {

		return penaltyTypeService;
	}

	public void setPenaltyTypeService( IPenaltyTypeService penaltyTypeService ) {

		this.penaltyTypeService = penaltyTypeService;
	}

}
