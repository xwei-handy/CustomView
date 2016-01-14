package xizz.customview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		NameEntryView view = (NameEntryView) findViewById(R.id.name_entry);
		view.init("Xi Wei");
	}
}
