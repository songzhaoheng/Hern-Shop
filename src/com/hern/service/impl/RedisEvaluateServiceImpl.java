package com.hern.service.impl;

import com.hern.entity.Evaluate;
import com.hern.entity.Goods;
import com.hern.service.IEvaluateService;
import com.hern.service.IGoodsService;
import com.hern.service.IRedisEvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.List;

@Service
public class RedisEvaluateServiceImpl implements IRedisEvaluateService {
	@Autowired
	private IGoodsService goodsService;
	@Autowired
	private IEvaluateService evaService;
	@Autowired
	private JedisPool jedisPool;

	@Override
	public void RefreshEvaluate(Integer goodsId) {
		Goods goods = goodsService.findById(goodsId);
		List<Evaluate> evaList = evaService.findEvaluateByGoodsId(goodsId);
		goods.setEvaList(evaList);
		Jedis jedis = jedisPool.getResource();
//		jedis.set(goodsId+"", JSON.toJSONString(goods));
		jedis.close();
	}
}
