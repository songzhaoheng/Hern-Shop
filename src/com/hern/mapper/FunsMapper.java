package com.hern.mapper;

import com.hern.entity.Funs;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FunsMapper {
	Funs findFunsById(Integer id);
	List<Funs> findFunsByPid(Integer id);
	List<Funs> findAllFuns();
	List<Funs> findFunsByRoleId(Integer roleId);
}
