package com.hern.mapper;

import com.hern.entity.Areas;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AreasMapper {
	List<Areas> findAreasByCityId(String cityId);
	Areas findAreaByAreaName(String name, String cityId);
	Areas findAreaById(String id);
}
