package com.example.broadcastbestpractice;

import java.util.ArrayList;

import android.app.Activity;

public class ActivityCollector {
	public static ArrayList<Activity> activities=new ArrayList<Activity>();
	public static void addActivity(Activity acitvity){
		activities.add(acitvity);
	}
	public static void removeActivity(Activity activity){
		activities.remove(activity);
	}
	public static void finishAll(){
		for(Activity activity:activities){
			activity.finish();
		}
	}
}
