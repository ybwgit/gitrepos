package com.msquirrel.ui;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import com.msquirrel.adapter.WeChatAdapter;
import com.msquirrel.bean.UserImgs;
import com.msquirrel.bean.UserInfo;

public class MainActivity extends Activity {

	private ListView mListView = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mListView = (ListView) findViewById(R.id.lv_main);
		mListView.addHeaderView(getheadView());
		// mListView.setDividerHeight(0);
		setData();
	}

	
	private void setData() {
		List<UserInfo> mList = new ArrayList<>();
		UserInfo mUserInfo = new UserInfo();
		UserImgs m = new UserImgs();
		m.setUrls("http://m1.img.srcdd.com/farm2/d/2011/0817/01/5A461954F44D8DC67A17838AA356FE4B_S64_64_64.JPEG");
		mUserInfo.getUi().add(m);
		mList.add(mUserInfo);
		//---------------------------------------------
		UserInfo mUserInfo2 = new UserInfo();
		UserImgs m2 = new UserImgs();
		m2.setUrls("http://m1.img.srcdd.com/farm2/d/2011/0817/01/5A461954F44D8DC67A17838AA356FE4B_S64_64_64.JPEG");
		mUserInfo2.getUi().add(m2);
		UserImgs m21 = new UserImgs();
		m21.setUrls("http://m1.img.srcdd.com/farm2/d/2011/0817/01/5A461954F44D8DC67A17838AA356FE4B_S64_64_64.JPEG");
		mUserInfo2.getUi().add(m21);
		mList.add(mUserInfo2);	

		WeChatAdapter mWeChatAdapter = new WeChatAdapter(this);
		mWeChatAdapter.setData(mList);
		mListView.setAdapter(mWeChatAdapter);
	}

	private View getheadView() {
		View view = LayoutInflater.from(MainActivity.this).inflate(
				R.layout.friends_circle_head, null);
		return view;
	}

}
