package com.ravi.learning.abstractfinal;

public abstract class Employment {
    abstract void applyforJob();

    abstract void pepareForInterview();

    abstract void getOfferLetter();

    abstract void joinCompany();

    final void becomeEmployee(){
        applyforJob();
        pepareForInterview();
        getOfferLetter();
        joinCompany();
    }
}
