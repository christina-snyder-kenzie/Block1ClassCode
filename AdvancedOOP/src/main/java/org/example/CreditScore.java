package org.example;

public enum CreditScore {
    BAD(300),
    FAIR(500),
    GOOD(650),
    EXCELLENT(800);

    private int lowestScore;

    private CreditScore(int lowestScore){
        this.lowestScore = lowestScore;
    }

    public int getLowestScore(){
        return lowestScore;
    }
}
