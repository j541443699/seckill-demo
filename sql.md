创建列表

CREATE TABLE `t_seckill_order` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '秒杀订单ID',
	`user_id` BIGINT(20) DEFAULT NULL  COMMENT '用户ID',
	`order_id` BIGINT(20) DEFAULT NULL  COMMENT '订单ID',
	`goods_id` BIGINT(20) DEFAULT NULL  COMMENT '商品ID',
	PRIMARY KEY(`id`)
)ENGINE = INNODB AUTO_INCREMENT=3 DEFAULT CHARSET = utf8mb4
COMMENT '秒杀订单表'
;

插入数据

INSERT INTO t_goods VALUES(1,'IPHONE12','IPHONE12 64GB','/img/iphone12.png','IPHONE12 64GB','6299.00',100),(2,'IPHONE12 PRO','IPHONE12 PRO 128GB','/img/iphone12pro.png','IPHONE12 PRO 128GB','9299.00',100);

INSERT INTO t_seckill_goods VALUES(1,1,'629',10,'2022-11-01 08:00:00','2022-11-01 09:00:00'),(2,2,'929',10,'2022-11-01 08:00:00','2022-11-01 09:00:00');

查询

SELECT
	g.id,
	g.goods_name,
	g.goods_title,
	g.goods_img,
	g.goods_detail,
	g.goods_price,
	g.goods_stock,
	sg.seckill_price,
	sg.stock_count,
	sg.start_date,
	sg.end_date
	FROM
		t_goods g
		LEFT JOIN t_seckill_goods AS sg ON g.id = sg.goods_id

