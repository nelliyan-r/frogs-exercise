package com.gm.frogs.frogs;


import com.gm.frogs.backend.ConditionManager;
import com.gm.frogs.backend.FrogApi;
import com.gm.frogs.models.Frog;

import java.util.ArrayList;
import java.util.List;

public class FrogPresenter {

    /**
     * We want these dependencies to be provided through Dagger using constructor injection.
     */
    private FrogApi frogApi;
    private FrogActivity view;
    private ConditionManager conditionManager;

    public FrogPresenter() {

    }

    void getAllFrogs() {
        List<Frog> frogs = new ArrayList<>();
        if (conditionManager.isConnected()) {
            frogs = frogApi.getAllFrogs();
            if (frogs.isEmpty()) {
                view.displayEmptyState();
            } else {
                view.displayAllFrogs(frogs);
            }
        } else {
            view.displayNetworkError();
        }

    }

}
