package com.hern.mapper;

import com.hern.entity.GoodsType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsTypeMapper {
	GoodsType findTypeById(Integer id);
	Integer saveGoodsType(GoodsType goodsType);
	Integer deleteGoodsType(Integer id);
	Integer updateGoodsType(GoodsType type);
	List<GoodsType> findAllType();
	Integer changeTypeState(Integer state, Integer typeId);
	List<GoodsType> findAllTypeByLikeName(String name);
	List<GoodsType> findAllBySplitPage();
}
