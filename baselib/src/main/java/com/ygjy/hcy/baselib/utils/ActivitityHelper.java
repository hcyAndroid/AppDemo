package com.ygjy.hcy.baselib.utils;

import android.app.Activity;
import android.util.Log;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yanghs on 2017/7/3.
 */
public class ActivitityHelper {
    public static final int EXIT_APPLICATION = 0x0001;

    private LinkedList<Activity> mActs;
    private static ActivitityHelper instance = null;

    public LinkedList<Activity> getmActs() {
        return mActs;
    }

    private ActivitityHelper() {
        mActs = new LinkedList<Activity>();
    }

    public synchronized static ActivitityHelper getInstance() {
        if (instance == null) {
            instance = new ActivitityHelper();
        }
        return instance;
    }

    public void addActivity(Activity act) {
        synchronized (ActivitityHelper.this) {
            Log.i("=====:", act.getClass().getName());
            mActs.addFirst(act);
        }
    }

    public void removeActivity(Activity act) {
        synchronized (ActivitityHelper.this) {
            if (mActs != null && mActs.indexOf(act) >= 0) {
                act.finish();
                mActs.remove(act);
            }
        }
    }

    public Activity getTopActivity() {
        synchronized (ActivitityHelper.this) {
            return (mActs == null || mActs.size() <= 0) ? null : mActs.get(0);
        }
    }

    public Activity getSecondActivity() {
        synchronized (ActivitityHelper.this) {
            return (mActs == null || mActs.size() <= 1) ? null : mActs.get(1);
        }
    }

    public void close() {
        synchronized (ActivitityHelper.this) {
            Activity act;
            while (mActs.size() != 0) {
                act = mActs.poll();
                act.finish();
            }
        }
    }

    public void closeAll() {
        synchronized (ActivitityHelper.this) {
            Activity act;
            while (mActs.size() != 0) {
                act = mActs.poll();
                act.finish();
            }
        }
    }

    /**
     * 关闭其他activity，唯独排除activityClass指定的activity
     *
     * @param activityClass
     */
    public void closeExcept(Class<?> activityClass) {
        synchronized (ActivitityHelper.this) {
            Activity act;
            Iterator<Activity> activityIterator = mActs.iterator();
            while (activityIterator.hasNext()) {
                act = activityIterator.next();
                if (!act.getClass().getName().equals(activityClass.getName())) {
                    act.finish();
                    activityIterator.remove();
                }
            }
        }
    }

    /**
     * 关闭activityClass指定的activity
     *
     * @param activityClass
     */
    public void closeTarget(Class<?> activityClass) {
        synchronized (ActivitityHelper.this) {
            Activity act;
            Iterator<Activity> activityIterator = mActs.iterator();
            while (activityIterator.hasNext()) {
                act = activityIterator.next();
                if (act.getClass().getName().equals(activityClass.getName())) {
                    act.finish();
                    activityIterator.remove();
                }
            }
        }
    }


    /**
     * 关闭activityClass指定的activity集合
     *
     * @param activityClass
     */
    public void closeTargetList(List<Class<?>> activityClass) {
        synchronized (ActivitityHelper.this) {
            Activity act;
            Iterator<Activity> activityIterator = mActs.iterator();
            while (activityIterator.hasNext()) {
                act = activityIterator.next();
                for (int i = 0; i < activityClass.size(); i++) {
                    if (act.getClass().getName().equals(activityClass.get(i).getName())) {
                        act.finish();
                        activityIterator.remove();
                    }
                }

            }
        }
    }

    public ArrayList<Activity> getTargetActivity(Class<?> activityClass) {
        ArrayList<Activity> activities = new ArrayList<Activity>();
        synchronized (ActivitityHelper.this) {
            Activity act;
            int size = mActs.size();
            for (int i = 0; i < size; i++) {
                act = mActs.get(i);
                if (act.getClass().getName().equals(activityClass.getName())) {
                    activities.add(act);
                }
            }
        }

        return activities;
    }


    /**
     * 关闭所有的activity，唯独不关闭指定activity集
     */
    public void closeTargetExcept(List<String> activityClassName) {
        synchronized (ActivitityHelper.this) {
            Activity act;
            Iterator<Activity> activityIterator = mActs.iterator();
            while (activityIterator.hasNext()) {
                act = activityIterator.next();
                if (!activityClassName.contains(act.getClass().getName())) {
                    Log.e("=====", act.getClass().getName());
                    act.finish();
                    activityIterator.remove();
                }
            }
        }
    }

    /**
     * 关闭指定activity集
     */
    public void closeTarget(List<String> activityClassName) {
        synchronized (ActivitityHelper.this) {
            Activity act;
            Iterator<Activity> activityIterator = mActs.iterator();
            while (activityIterator.hasNext()) {
                act = activityIterator.next();
                if (activityClassName.contains(act.getClass().getName())) {
                    act.finish();
                    activityIterator.remove();
                }

            }
        }
    }


    //判断当前堆栈中是否存在某个activity
    public boolean isExist(Class<?> activityClass) {
        synchronized (ActivitityHelper.this) {
            Activity act;
            Iterator<Activity> activityIterator = mActs.iterator();
            while (activityIterator.hasNext()) {
                act = activityIterator.next();
                Log.e("=====", act.getClass().getName());
                if (act.getClass().getName().equals(activityClass.getName())) {
                    return true;
                }
            }
        }
        return false;
    }
}
