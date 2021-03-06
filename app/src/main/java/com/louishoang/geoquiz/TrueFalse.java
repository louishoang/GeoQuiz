package com.louishoang.geoquiz;

/**
 * Created by louishoang on 2/8/17.
 */

public class TrueFalse {
  private int mQuestion;
  private boolean mTrueQuestion;

  public TrueFalse(int question, boolean trueQuestion){
    mQuestion = question;
    mTrueQuestion = trueQuestion;
  }

  public boolean isTrueQuestion() {
    return mTrueQuestion;
  }

  public void setTrueQuestion(boolean trueQuestion) {
    mTrueQuestion = trueQuestion;
  }

  public int getQuestion() {
    return mQuestion;
  }

  public void setQuestion(int question) {
    mQuestion = question;
  }
}
