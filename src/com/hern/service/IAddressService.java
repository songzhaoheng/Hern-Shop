package com.hern.service;

import com.hern.entity.Address;
import com.hern.entity.Areas;
import com.hern.entity.Cities;
import com.hern.entity.Provinces;

import java.util.List;

public interface IAddressService {
	List<Address> findAddressByUserId(Integer userId);
	Address findAddresById(Integer id);
	Provinces findProByProByName(String name);
	Cities findCityByCityName(String name, String provinceId);
	Areas findAreaByAreaName(String name, String cityId);
	Integer addAddress(Address addr);
	Integer updateAddress(Address addr);
	Integer deleteAddress(Integer addrId);
}
