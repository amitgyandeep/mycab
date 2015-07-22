package com.prj.service.impl;

import java.util.List;

import org.appfuse.service.impl.GenericManagerImpl;

import com.prj.dao.IDocumentDao;
import com.prj.model.Customer;
import com.prj.model.Document;
import com.prj.service.IDocumentService;

public class DocumentServiceImpl extends GenericManagerImpl<Document,Integer> implements IDocumentService {

	private IDocumentDao documentDao;

	public DocumentServiceImpl( IDocumentDao documentDao ) {

		super( documentDao );
		this.documentDao = documentDao;
	}

	public List<Document> getDocumentsByCustomer( Customer customer ) {

		// TODO Auto-generated method stub
		return documentDao.getDocumentsByCustomer( customer );
	}

}
