package base;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Operable> operaciones = new ArrayList<Operable>();

		operaciones.add(new Suma());
		operaciones.add(new Resta());
		operaciones.add(new Multiplicacion());
		operaciones.add(new Division());
		
		for (Operable operable : operaciones) {
			System.out.println(operable.operar());
		}
	}
}
