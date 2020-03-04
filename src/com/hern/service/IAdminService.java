package com.hern.service;

import com.hern.entity.Admins;

public interface IAdminService {
	Admins login(String name, String pass);
	Integer updateAdmin(Admins admin);
	Admins findAdminById(Integer id);
}
