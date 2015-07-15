package com.prj.dao.interfaces;

import java.util.List;

import org.appfuse.dao.GenericDao;

import com.prj.model.Customer;
import com.prj.model.Document;

public interface IDocumentDao extends GenericDao<Document,Integer> {

	List<Document> getDocumentsByCustomer( Customer customer );

}
