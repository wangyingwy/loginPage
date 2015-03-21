package login.loginpage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class LoginPageActivity extends Activity {
	/** Called when the activity is first created. */

	TextView serviceTreaty;

	Button btnBig;
	Button btnSmall1;
	Button btnSmall2;
	Button btnSmall3;

	boolean isOpen = false;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);

		// ����ת��
		serviceTreaty = (TextView) findViewById(R.id.file);

		// �󶨼����¼�
		serviceTreaty.setOnClickListener(new OnClickListener() {

			// ����¼�
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog();
			}
		});

		btnBig = (Button) findViewById(R.id.big);
		btnSmall1 = (Button) findViewById(R.id.small1);
		btnSmall2 = (Button) findViewById(R.id.small2);
		btnSmall3 = (Button) findViewById(R.id.small3);

		btnBig.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				showSmallBtn();
			}
		});

	}

	// ���嵯������
	private void showDialog() {
		AlertDialog.Builder builder = new AlertDialog.Builder(this)
		// ���öԻ������
				.setTitle("�û�Э��").setMessage(
						"�����û�Э��ѽ���Ƿ���Э�顭��������ռλ�õİ�������ռλ�õĹ���������������");
		// Ϊ�Ի������ȷ����ť
		setPositiveButton(builder).create().show();
	}

	private AlertDialog.Builder setPositiveButton(AlertDialog.Builder builder) {
		return builder.setPositiveButton("ȷ��",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						dialog.dismiss();
					}
				});
	}

	private void showSmallBtn() {

		if (isOpen == false) {
			isOpen = true;
			btnSmall1.setVisibility(View.VISIBLE);
			btnSmall2.setVisibility(View.VISIBLE);
			btnSmall3.setVisibility(View.VISIBLE);
		} else {
			isOpen = false;
			btnSmall1.setVisibility(View.INVISIBLE);
			btnSmall2.setVisibility(View.INVISIBLE);
			btnSmall3.setVisibility(View.INVISIBLE);
		}
	}
}