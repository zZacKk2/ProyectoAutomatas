package State;

import java.util.Scanner;

public class Main {
	Contexto maquina;
	
	Main(Contexto maquina) {
		this.maquina = maquina;
	}
	public static void main(String[] args) {	
		Contexto miMaquina = new Contexto();
		miMaquina.Encendido();
		miMaquina.RecibirPedido();
		miMaquina.RecibirPedido();
		miMaquina.Cobrar();
		miMaquina.Entregar();
	}

}
