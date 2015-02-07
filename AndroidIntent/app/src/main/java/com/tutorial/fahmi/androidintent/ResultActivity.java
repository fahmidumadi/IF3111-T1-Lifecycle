package com.tutorial.fahmi.androidintent;

/**
 * Created by Fahmi on 07-Feb-15.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class ResultActivity extends Activity{
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);
        Bundle extras = getIntent().getExtras();
        if(extras == null){
            return;
        }
        String value1 = extras.getString("Value1");
        if(value1 != null){
            TextView text1 = (TextView) findViewById(R.id.displayintentextra);
            text1.setText(value1);
        }
    }
    public void onClick(View view) {
        finish();
    }
    @Override
    public void finish() {

        // TODO 1 create new Intent
        Intent data = new Intent();

        // TODO 2 read the data of the EditText field
        EditText text2 = (EditText) findViewById(R.id.returnValue);

        // TODO 3 put the text from EditText
        // as String extra into the intent
        String retValue = text2.getText().toString();
        data.putExtra("returnKey", retValue);
        // TODO 4 use setResult(RESULT_OK, intent);
        setResult(RESULT_OK, data);

        super.finish();
    }
}
