package com.iu.start.bankmembers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MembersService {

	@Autowired
	private BankMembersDAO bankMembersDAO;
	
	public int setJoin(BankMembersDTO bankMembersDTO) throws Exception {
		return bankMembersDAO.setJoin(bankMembersDTO);
	}
	
	public List<BankMembersDTO> getSearchByID(String search) throws Exception {
		return bankMembersDAO.getSearchByID(search);
	}
	
	public BankMembersDTO getLogin(BankMembersDTO bankMembersDTO) throws Exception {
		return bankMembersDAO.getLogin(bankMembersDTO);
	}

}
