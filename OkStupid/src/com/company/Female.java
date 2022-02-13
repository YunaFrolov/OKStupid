package com.company;

public class Female extends Person {
    private String strHairColour;

    public Female(String strFullName, int intAge, String strProfession, String strDominantTrait, String strPreferredSex, int strPreferredMaxAge, String strPreferredProfession, String strPreferredTrait, String strHairColour ) {
        super(strFullName, "f", intAge, strProfession, strDominantTrait, strPreferredSex, strPreferredMaxAge, strPreferredProfession, strPreferredTrait);
        this.strHairColour = strHairColour;
    }
    //GETTERS
    public String getHairColour() {
        return strHairColour;
    }
    //SETTERS
    public void setHairColour(String newHairColour) {
        this.strHairColour =  newHairColour;
    }
}
