package State;

public interface State {

	void Encendido();
	void RecibirPedido();
	void Cobrar();
	void Entregar();
	void Apagado();
	
	void setEstado(Contexto maquina);
}
