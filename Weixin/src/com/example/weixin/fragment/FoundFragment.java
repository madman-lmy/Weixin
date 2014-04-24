package com.example.weixin.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.actionbarsherlock.app.SherlockFragment;
import com.example.weixin.R;

public class FoundFragment extends SherlockFragment{
	
	public static FoundFragment newInstance(){
		FoundFragment foundFragment = new FoundFragment();
		return foundFragment;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.found_fragment, null);
		return v;
	}
}
