package exercise2;

import exercise1.Exercise1;

public class Exercise2 extends Exercise1 {

	public ProductionWorker buildProductiveWorker(int salaryPerProducedPiece) {    //creation d'une fonction productiveWorker de type ProductionWorker
		return new ProductionWorker(salaryPerProducedPiece);
	}
}
