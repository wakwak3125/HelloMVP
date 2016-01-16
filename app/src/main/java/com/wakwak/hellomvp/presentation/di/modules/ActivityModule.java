package com.wakwak.hellomvp.presentation.di.modules;

import android.app.Activity;

import com.wakwak.hellomvp.presentation.di.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ryo on 2016/01/17.
 */
@Module
public class ActivityModule {
    private final Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides @PerActivity Activity mActivity() {
        return this.mActivity;
    }
}
