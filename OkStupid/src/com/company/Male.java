package com.company;

public class Male extends Person {
    private String strHeight;

    public Male(String strFullName, int intAge, String strProfession, String strDominantTrait, String strPreferredSex, int strPreferredMaxAge, String strPreferredProfession, String strPreferredTrait, String strHeight) {
        super(strFullName, "m", intAge, strProfession, strDominantTrait, strPreferredSex, strPreferredMaxAge, strPreferredProfession, strPreferredTrait);
        this.strHeight = strHeight;
    }
    //GETTERS
    public String getHeight() {
        return strHeight;
    }
    //SETTERS
    public void setHeight(String newHeight) {
        this.strHeight =  newHeight;
    }
}
