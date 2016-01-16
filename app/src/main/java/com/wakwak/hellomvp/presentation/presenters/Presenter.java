package com.wakwak.hellomvp.presentation.presenters;

/**
 * Created by Ryo on 2016/01/17.
 */
public interface Presenter {

    void onCreate();
    void onResume();
    void onCreateView();
    void onViewCreated();
    void onPause();
}
