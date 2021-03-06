package src.lil.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import src.lil.models.Order;
import src.lil.models.Order.AlreadyExists;
import src.lil.models.Order.NotFound;

public interface OrderServices {
	Order findById(Integer id) throws SQLException, NotFound;
	int countForUser(Integer id)throws SQLException, NotFound;
	void insertIntoOrders() throws SQLException, NotFound, AlreadyExists;
	List<Order> findAllByUserId(Integer user_id) throws SQLException, NotFound;
	void fillFieldsFromResultSet(ResultSet rs)throws SQLException;
}

