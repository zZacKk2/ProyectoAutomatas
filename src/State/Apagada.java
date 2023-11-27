package State;

public class Apagada implements State{
	Contexto maquina;
	
	@Override
	public void Encendido() {
		System.out.println("Máquina encendida :)");
		
		maquina.setEstado(new Encendida());
		
	}

	@Override
	public void RecibirPedido() {
		System.out.println("La máquina está apagada");
		
	}

	@Override
	public void Cobrar() {
		System.out.println("La máquina está apagada");
		
	}

	@Override
	public void Entregar() {
		System.out.println("La máquina está apagada");
		
	}

	@Override
	public void Apagado() {
		System.out.println("La máquina está apagada");
		
	}

	@Override
	public void setEstado(Contexto maquina) {
		this.maquina = maquina;
		
	}
	
	

}
