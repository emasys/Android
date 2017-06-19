package com.example.android.miwok;

/**
 * Created by EMASYS ND on 6/17/2017.
 */

public class Word {
    private String mEnglishWord;
    private String mMiwokWord;
    private int mResourceId;



    public Word(String mEnglishWord, String mMiwokWord, int mResourceId) {
        this.mEnglishWord = mEnglishWord;
        this.mMiwokWord = mMiwokWord;
        this.mResourceId = mResourceId;
    }

    //constructor overloaded for phrases activity without images
    public Word(String mEnglishWord, String mMiwokWord) {
        this.mEnglishWord = mEnglishWord;
        this.mMiwokWord = mMiwokWord;

    }

    public String getNumberColor(){
        return "#fd8e09";
    }

    public String getFamilyColor(){
        return "#379237";
    }

    public String getColorsColor(){
        return "#8800a0";
    }

    public int getmResourceId() {
        return mResourceId;
    }

    public String getmEnglishWord() {
        return mEnglishWord;
    }


    public String getmMiwokWord() {
        return mMiwokWord;
    }


}
