package xizz.customview;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.FrameLayout;

import butterknife.Bind;
import butterknife.ButterKnife;

public class NameEntryView extends FrameLayout {

	@Bind(R.id.firstname)
	EditText mFirstnameEditText;
	@Bind(R.id.lastname)
	EditText mLastnameEditText;

	public NameEntryView(Context context) {
		super(context);
	}

	public NameEntryView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public NameEntryView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	@TargetApi(21)
	public NameEntryView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
		super(context, attrs, defStyleAttr, defStyleRes);
	}

	public void init(String fullname) {
		inflate(getContext(), R.layout.view_name_entry, this);
		ButterKnife.bind(this);
		String[] names = fullname.split(" ");

		if (names.length >= 2) {
			mFirstnameEditText.setText(names[0]);
			mLastnameEditText.setText(names[1]);
		}
	}
}
