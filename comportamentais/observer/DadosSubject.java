package observer;

import java.util.ArrayList;

public class DadosSubject {
	ArrayList<DadosObserver> observers;
	Dados dados;
	
	public DadosSubject(){
		observers = new ArrayList<DadosObserver>();
	}
	
	public void attach(DadosObserver observer){
		observers.add(observer);
	}
	
	public void detach(DadosObserver observer){
		observers.remove(observer);
	}
	
	private void notificaObservers(){
		for(DadosObserver observer : observers){
			observer.update();
		}
	}
	
	public Dados getState(){
		return dados;
	}
	
	public void setState(Dados dados){
		this.dados = dados;
		notificaObservers();
	}
}
