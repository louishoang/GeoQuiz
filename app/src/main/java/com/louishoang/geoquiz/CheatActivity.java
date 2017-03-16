package com.louishoang.geoquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by louishoang on 2/14/17.
 */

public class CheatActivity extends Activity {
  public static final String EXTRA_ANSWER_IS_TRUE = "com.louishoang.geoquiz.answer_is_true";
  public static final String EXTRA_ANSWER_SHOWN = "com.louishoang.geoquiz.answer_shown";
  private boolean mAnswerIstrue;
  private Button  mShowAnswer;
  private TextView mAnswerTextView;

  private void setAnswerShownResult(boolean isAnswerShown) {
    Intent data = new Intent();
    data.putExtra(EXTRA_ANSWER_SHOWN, isAnswerShown);
    setResult(RESULT_OK, data);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_cheat);

    mAnswerIstrue = getIntent().getBooleanExtra(EXTRA_ANSWER_IS_TRUE, false);

    mAnswerTextView = (TextView)findViewById(R.id.answerTextView);

    mShowAnswer = (Button)findViewById(R.id.showAnswerButton);
    mShowAnswer.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if(mAnswerIstrue){
          mAnswerTextView.setText(R.string.true_button);
        }else{
          mAnswerTextView.setText(R.string.false_button);
        }
        setAnswerShownResult(true);
      }
    });
  }
}
