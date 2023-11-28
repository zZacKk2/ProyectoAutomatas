package State;

import java.util.Scanner;

public class Main {
	Contexto maquina;
	
	Main(Contexto maquina) {
		this.maquina = maquina;
	}
	public static void main(String[] args) {	
		Contexto miMaquina = new Contexto();
		Scanner sc = new Scanner(System.in);
		int eleccion;
		while (true) {
			System.out.println("1). encender\n2). apagar\n3). RecibirPedido\n4). Cobrar\n5). Entregar\n6). salir");
			eleccion = sc.nextInt();
			switch (eleccion) {
			case 1: miMaquina.Encendido(); break;
			case 2: miMaquina.Apagado(); break;
			case 3: miMaquina.RecibirPedido(); break;
			case 4: miMaquina.Cobrar(); break;
			case 5: miMaquina.Entregar(); break;
			case 6: System.exit(0); break;
			default: System.out.println("Ingrese un digito valido");
			}
				
		}
	}

}
