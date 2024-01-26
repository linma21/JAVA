package com.myshop.db;

public class SQL {
	
	//Customer
	public static final String INSERT_CUSTOMER	= "INSERT INTO `Customer` VALUES (?,?,?,?,DATE_FORMAT(NOW(), '%Y-%m-%d'))";
	public static final String SELECT_CUSTOMER 	= "SELECT * FROM `Customer` WHERE `custId` =?";
	public static final String SELECT_CUSTOMERS = "SELECT * FROM `Customer";
	public static final String UPDATE_CUSTOMER 	= "UPDATE `Customer` SET `name`=?, "
																		+ "`hp` =?, "
																		+ "`addr`=?, "
																		+ "`rdate`=? "
																		+ "WHERE `custId`=?";
	public static final String DELETE_CUSTOMER 	= "DELETE `Customer` WHERE `custId` =?";
	
	//Order
	public static final String INSERT_ORDER  	= "INSERT INTO `Order` SET `orderId`=?,"
																		+ " `orderProduct`=?,"
																		+ " `orderCount`=?,"
																		+ " `orderDate`=NOW()";
	public static final String SELECT_ORDER  	= "SELECT * FROM `Order` WHERE `orderNo` =?";
	public static final String SELECT_ORDERS 	= "SELECT a.*,`prodName`,`price`,`company` FROM `Order` AS a "
																	+ "	JOIN `Product` AS b ON a.orderProduct = b.proNo "
																	+ " WHERE `orderId` = ?"
																	+ " ORDER BY `orderDate` DESC";
	public static final String UPDATE_ORDER  	= "";
	public static final String DELETE_ORDER  	= "DELETE `Order` WHERE `orderNo` =?";
	
	//Product
	public static final String INSERT_PRODUST  	= "INSERT INTO `Product` VALUES (?,?,?,?,?)";
	public static final String SELECT_PRODUCT  	= "SELECT * FROM `Product` WHERE `proNo` =?";
	public static final String SELECT_PRODUCTS 	= "SELECT `proNo`,`prodName`,`price`,`company` FROM `Product`;";
	public static final String UPDATE_PRODUCT  	= "UPDATE `Product` SET `prodName`=?, `stock`=?";
	public static final String DELETE_PRODUCT  	= "";
	
	public static final String UPDATE_PRODUCT_STOCK  	= "UPDATE `product` SET `stock` = `stock`-? WHERE `proNo` = ?;";
	public static final String TOTAL_PRICE  	= "SELECT (`price`*`orderCount`) AS `totalPrice` "
													+ "FROM `Order` AS a "
													+ "JOIN `Product` AS b ON a.orderProduct = b.proNo "
													+ "ORDER BY `orderNo` DESC LIMIT 1;";

}
