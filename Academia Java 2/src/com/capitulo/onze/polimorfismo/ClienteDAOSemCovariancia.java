package com.capitulo.onze.polimorfismo;

public class ClienteDAOSemCovariancia implements BaseDAO{
	
	public Object getByPrimaryKey(Object o){
		return null;
	}
	
	public static void main (String[]  args){
		ClienteDAOSemCovariancia dao = new ClienteDAOSemCovariancia();
		Cliente c = (Cliente) dao.getByPrimaryKey(new Integer(20));
	}

}
