package com.example.android.miwok;

/**
 * Created by EMASYS ND on 6/17/2017.
 */

public class Word {
    private String mEnglishWord;
    private String mMiwokWord;

    public Word(String mEnglishWord, String mMiwokWord) {
        this.mEnglishWord = mEnglishWord;
        this.mMiwokWord = mMiwokWord;
    }

    public String getmEnglishWord() {
        return mEnglishWord;
    }


    public String getmMiwokWord() {
        return mMiwokWord;
    }


}
