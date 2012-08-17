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
		Integer seFirst = second % 10;
		Integer seSecond = second / 10;
		
		Integer minute = date.get(Calendar.MINUTE);
		Integer miFirst = minute % 10;
		Integer miSecond = minute / 10;
		
		Integer hour = date.get(Calendar.HOUR);
		Integer hoFirst = hour % 10;
		Integer hoSecond = hour / 10;
		
		//�\�̈ʂ̎�����imageView6�ɕ\��
		remoteViews.setImageViewResource(R.id.imageView6, numImage[hoSecond]);
		//��̈ʂ̎�����imageView5�ɕ\��
		remoteViews.setImageViewResource(R.id.imageView5, numImage[hoFirst]);
				
		
		//�\�̈ʂ̕�����imageView4�ɕ\��
		remoteViews.setImageViewResource(R.id.imageView4, numImage[miSecond]);
		//��̈ʂ̕�����imageView3�ɕ\��
		remoteViews.setImageViewResource(R.id.imageView3, numImage[miFirst]);
		
		
		//�\�̈ʂ̕b����imageView2�ɕ\��
		remoteViews.setImageViewResource(R.id.imageView2, numImage[seSecond]);
		//��̈ʂ̕b����imageView1�ɕ\��
		remoteViews.setImageViewResource(R.id.imageView1, numImage[seFirst]);
		
		
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
