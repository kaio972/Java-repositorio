package transportado;


public class Sedex implements Frete{
	public double calcularPreco(int distancia) {
		return distancia * 1.45 + 12;
	}
}
