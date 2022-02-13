package com.company;

public record Match(String strFullNamePersonA, String strFullNamePersonB, int intMatchingScore) implements Comparable<Match> {

    public String toString() {
        return strFullNamePersonA + " and " + strFullNamePersonB + " match with " + intMatchingScore + " points!";
    }

    //HELPER
    /* This function is used to compare the score of two people */
    public int compareTo(Match matchToCompare) {
        return Integer.compare(this.intMatchingScore, matchToCompare.intMatchingScore);
    }
}
