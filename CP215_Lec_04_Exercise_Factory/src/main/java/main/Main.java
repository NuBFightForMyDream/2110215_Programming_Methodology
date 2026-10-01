package main;
import java.util.ArrayList;

import model.*;

public class Main {
	
	// fields
	public static ArrayList<Worker> workers = new ArrayList<Worker>() ;
	
	public static void produce(){
		// loop each Worker in workers then trigger each worker
		for (Worker eachWorker : workers) {
			eachWorker.work();
			trigger(eachWorker);
		}
	}
	
	public static void trigger(Worker w){
		if (w instanceof QualityChecker) {
			// cast to QC then increase stress
			((QualityChecker) w).increaseStress();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bot A = new MaterialProcessor();
		Bot B = new ProductAssembler();
		Bot C = new Packager();
		QualityChecker D= new QualityChecker();
		QualityChecker E= new QualityChecker();
		
		workers.add(A);workers.add(B);workers.add(C);workers.add(D);workers.add(E);
		
		while(Bot.material>0){
			produce();
		}
		System.out.println("Total Product today =" + Bot.finishedProduct);
		
	}

}
