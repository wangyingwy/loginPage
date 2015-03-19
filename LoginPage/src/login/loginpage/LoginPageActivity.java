package login.loginpage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.TextView;

public class LoginPageActivity extends Activity {
    /** Called when the activity is first created. */
	
	TextView serviceTreaty;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);       
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
                
//        ����ת��
        serviceTreaty = (TextView) findViewById(R.id.file);
        
//        �󶨼����¼�
        serviceTreaty.setOnClickListener(new OnClickListener() {
			
//			����¼�
        	public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog();
			}
		});
        
        
    }
    
//    ���嵯������
    private void showDialog() {
    	AlertDialog.Builder builder = new AlertDialog.Builder(this)
//    	���öԻ������
	    	.setTitle("�û�Э��")
	    	.setMessage("�����û�Э��ѽ���Ƿ���Э�顭��������ռλ�õİ�������ռλ�õĹ���������������");
//    	Ϊ�Ի������ȷ����ť
    	setPositiveButton(builder)
    		.create()
    		.show();
//    	Ϊ�Ի������ȡ����ť
    	/*setNegativeButton(builder)
    		.create()
    		.show();*/
    } 
    
    private AlertDialog.Builder setPositiveButton(AlertDialog.Builder builder){
    	return builder.setPositiveButton("ȷ��", new DialogInterface.OnClickListener()
    	{
    		public void onClick(DialogInterface dialog, int which){
    			dialog.dismiss();
    		}
    	});
    }	
	/*private AlertDialog.Builder setNegativeButton(AlertDialog.Builder builder){
		return builder.setNegativeButton("ȡ��", new DialogInterface.OnClickListener(){
    		public void onClick(DialogInterface dialog, int which){
    			dialog.dismiss();
    		}
    	});	
	}*/
}