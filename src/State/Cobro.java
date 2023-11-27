package State;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Cobro implements State{
	int pedido;
	public Contexto maquina;
	private Scanner sc = new Scanner(System.in);
	
	public Cobro(int cobro){
		pedido = cobro;
		
	}
	@Override
	public void Encendido() {
		System.out.println("La máquina está encendida");
		
	}

	@Override
	public void RecibirPedido() {
		System.out.println("Realiza el pago del producto");	
	}


	@Override
	public void Cobrar() {
		int pago;
		int monto = 0;
			System.out.println("ingrese su pago");
			pago = sc.nextInt();
			monto = monto + pago;
			while(monto < Integer.parseInt(maquina.productos[1][pedido])) {	
				System.out.println("le faltan " + (Integer.parseInt(maquina.productos[1][pedido])-monto) + "para el producto: " + maquina.productos[0][pedido]) ;
				System.out.println("ingrese su pago");
				pago = sc.nextInt();
				monto = monto + pago;
			}
			
			System.out.println("Su cambio es: " + (monto-Integer.parseInt(maquina.productos[1][pedido])));
			maquina.setEstado(new EntregaProducto(maquina.productos[0][pedido]));	
		
	}

	@Override
	public void Entregar() {
		System.out.println("Primero debe pagar el producto");
		
	}

	@Override
	public void Apagado() {
		System.out.println("No se puede apagar la maquina cuando está en operación");
		
	}

	@Override
	public void setEstado(Contexto maquina) {
		this.maquina = maquina;
		
	}

}
