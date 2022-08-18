package com.iu.start.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankBookService {
	
	@Autowired
	private BankBookDAO bankBookDAO;
	
	public int setUpdate(BankBookDTO bookDTO) throws Exception {
		return bankBookDAO.setUpdate(bookDTO);
	}
	
	public int setBankBook(BankBookDTO BookDTO) throws Exception{
		return bankBookDAO.setBankBook(BookDTO);
	}
	
	public List<BankBookDTO> getList() throws Exception{
		return bankBookDAO.getList();
	}
	
	public int setChangeSale(BankBookDTO bookDTO) throws Exception{
		return bankBookDAO.setChangeSale(bookDTO);
	}
	
	public BankBookDTO getDetail(BankBookDTO bookDTO) throws Exception{
		return bankBookDAO.getDetail(bookDTO);
	}
	
	public int setDelete(BankBookDTO bookDTO) throws Exception{
		return bankBookDAO.setDelete(bookDTO);
	}
	

}
