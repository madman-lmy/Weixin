package com.example.weixin;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;

public class Welcome extends Activity implements Runnable{
	
	private boolean isFirstUse;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
		
		new Thread(this).start();
	}

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
			SharedPreferences preferences = getSharedPreferences("isFirstUse", MODE_WORLD_READABLE);
			isFirstUse = preferences.getBoolean("isFirstUse", true);
			
			if(isFirstUse){
				startActivity(new Intent(Welcome.this,MainActivity.class));
			}else{
				//Ô¤ÁôÒýµ¼Ò³Ãæactivity
			}
			
			Editor editor = preferences.edit();
			editor.putBoolean("isFirstUse", true);
			editor.commit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
