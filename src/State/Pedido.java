package State;

import java.util.Scanner;

public class Pedido implements State{
	Contexto maquina;
	private Scanner sc = new Scanner(System.in);
	Pedido(){
		System.out.println("Maquina lista para recibir su pedido");
	}
	
	@Override
	public void Encendido() {
		System.out.println("La máquina está encendida");
	}

	@Override
	public void RecibirPedido() {
		int i = 0;
		int eleccion = 0;;
		do {
			System.out.println("Elije tu producto: ");
			for(i = 1; i<=maquina.productos[0].length;i++) {
				System.out.println(i + "." + maquina.productos[0][i-1]);
			}
			eleccion = sc.nextInt();
		}while(eleccion <= 0 || eleccion >55);
		maquina.setEstado(new Cobro(eleccion-1));
		
		
	}
		

	@Override
	public void Cobrar() {
		System.out.println("Realiza tu pedido");
		
	}

	@Override
	public void Entregar() {
		System.out.println("Pedido sin pago");
		
	}

	@Override
	public void Apagado() {
		System.out.println("No se puede apagar la máquina mientras se realiza un pedido");
		
	}
	
	@Override
	public void setEstado(Contexto maquina) {
		this.maquina = maquina;
		
	}

}
