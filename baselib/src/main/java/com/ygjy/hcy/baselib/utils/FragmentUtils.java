package com.ygjy.hcy.baselib.utils;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * @创建人：hcy
 * @创建时间：2019/4/1
 * @作用描述：Function
 * @email:384317693@qq.com
 **/
public class FragmentUtils {

    /**
     * 让某个位置上的fragment显示
     * @param fragmentManager
     * @param position
     * @param fragments
     * @param IdRes
     */
    public static void showFragmentByPosition(FragmentManager fragmentManager, int position, Fragment[] fragments,int IdRes) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();//开启事务
        //隐藏所有的fragment
        for (int i = 0; i < fragments.length; i++) {
            fragmentTransaction.hide(fragments[i]);
        }
        //显示某个位置上的fragment
        if (!fragments[position].isAdded()) {
            fragmentTransaction.add(IdRes,fragments[position]);
        }
        fragmentTransaction.show(fragments[position]);
        fragmentTransaction.commit();//提交事务
    }
}
