package com.example.weixin;

import android.os.Bundle;



import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.SubMenu;
import com.example.weixin.adapter.MainFragmentAdapter;
import com.viewpagerindicator.TabPageIndicator;

public class MainActivity extends SherlockFragmentActivity {
	private View mainActionBarView;
	private FragmentPagerAdapter adapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initActionBar();
		initView();
	}
	
	private void initView(){
		adapter = new MainFragmentAdapter(getSupportFragmentManager(), this);
		ViewPager pager = (ViewPager) findViewById(R.id.pager);
		pager.setAdapter(adapter);
		TabPageIndicator indicator = (TabPageIndicator) findViewById(R.id.indicator);
		indicator.setViewPager(pager);
	}

	private void initActionBar() {
		// �����Զ���actionbar
		getSupportActionBar().setDisplayShowCustomEnabled(true);
		getSupportActionBar().setDisplayShowTitleEnabled(false);
		// ����actionbar��ʾlogo
		getSupportActionBar().setDisplayShowHomeEnabled(false);

//		getSupportActionBar().setBackgroundDrawable(
//				getResources().getDrawable(R.drawable.title_bg));
		mainActionBarView = LayoutInflater.from(this).inflate(
				R.layout.main_action_bar, null);
		getSupportActionBar().setCustomView(mainActionBarView);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		MenuItem search = menu.add("search");
		search.setIcon(R.drawable.abs__ic_search);
		search.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
		
		SubMenu addMenu = menu.addSubMenu("add item");
		addMenu.add(0, 1, 0, "����Ⱥ��").setIcon(R.drawable.ofm_group_chat_icon);
		addMenu.add(0, 2, 0, "�������").setIcon(R.drawable.ofm_add_icon);
		addMenu.add(0, 3, 0, "��Ƶ����").setIcon(R.drawable.ofm_video_icon);
		addMenu.add(0, 4, 0, "ɨһɨ").setIcon(R.drawable.ofm_qrcode_icon);
		addMenu.add(0, 5, 0, "���շ���").setIcon(R.drawable.actionbar_camera_icon);

		MenuItem addItem = addMenu.getItem();
		addItem.setIcon(R.drawable.abs__ic_menu_share_holo_dark);
		addItem.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);

		SubMenu subMenu = menu.addSubMenu("action item");
		subMenu.add(0, 6, 0, "΢����:");
		subMenu.add(0, 7, 0, "�ҵ����").setIcon(R.drawable.ofm_photo_icon);
		subMenu.add(0, 8, 0, "�ҵ��ղ�").setIcon(R.drawable.ofm_collect_icon);
		subMenu.add(0, 9, 0, "�ҵ����п�").setIcon(R.drawable.ofm_mail_icon);
		subMenu.add(0, 10, 0, "����").setIcon(R.drawable.ofm_setting_icon);
		subMenu.add(0, 11, 0, "�������").setIcon(R.drawable.ofm_mail_icon);

		MenuItem menuItem = subMenu.getItem();
		menuItem.setIcon(R.drawable.abs__ic_menu_moreoverflow_holo_light);
		menuItem.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS
				| MenuItem.SHOW_AS_ACTION_WITH_TEXT);

		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		switch (item.getItemId()) {
		case 10:
			Toast.makeText(MainActivity.this, "����", Toast.LENGTH_LONG).show();
			break;

		default:
			break;
		}
		return true;
	}

}
