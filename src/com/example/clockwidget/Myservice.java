package com.example.clockwidget;

import java.util.Calendar;
import java.util.Date;


import android.app.Service;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.IBinder;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RemoteViews;

public class Myservice extends Service {
   //�K���ȃA�N�V������

	private static Integer[] numImage = new Integer[]{ R.drawable.bk0, R.drawable.bk1, R.drawable.bk2, R.drawable.bk3, 
		R.drawable.bk4, R.drawable.bk5, R.drawable.bk6, R.drawable.bk7, R.drawable.bk8, R.drawable.bk9, };

	@Override
	public void onStart(Intent intent, int startId) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		RemoteViews remoteViews = new RemoteViews(getPackageName(),R.layout.widget_main);
		//remoteViews.setTextViewText(R.id.textView1, new Date().toLocaleString());
		Log.d("Myservice",new Date().toLocaleString());
		Calendar date = Calendar.getInstance();
		Integer second = date.get(Calendar.SECOND);
		Integer secUD = second % 10;
		Integer secTD = second / 10;
		
		Integer minute = date.get(Calendar.MINUTE);
		Integer minUD = minute % 10;
		Integer minTD = minute / 10;
		
		Integer hour = date.get(Calendar.HOUR);
		Integer hrUD = hour % 10;
		Integer hrTD = hour / 10;
		
		//�\�̈ʂ̎�����imageView6�ɕ\��
		remoteViews.setImageViewResource(R.id.hrTenthsDigit, numImage[hrTD]);
		//��̈ʂ̎�����imageView5�ɕ\��
		remoteViews.setImageViewResource(R.id.hrUnitDigit, numImage[hrUD]);
				
		
		//�\�̈ʂ̕�����imageView4�ɕ\��
		remoteViews.setImageViewResource(R.id.minTenthsDigit, numImage[minTD]);
		//��̈ʂ̕�����imageView3�ɕ\��
		remoteViews.setImageViewResource(R.id.minUnitDigit, numImage[minUD]);
		
		
		//�\�̈ʂ̕b����imageView2�ɕ\��
		//remoteViews.setImageViewResource(R.id.secTenthsDigit, numImage[secTD]);
		//��̈ʂ̕b����imageView1�ɕ\��
		//remoteViews.setImageViewResource(R.id.secUnitDigit, numImage[secUD]);
		
		
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
