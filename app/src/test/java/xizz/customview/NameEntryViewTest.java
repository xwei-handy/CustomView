package xizz.customview;

import android.view.View;
import android.widget.EditText;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class,
		sdk = 19)
public class NameEntryViewTest {

	NameEntryView mNameEntryView;

	@Before
	public void setUp() throws Exception {
		mNameEntryView = new NameEntryView(RuntimeEnvironment.application);
		mNameEntryView.init("Xi Wei");
	}

	@Test
	public void shouldHaveFirstNameLabel() {
		ArrayList<View> views = new ArrayList<>();
		mNameEntryView.findViewsWithText(views, "First Name", View.FIND_VIEWS_WITH_TEXT);
		assertTrue(views.size() > 0);
	}

	@Test
	public void shouldHaveFirstNameEditTextWithCorrectName() {
		EditText firstnameEditText = (EditText) mNameEntryView.findViewById(R.id.firstname);
		assertNotNull(firstnameEditText);
		assertEquals("Xi", firstnameEditText.getText().toString());
	}

	@Test
	public void shouldHaveLastNameLabel() {
		ArrayList<View> views = new ArrayList<>();
		mNameEntryView.findViewsWithText(views, "Last Name", View.FIND_VIEWS_WITH_TEXT);
		assertTrue(views.size() > 0);
	}

	@Test
	public void shouldHaveLastNameEditTextWithCorrectName() {
		EditText lastnameEditText = (EditText) mNameEntryView.findViewById(R.id.lastname);
		assertNotNull(lastnameEditText);
		assertEquals("Wei", lastnameEditText.getText().toString());
	}

}
