
package metier;

import Dao.DaoImpl;

public class MetierImpl {
	 private DaoImpl Dao;
	 
	 public MetierImpl() {
		 Dao =new DaoImpl();
		 

}
	 public double Calcul() {
		 double data=Dao.GetValue();
		 return data*13;
	 }

}
