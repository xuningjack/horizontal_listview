package com.example.android_horizontal_listview;

import java.util.ArrayList;
import java.util.List;

import com.example.adapter.HorizontalAdapter;
import com.example.widget.HorizontalListView;

import android.app.Activity;
import android.os.Bundle;


public class MainActivity extends Activity {

	private HorizontalListView mHorizontalListView;
	private HorizontalAdapter mAdapter;
	private List<String> mFakeData;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mHorizontalListView = (HorizontalListView)findViewById(R.id.hlv);
		mFakeData = getData();
		mAdapter = new HorizontalAdapter(mFakeData, getApplicationContext());
		mHorizontalListView.setAdapter(mAdapter);
	}

	public List<String> getData(){
		
		List<String> result = new ArrayList<String>();
		for(int i = 0; i < 10; i++){
			
			result.add("hello   " + i);
		}
		return result;
	}
	

}
