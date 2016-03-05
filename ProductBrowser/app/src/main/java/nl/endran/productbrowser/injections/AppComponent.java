/*
 * Copyright (c) 2016 by David Hardy. Licensed under the Apache License, Version 2.0.
 */

package nl.endran.productbrowser.injections;

import javax.inject.Singleton;

import dagger.Component;
import nl.endran.productbrowser.App;
import nl.endran.productbrowser.DetailActivity;
import nl.endran.productbrowser.MainActivity;
import nl.endran.productbrowser.fragments.OverviewFragmentPresenter;
import nl.endran.productbrowser.fragments.OverviewFragmentView;
import nl.endran.productbrowser.fragments.SkeletonFragmentPresenter;
import nl.endran.productbrowser.fragments.SkeletonFragmentView;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(App app);

    void inject(MainActivity activity);

    void inject(DetailActivity activity);

    SkeletonFragmentView getSkeletonFragmentView();

    SkeletonFragmentPresenter getSkeletonFragmentPresenter();

    OverviewFragmentView getOverviewFragmentView();

    OverviewFragmentPresenter getOverviewFragmentPresenter();
}
