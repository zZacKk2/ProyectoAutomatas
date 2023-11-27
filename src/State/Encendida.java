package State;

public class Encendida implements State{

	private Contexto maquina;
	@Override
	public void Encendido() {
		System.out.println("La máquina está funcionando");
	}

	@Override
	public void RecibirPedido() {
		maquina.setEstado(new Pedido());
	}

	@Override
	public void Cobrar() {
		System.out.println("No hay producto elegido");
	}

	@Override
	public void Entregar() {
		System.out.println("No hay producto elegido");
		
	}

	@Override
	public void Apagado() {
		System.out.println("La maquina se apagó");
		maquina.setEstado(new Apagada());
	}
	
	@Override
	public void setEstado(Contexto maquina) {
		this.maquina = maquina;
		
	}
	
	

}
