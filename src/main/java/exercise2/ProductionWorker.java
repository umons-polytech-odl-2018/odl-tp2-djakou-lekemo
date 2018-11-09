package exercise2;

public class ProductionWorker implements Payable{
	private int producedPieceRate;
	private int production=0;
	public ProductionWorker(int producedPieceRate)
	{
		this.producedPieceRate=producedPieceRate;
	}

	public void produceOnePiece()
	{
		production++;
	}

//pas de @override dans le cas d'un implement
	public int computeSalary()
{
		return producedPieceRate*production;
	}
}
