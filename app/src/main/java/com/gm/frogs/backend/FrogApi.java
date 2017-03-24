package com.gm.frogs.backend;


import com.gm.frogs.models.Frog;

import java.util.ArrayList;
import java.util.List;

public class FrogApi {

    private List<Frog> frogs;

    public FrogApi() {
        initDatabase();
    }

    private void initDatabase() {
        frogs = new ArrayList<>();
        frogs.add(new Frog(0, "Jumpy", "Green"));
        frogs.add(new Frog(1, "Squishy", "Blue"));
        frogs.add(new Frog(1, "Croaky", "Red"));
    }

    public List<Frog> getAllFrogs() {
        return frogs;
    }

    public Frog getFrog(int id) {
        for (Frog f : frogs) {
            if (id == f.id) {
                return f;
            }
        }
        return null;
    }
}
