package com.example.danilo.appdebts.classes;

/**
 * Created by aluno on 27/06/19.
 */

public class Debts {
    private long mId;
    private Category mCategory;
    private float mValue;
    private String mDescription;
    private String mpaymentDate;
    private String mpayDate;

    public long getId() {
        return mId;
    }

    public void setId(long id) {
        mId = id;
    }

    public Category getCategory() {
        return mCategory;
    }

    public void setCategory(Category category) {
        mCategory = category;
    }

    public float getValue() {
        return mValue;
    }

    public void setValue(float value) {
        mValue = value;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getMpaymentDate() {
        return mpaymentDate;
    }

    public void setMpaymentDate(String mpaymentDate) {
        this.mpaymentDate = mpaymentDate;
    }

    public String getMpayDate() {
        return mpayDate;
    }

    public void setMpayDate(String mpayDate) {
        this.mpayDate = mpayDate;
    }

}
