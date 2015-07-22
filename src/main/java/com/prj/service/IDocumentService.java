package com.prj.service;

import java.util.List;

import org.appfuse.service.GenericManager;

import com.prj.model.Customer;
import com.prj.model.Document;

public interface IDocumentService extends GenericManager<Document,Integer> {

	List<Document> getDocumentsByCustomer( Customer customer );

}
