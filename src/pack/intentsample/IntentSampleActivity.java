package pack.intentsample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class IntentSampleActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_intent_sample);
		// buttonを取得
		Button btnDisp = (Button)findViewById(R.id.btnDisp);
        btnDisp.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("pack.intentsample", "pack.intentsample.SubActivity");
                startActivity(intent);
            }
        });

        // buttonを取得
        Button btnDisp1 =(Button)findViewById(R.id.btnDisp1);
        btnDisp1.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		// The 画面を起動
        		Intent intent = new Intent();
        		intent.setClassName("pack.intentsample","pack.intentsample.TheActivity");
        		startActivity(intent);
        	}
        });

        // buttonを取得
        Button btnDisp2 =(Button)findViewById(R.id.btnDisp2);
        btnDisp2.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		// For 画面を起動
        		Intent intent = new Intent();
        		intent.setClassName("pack.intentsample","pack.intentsample.ForActivity");
        		startActivity(intent);
        	}
        });
        // checkboxを取得
        CheckBox checkbox =(CheckBox)findViewById(R.id.cbox);

        boolean isChecked = checkbox.isChecked();

        EditText editText = (EditText) findViewById(R.id.edittext);
     // edittextのテキストを設定
        editText.setText("テスト");
     // edittextのテキストを全選択
        editText.selectAll();
     // edittextのテキストを取得
        String text = editText.getText().toString();
        Toast.makeText(this, text, Toast.LENGTH_LONG);
    }


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.intent_sample, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
