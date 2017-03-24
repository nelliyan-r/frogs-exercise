package com.gm.frogs.frogs;

import dagger.Component;


@Component(modules = FrogsPresenterModule.class)
public interface FrogsComponent {

    void inject(FrogActivity activity);

}
