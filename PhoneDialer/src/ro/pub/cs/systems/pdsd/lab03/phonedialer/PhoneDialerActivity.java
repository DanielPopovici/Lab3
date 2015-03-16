package ro.pub.cs.systems.pdsd.lab03.phonedialer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class PhoneDialerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);
        
        final EditText text = (EditText) findViewById(R.id.editText);
        
        Button btn0 = (Button)findViewById(R.id.button0);
        
        btn0.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				text.getText().append('0');
			}
		});
        
        Button btn1 = (Button)findViewById(R.id.button1);
        
        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				text.getText().append('1');
			}
		});
        
        Button btn2 = (Button)findViewById(R.id.button2);
        
        btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				text.getText().append('2');
			}
		});
        
        Button btn3 = (Button)findViewById(R.id.button3);
        
        btn3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				text.getText().append('3');
			}
		});
        
        Button btn4 = (Button)findViewById(R.id.button4);
        
        btn4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				text.getText().append('4');
			}
		});
        
        Button btn5 = (Button)findViewById(R.id.button5);
        
        btn5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				text.getText().append('5');
			}
		});
        
        Button btn6 = (Button)findViewById(R.id.button6);
        
        btn6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				text.getText().append('6');
			}
		});
        
        Button btn7 = (Button)findViewById(R.id.button7);
        
        btn7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				text.getText().append('7');
			}
		});
        
        Button btn8 = (Button)findViewById(R.id.button8);
        
        btn8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				text.getText().append('8');
			}
		});
        
        Button btn9 = (Button)findViewById(R.id.button9);
        
        btn9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				text.getText().append('9');
			}
		});
        
        Button btnStar = (Button)findViewById(R.id.buttonStar);
        
        btnStar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				text.getText().append('*');
			}
		});
        
        Button btnHashtag = (Button)findViewById(R.id.buttonHashtag);
        
        btnHashtag.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				text.getText().append('#');
			}
		});
        
        Button btnErase = (Button)findViewById(R.id.buttonErase);
        
        btnErase.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				if(text.getText().length() == 0){
					
					return;
				}
				
				text.getText().replace(text.getText().length() - 1, text.getText().length(), "");
			}
		});
        
        Button btnCall = (Button)findViewById(R.id.buttonCall);
        
        btnCall.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				if(text.getText().length() == 0){
					
					return;
				}
				
				Intent intent = new Intent(Intent.ACTION_CALL);
				intent.setData(Uri.parse("tel: "+text.getText()));
				startActivity(intent);
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.phone_dialer, menu);
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
