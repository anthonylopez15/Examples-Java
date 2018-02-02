package com.capitulo.onze.polimorfismo;

public class ClienteDAO implements BaseDAO{

	public Cliente getByPrimaryKey(Object o){
		return null;
	}
	
	public static void main(String[] args){
		ClienteDAO dao = new ClienteDAO();
		Cliente c = dao.getByPrimaryKey(new Integer(20));
	}
}
