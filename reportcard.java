package com.example.android.miwok;

/**
 * Created by hacerkubra on 3.04.2018.
 */

public class reportcard {
    int mTurkceNot, mIngilizceNot, mMatNot, mFizikNot,mKimyaNot;

    /**
     * ReportCard objesi oluştur
     *
     * @param TurkceNot Turkish grade
     *
     * @param IngilizceNot English grade
     *
     * @param MatNot Math grade
     *
     * @param FizikNot  physics grade
     *
     * @param KimyaNot chemistry grade
     */
    public reportcard(int TurkceNot,int IngilizceNot, int MatNot,int FizikNot, int KimyaNot) {
        mTurkceNot=TurkceNot;
        mIngilizceNot=IngilizceNot;
        mMatNot=MatNot;
        mFizikNot=FizikNot;
        mKimyaNot=KimyaNot;
    }

    /**
     * Türkçe notunu getir
     */
    public int getmTurkceNot(){return mTurkceNot;}

    /**
     * Ingilizce notunu getir
     */
    public int getmIngilizceNot(){return mIngilizceNot;}

    /**
     * Matematik notunu getir
     */
    public int getmMatNot(){return mMatNot;}

    /**
     * Fizik notunu getir
     */
    public int getmFizikNot(){return mFizikNot;}

    /**
     * Kimya notunu getir
     */
    public int getmKimyaNot(){return mKimyaNot;}

    public String toString() {
        String mesaj;
        mesaj="Name : Kubra\n";
        mesaj +="Turkce notu =" + mTurkceNot;
        mesaj+="\nIngilizce notu="+ mIngilizceNot;
        mesaj+="\nMatematik notu="+ mMatNot;
        mesaj+="\nFizik notu="+ mFizikNot;
        mesaj+="\nKimya notu="+ mKimyaNot;

        return mesaj;
    }
}
