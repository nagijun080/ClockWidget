package com.example.clockwidget;

import java.util.Date;


import android.app.Service;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.widget.RemoteViews;

public class Myservice extends Service {
   //�K���ȃA�N�V������


	@Override
	public void onStart(Intent intent, int startId) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		RemoteViews remoteViews = new RemoteViews(getPackageName(),R.layout.widget_main);
		remoteViews.setTextViewText(R.id.textView1, new Date().toLocaleString());
		
		ComponentName thisWidget = new ComponentName(this, ClockWidget.class);
		AppWidgetManager manager = AppWidgetManager.getInstance(this);
		manager.updateAppWidget(thisWidget, remoteViews);
	}

	


	@Override
	public IBinder onBind(Intent arg0) {
	// TODO �����������ꂽ���\�b�h�E�X�^�u
		return null;
	}
	
}
