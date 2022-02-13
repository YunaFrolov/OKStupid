package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * This program reads a text file containing lines representing people with properties
 * The main goal is to find and sort the best matches between them
 * output: sorted from top-to-bottom list of best matches

 * @version 1

 * @author Yuna Almog
 */
public class Main {

    private static final String strFileName = "People.txt";

    public static void main(String[] args) {

        Person[] pPeople = GetPeopleFromFile(strFileName);

        ArrayList<Match> mSortMatches = new ArrayList<>(ScoreMatches(pPeople));

        mSortMatches.sort(Collections.reverseOrder());

        for (Match sortedMatch : mSortMatches) {
            System.out.println(sortedMatch.toString());
        }

    }

    /* This function is used to read the info from the text file */
    private static Person[] GetPeopleFromFile(String strFileName){
        try (Stream<String> stream = Files.lines(Paths.get(strFileName))) {

           return stream.map(Main::MapPersonLine).toArray(Person[]::new);

        }
        catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }

    /* This function is used to insert info of people from the text file */
    private static Person MapPersonLine(String strCurrentLine){
        String[] Properties = strCurrentLine.split(",");

        if(Properties[1].equals("m")){
            return new Male(Properties[0], Integer.parseInt(Properties[2]), Properties[3], Properties[4], Properties[5], Integer.parseInt(Properties[6]), Properties[7], Properties[8], Properties[9] );
        }else{
            return new Female(Properties[0], Integer.parseInt(Properties[2]), Properties[3], Properties[4], Properties[5], Integer.parseInt(Properties[6]), Properties[7], Properties[8], Properties[9] );
        }

    }

    /* This function is used to return the scores of all given matches */
    private static List<Match> ScoreMatches(Person[] pPeople){

        ArrayList<Match> alMatchPeople = new ArrayList<>();

        for (int i = 0; i < pPeople.length; i++) {
            for (int j = i+1; j < pPeople.length; j++) {
                int intCurrScore = CalculateScore(pPeople[i], pPeople[j]);
                Match mCurrMatch = new Match(pPeople[i].getFullName(), pPeople[j].getFullName(), intCurrScore);

                //add only if preferred gender matches, or there is a match at all
                if(intCurrScore!= -1 && intCurrScore!= 0 )
                    alMatchPeople.add(mCurrMatch);
            }
        }
        return alMatchPeople;
    }

    /* This function is used calculate the matching score between two given people */
    private static int CalculateScore(Person pPersonA, Person pPersonB){
        int intScore = 0;

        //if preferred gender doesn't match - no need for further calculation
        if(!pPersonA.getPreferredSex().equals(pPersonB.getSex()) || !pPersonB.getPreferredSex().equals(pPersonA.getSex()) )
            return -1;

        //compare ages
        if(pPersonA.getPreferredMaxAge() >= pPersonB.getAge())
            intScore++;
        if(pPersonB.getPreferredMaxAge() >= pPersonA.getAge())
            intScore++;

        //compare traits
        if(pPersonA.getPreferredTrait().equals(pPersonB.getDominantTrait()))
            intScore++;
        if(pPersonB.getPreferredTrait().equals(pPersonA.getDominantTrait()))
            intScore++;

        //compare professions
        if(pPersonA.getPreferredProfession().equals(pPersonB.getProfession()))
            intScore++;
        if(pPersonB.getPreferredProfession().equals(pPersonA.getProfession()))
            intScore++;

        return intScore;
    }

}

