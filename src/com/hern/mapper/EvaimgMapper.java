package com.hern.mapper;

import com.hern.entity.Evaimg;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EvaimgMapper {
	Integer addEvaimg(Evaimg evaimg);
	Evaimg findEvaimgById(Integer id);
	List<Evaimg> findEvaimgByEvaId(Integer evaId);
}
