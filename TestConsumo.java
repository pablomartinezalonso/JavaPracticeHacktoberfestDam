
public class TestConsumo {

	public static void main(String[] args) {
		
		Consumo recorrido1 = new Consumo(85,8,120,1.42);
		System.out.println("El tiempo empleado es : "+recorrido1.getTiempo());
		System.out.println("El consumo en l/100km es : "+recorrido1.consumoMedio());
		System.out.println("El consumo en l/100km es : "+recorrido1.consumoEuros());
		
		Consumo recorrido11 = new Consumo();
		recorrido11.setKms(389);
		recorrido11.setLitros(13.34);
		recorrido11.setVmed(35);
		System.out.println("El tiempo empleado es : "+recorrido11.getTiempo());
		System.out.println("El consumo en l/100km es : "+recorrido11.consumoMedio());
		System.out.println("El consumo en l/100km es : "+recorrido11.consumoEuros());
	}
}
