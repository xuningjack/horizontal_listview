package com.example.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android_horizontal_listview.R;

/**
 * 显示数据的adapter
 * @author Jack
 * @version 创建时间：2014年6月17日  下午5:12:08
 */
public class HorizontalAdapter extends BaseAdapter {

	private List<String> mList;
	private Context mContext;
	
    public HorizontalAdapter(List<String> mList, Context mContext) {
		super();
		this.mList = mList;
		this.mContext = mContext;
	}

	@Override
    public int getCount() {

    	if(mList != null){
    		
    		return mList.size();
    	}else{
    		
    		return 0;
    	}
    }

    @Override
    public Object getItem(int position) {
    	
    	if(mList != null){
    		
    		return mList.get(position);
    	}
    	return null;
    }

    @Override
    public long getItemId(int position) {
    	
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    	
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_rec_user, null);
            holder.item_avatar = (ImageView) convertView.findViewById(R.id.avatar);
            holder.item_name = (TextView) convertView.findViewById(R.id.name);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        if (mList != null && mList.get(position) != null) {
        	
        	holder.item_avatar.setImageResource(R.drawable.ic_launcher);
            holder.item_name.setText(mList.get(position));
        }
        return convertView;
    }

    class ViewHolder {
        ImageView          item_avatar;
        TextView           item_name;
    }
}