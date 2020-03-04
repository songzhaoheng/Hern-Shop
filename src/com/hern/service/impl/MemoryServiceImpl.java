package com.hern.service.impl;

import com.hern.entity.Memory;
import com.hern.mapper.MemoryMapper;
import com.hern.service.IMemoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MemoryServiceImpl implements IMemoryService {
	@Autowired
	private MemoryMapper memoryMapper;
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	@Override
	public List<Memory> finAllMemory() {
		return memoryMapper.findAllMemory();
	}

}
