package ca.kgb.simplerotation;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String SUM_RESULT = "1";
    private TextView mTextView;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView)findViewById(R.id.a_main_textview);
        mEditText = (EditText)findViewById(R.id.a_main_edittext);
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(SUM_RESULT,  Integer.parseInt(mTextView.getText().toString()));

        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null) {
            // Restore value of members from saved state
            mTextView.setText( savedInstanceState.getInt(SUM_RESULT) + "");
        } else {
            // Probably initialize members with default values for a new instance
        }
    }

    public void addToTextView(View view) {
        int textviewNum = Integer.parseInt(mTextView.getText().toString());
        int edittextNum = Integer.parseInt(mEditText.getText().toString());
        mTextView.setText( textviewNum + edittextNum + "");
    }
}
