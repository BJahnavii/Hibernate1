package com.infinite.hibernate.dimpl;


import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

import com.infinite.hibernate.daohelper.DaoHelper;

import com.infinite.hibernate.dinterface.ICart;
import com.infinite.hibernate.pojo.Cart;

public class Cartimpl implements ICart {

	static Session sessionObj;

	static SessionFactory sessionFactoryObj;

	private Configuration con;

	private Transaction t;

	public void saveData(Cart e) {

		con = new Configuration().configure("hibernate.cfg.xml");

		sessionFactoryObj = con.buildSessionFactory();

		sessionObj = sessionFactoryObj.openSession();

		t = sessionObj.beginTransaction();

		sessionObj.save(e);

		t.commit();

	}

	public void create(String name, int amount, int quantity, int totalprice, Cart c) {

		// TODO Auto-generated method stub

		// Getting Session Object From SessionFactory

		try {

			sessionObj = DaoHelper.buildSessionFactory().openSession();

			// Getting Transaction Object From Session Object

			sessionObj.beginTransaction();

			Cart c = (Cart) sessionObj.get(Cart.class, c.getCartid());

			c.setName(c.getName());

			c.setAmount(c.getAmount());

			c.setQuantity(c.getQuantity());

			c.setTotalprice(c.getTotalprice());

			sessionObj.update(c);

			sessionObj.save(c);

			sessionObj.getTransaction().commit();

		} catch (Exception ex) {

			ex.printStackTrace();

		} finally {

			try {

				sessionObj.close();

			} catch (Exception e11) {

				e11.printStackTrace();

			}

		}

	}

	public void update() {

		// TODO Auto-generated method stub

	}

	public void delete() {

		// TODO Auto-generated method stub

	}

	public void create(String name, int amount, int quantity, int totalprice, Cart c)
	{
		// TODO Auto-generated method stub

	}

}
