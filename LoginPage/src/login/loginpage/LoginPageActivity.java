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
                
//        类型转换
        serviceTreaty = (TextView) findViewById(R.id.file);
        
//        绑定监听事件
        serviceTreaty.setOnClickListener(new OnClickListener() {
			
//			点击事件
        	public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog();
			}
		});
        
        
    }
    
//    定义弹出框函数
    private void showDialog() {
    	AlertDialog.Builder builder = new AlertDialog.Builder(this)
//    	设置对话框标题
	    	.setTitle("用户协议")
	    	.setMessage("这是用户协议呀这是服务协议……我是来占位置的啊我是来占位置的哈哈哈哈哈哈……");
//    	为对话框添加确定按钮
    	setPositiveButton(builder)
    		.create()
    		.show();
//    	为对话框添加取消按钮
    	/*setNegativeButton(builder)
    		.create()
    		.show();*/
    } 
    
    private AlertDialog.Builder setPositiveButton(AlertDialog.Builder builder){
    	return builder.setPositiveButton("确定", new DialogInterface.OnClickListener()
    	{
    		public void onClick(DialogInterface dialog, int which){
    			dialog.dismiss();
    		}
    	});
    }	
	/*private AlertDialog.Builder setNegativeButton(AlertDialog.Builder builder){
		return builder.setNegativeButton("取消", new DialogInterface.OnClickListener(){
    		public void onClick(DialogInterface dialog, int which){
    			dialog.dismiss();
    		}
    	});	
	}*/
}