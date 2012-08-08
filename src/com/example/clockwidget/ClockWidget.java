package com.example.clockwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ClockWidget extends AppWidgetProvider {
	
	private final String TAG = "WidgetSample";

	@Override
	public void onDeleted(Context context, int[] appWidgetIds) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Log.d(TAG, "onDeleted");
		super.onDeleted(context, appWidgetIds);
	}

	@Override
	public void onDisabled(Context context) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Log.d(TAG,"onDisabled");
		super.onDisabled(context);
	}

	@Override
	public void onEnabled(Context context) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Log.d(TAG,"onEnabled");
		super.onEnabled(context);
	}

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Log.d(TAG,"onReceive");
		super.onReceive(context, intent);
	}

	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] appWidgetIds) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Log.d(TAG,"onUpdate");
		super.onUpdate(context, appWidgetManager, appWidgetIds);
	}
	

}
