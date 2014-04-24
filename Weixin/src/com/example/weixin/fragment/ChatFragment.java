package com.example.weixin.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.actionbarsherlock.app.SherlockFragment;
import com.example.weixin.R;

public class ChatFragment extends SherlockFragment{
	
	public static ChatFragment newInstance(){
		ChatFragment chatFragment = new ChatFragment();
		return chatFragment;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.chat_fragment, null);
		return v;
	}
}
