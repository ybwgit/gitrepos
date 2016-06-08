package com.msquirrel.adapter;

import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import com.msquirrel.bean.UserInfo;
import com.msquirrel.ui.R;
import com.msquirrel.widget.NoScrollGridView;

public class WeChatAdapter extends BaseAdapter {

	private List<UserInfo> mList;
	private Context mContext;

	public WeChatAdapter(Context _context) {
		this.mContext = _context;
	}

	public void setData(List<UserInfo> _list) {
		this.mList = _list;
	}

	@Override
	public int getCount() {
		return mList.size();
	}

	@Override
	public UserInfo getItem(int position) {
		return mList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = LayoutInflater.from(mContext).inflate(
					R.layout.friends_circle_item, parent, false);
			holder.gridView = (NoScrollGridView) convertView
					.findViewById(R.id.gridView);
			convertView.setTag(holder);
		} else
			holder = (ViewHolder) convertView.getTag();

		UserInfo mUserInfo = getItem(position);
		if (mList != null && mList.size() > 0) {
			holder.gridView.setVisibility(View.VISIBLE);
			holder.gridView.setAdapter(new MyGridAdapter(mUserInfo.getUi(),
					mContext));
			holder.gridView
					.setOnItemClickListener(new AdapterView.OnItemClickListener() {
						@Override
						public void onItemClick(AdapterView<?> parent,
								View view, int position, long id) {
							// imageBrower(position,bean.urls);
						}
					});
		}
		return convertView;
	}

	public class ViewHolder {
		LinearLayout mContentimg;
		NoScrollGridView gridView;
	}

}
