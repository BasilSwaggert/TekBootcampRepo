package com.company;

public class Main {

    public static void main(String[] args) {
//	    boolean gameOver = true;
//	    int score = 800;
//	    int levelCompleted = 5;
//	    int bonus = 100;

	    calculateScore(true, 800, 5, 100);

	    calculateScore(true, 10000, 8, 200);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//		boolean gameOver = true; Not needed, been replaced by the new method.
//		int score = 800;
//		int levelCompleted = 5;
//		int bonus = 100;

		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			System.out.println("Your final score was " + finalScore);
		}

		return -1; // indicates an error or value not found.qa

	}

}
