package com.example.android.miwok;

/**
 * Created by EMASYS ND on 6/17/2017.
 */

public class Word {
    private String mEnglishWord;
    private String mMiwokWord;
    private int mResourceId;
    private int mAudioResourceId;




    public Word(String mEnglishWord, String mMiwokWord, int mResourceId, int mAudioResourceId) {
        this.mEnglishWord = mEnglishWord;
        this.mAudioResourceId = mAudioResourceId;
        this.mMiwokWord = mMiwokWord;
        this.mResourceId = mResourceId;

    }

    //constructor overloaded for phrases activity without images
    public Word(String mEnglishWord, String mMiwokWord, int mAudioResourceId) {
        this.mEnglishWord = mEnglishWord;
        this.mMiwokWord = mMiwokWord;
        this.mAudioResourceId = mAudioResourceId;


    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
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
