package com.empty.binpacking;

public class BinPacking {

	public static void main(String[] args) {
		int elements[] = {5, 3, 2, 6, 3, 1, 8, 7, 1, 2, 4, 1, 6, 2, 3, 4, 5, 2, 3, 2, 6, 1, 1, 8, 7, 1, 2, 4, 1, 2, 2, 3, 4, 5, 2, 3, 2, 6, 1, 1, 8, 7, 1, 2, 4, 1, 1, 2, 3, 4, 5, 2, 3, 2, 6, 1, 1, 8, 7, 1, 2, 4, 7, 1, 2, 3, 4, 5, 2, 3, 5, 6, 1, 1, 8, 7, 1, 2, 4, 1, 1, 2, 3, 4, 5, 2 };
		
		Generation gen = Generation.initFirstGeneration(Element.intArrToList(elements), 100);
		gen.countFitness();
		
		for(int i = 0; i < 100; i++){
			gen.selection();
			gen.generateNextGeneration();
			gen.addMutations();
			gen.countFitness();
			System.out.println("Best fintess in generation ~"+gen.getGenerationNumber()+": "+gen.getBestFitValue() + " with " + gen.bestBinsCount + " used. "+ gen.allGens()/*gen.allFits()*/);
		}

	}

}
