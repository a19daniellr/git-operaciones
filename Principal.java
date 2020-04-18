package operaciones;

import operaciones.Operaciones;

public class Principal {
	public static void main(String[] args) {
		Operaciones tool = new Operaciones();
		System.out.println(tool.multiplicar(2,5));
		System.out.println(tool.division(5,2));
		System.out.println(tool.multiplicar(10, 10));
	}
}
