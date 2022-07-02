package com.eeshvardasikcm.onbasedlc;

import androidx.annotation.NonNull;
import androidx.collection.ArraySet;

class OffensiveTeam extends DiagramDrawable {
    private final ArraySet<Batter> RunnersOnBase = new ArraySet<Batter>(3);
    private final ArraySet<Batter> RunnersBattedIn = new ArraySet<Batter>(4);

    OffensiveTeam(@NonNull final String nameToSet, @NonNull final String commentToSet) {
        super(nameToSet, commentToSet);
        this.RunnersOnBase.add(new BaseRunner());
        final TrailingBaseRunner trailingBaseRunner =
                (TrailingBaseRunner) this.RunnersOnBase.valueAt(1);
        this.RunnersOnBase.add(new BaseRunner());
        final BaseRunner baseRunner =
                (BaseRunner) this.RunnersOnBase.valueAt(2);

    }
}