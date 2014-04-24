package com.example.weixin.adapter;

import com.example.weixin.fragment.AddressBookFragment;
import com.example.weixin.fragment.ChatFragment;
import com.example.weixin.fragment.FoundFragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MainFragmentAdapter extends FragmentPagerAdapter{
	private String[] titleStr = {"聊天","发现","通讯录"};

	
	public MainFragmentAdapter(FragmentManager fm) {
		super(fm);
	}
	
	public MainFragmentAdapter(FragmentManager fm, Context context) {
		super(fm);
	}

	@Override
	public Fragment getItem(int position) {
		switch (position) {
		case 0:
			return ChatFragment.newInstance();
		case 1:
			return FoundFragment.newInstance();
		case 2:
			return AddressBookFragment.newInstance();
		}
		return null;
	}
	
	@Override
	public CharSequence getPageTitle(int position) {
		// TODO Auto-generated method stub
		return titleStr[position];
	}

	@Override
	public int getItemPosition(Object object) {
		// TODO Auto-generated method stub
		return POSITION_NONE;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return titleStr.length;
	}

}
