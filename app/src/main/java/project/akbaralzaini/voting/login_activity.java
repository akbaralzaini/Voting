
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		login
	 *	@date 		0
	 *	@title 		Login
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.xd
	 *
	 */
	

package exportkit.xd;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class login_activity extends Activity {

	
	private View _bg__login;
	private ImageView drawkit_grape_pack_illustration_16;
	private View rectangle_33;
	private TextView janedoe123_email_com;
	private TextView email_ek1;
	private ImageView path_64;
	private ImageView path_65;
	private View rectangle_33_ek1;
	private TextView _________________________;
	private TextView password_ek1;
	private View ellipse_18;
	private ImageView path_66;
	private View ellipse_19;
	private View ellipse_20;
	private View ellipse_21;
	private TextView login_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);

		
		_bg__login = (View) findViewById(R.id._bg__login);
		drawkit_grape_pack_illustration_16 = (ImageView) findViewById(R.id.drawkit_grape_pack_illustration_16);
		rectangle_33 = (View) findViewById(R.id.rectangle_33);
		janedoe123_email_com = (TextView) findViewById(R.id.janedoe123_email_com);
		email_ek1 = (TextView) findViewById(R.id.email_ek1);
		path_64 = (ImageView) findViewById(R.id.path_64);
		path_65 = (ImageView) findViewById(R.id.path_65);
		rectangle_33_ek1 = (View) findViewById(R.id.rectangle_33_ek1);
		_________________________ = (TextView) findViewById(R.id._________________________);
		password_ek1 = (TextView) findViewById(R.id.password_ek1);
		ellipse_18 = (View) findViewById(R.id.ellipse_18);
		path_66 = (ImageView) findViewById(R.id.path_66);
		ellipse_19 = (View) findViewById(R.id.ellipse_19);
		ellipse_20 = (View) findViewById(R.id.ellipse_20);
		ellipse_21 = (View) findViewById(R.id.ellipse_21);
		login_ek1 = (TextView) findViewById(R.id.login_ek1);
	
		
		login_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home___1_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	