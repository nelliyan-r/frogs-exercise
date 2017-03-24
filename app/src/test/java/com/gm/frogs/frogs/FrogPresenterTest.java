package com.gm.frogs.frogs;

import com.gm.frogs.backend.ConditionManager;
import com.gm.frogs.backend.FrogApi;

import org.junit.Before;
import org.mockito.MockitoAnnotations;


public class FrogPresenterTest {

    FrogApi frogApi;
    FrogActivity view;
    ConditionManager conditionManager;

    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);


    }


}