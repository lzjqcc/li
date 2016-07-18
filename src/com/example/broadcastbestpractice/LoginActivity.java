package com.example.broadcastbestpractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends BaseActivity {
	private EditText accountEdit;
	private EditText password;
	private Button login;
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		accountEdit=(EditText)findViewById(R.id.account);
		password=(EditText)findViewById(R.id.password);
		login=(Button)findViewById(R.id.button);
		login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// TODO Auto-generated method stub
				String aString=accountEdit.getText().toString();
				String pString=password.getText().toString();
				if(aString.equals("") && pString.equals("")){
					Intent intent=new Intent(getApplicationContext(), MainActivity.class);
					startActivity(intent);
					finish();
				}else{
					Toast.makeText(getApplicationContext(), "acconut or password is invalid", Toast.LENGTH_SHORT).show();
				}
			}
		});
	}
}
