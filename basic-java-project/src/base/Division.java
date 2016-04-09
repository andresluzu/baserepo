package base;

public class Division implements Operable{
	@Override
	public String operar() {
		// TODO Auto-generated method stub
		String cadena="";
		int numero = 1234;
		int numero_dos = 12;	
		//String cadena = "";	 
		//cadena = String.valueOf(numero);
		//numero = Integer.parseInt(cadena)
		//cadena = String.valueOf(numero_dos);
		//cadena= Integer.toString(numero_dos);
		numero = numero/numero_dos;
		cadena = String.valueOf(numero);	
		return "Division = " + cadena;
	}
}
