package com.xxxx.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxxx.seckill.pojo.Order;
import com.xxxx.seckill.pojo.User;
import com.xxxx.seckill.vo.GoodsVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * 广告位招租
 *
 * @author zhoubin
 *
 */
public interface IOrderService extends IService<Order> {

    // 秒杀
    Order seckill(User user, GoodsVo goods);
}
