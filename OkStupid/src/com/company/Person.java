package com.company;

public abstract class Person {
    private String strFullName;
    private String strSex;
    private int intAge;
    private String strProfession;
    private String strDominantTrait;
    private String strPreferredSex;
    private int intPreferredMaxAge;
    private String strPreferredProfession;
    private String strPreferredTrait;

    public Person(String strFullName, String strSex, int intAge, String strProfession, String strDominantTrait, String strPreferredSex, int intPreferredMaxAge, String strPreferredProfession, String strPreferredTrait) {
        this.strFullName = strFullName;
        this.strSex = strSex;
        this.intAge = intAge;
        this.strProfession = strProfession;
        this.strDominantTrait = strDominantTrait;
        this.strPreferredSex = strPreferredSex;
        this.intPreferredMaxAge = intPreferredMaxAge;
        this.strPreferredProfession = strPreferredProfession;
        this.strPreferredTrait = strPreferredTrait;
    }

    public String toString() {
        return strFullName + " " + strSex + " " + intAge + " " + strProfession + " " + strDominantTrait + " " + strPreferredSex + " " + intPreferredMaxAge + " " + strPreferredProfession + " " + strPreferredTrait ;
    }

    //GETTERS
    public String getFullName() {
        return strFullName;
    }
    public String getSex() {
        return strSex;
    }
    public int getAge() {
        return intAge;
    }
    public String getProfession() {
        return strProfession;
    }
    public String getDominantTrait() {
        return strDominantTrait;
    }
    public String getPreferredSex() {
        return strPreferredSex;
    }
    public int getPreferredMaxAge() {
        return intPreferredMaxAge;
    }
    public String getPreferredProfession() {
        return strPreferredProfession;
    }
    public String getPreferredTrait() {
        return strPreferredTrait;
    }


    //SETTERS
    public void setFullName(String newFullName) {
        this.strFullName = newFullName;
    }
    public void setSex(String newSex) {
        this.strSex = newSex;
    }
    public void setAge(int newAge) {
        this.intAge = newAge;
    }
    public void setProfession(String newProfession) {
        this.strProfession = newProfession;
    }
    public void setDominantTrait(String newDominantTrait) {
        this.strDominantTrait = newDominantTrait;
    }
    public void setPreferredSex(String newPreferredSex) {
        this.strPreferredSex = newPreferredSex;
    }
    public void setPreferredMaxAge(int newPreferredMaxAge) {
        this.intPreferredMaxAge = newPreferredMaxAge;
    }
    public void setPreferredProfession(String newPreferredProfession) {
        this.strPreferredProfession = newPreferredProfession;
    }
    public void setPreferredTrait(String newPreferredTrait) {
        this.strPreferredTrait = newPreferredTrait;
    }


}
