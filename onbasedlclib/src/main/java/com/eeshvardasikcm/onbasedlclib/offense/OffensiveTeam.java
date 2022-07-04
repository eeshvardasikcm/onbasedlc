package com.eeshvardasikcm.onbasedlclib.offense;

import androidx.annotation.NonNull;
import androidx.collection.ArraySet;

import com.eeshvardasikcm.onbasedlclib.diagram.Drawable;

public class OffensiveTeam extends Drawable {
    private final ArraySet<Batter> RunnersOnBase = new ArraySet<Batter>(3);
    private final ArraySet<Batter> RunnersBattedIn = new ArraySet<Batter>(4);

    private OffensiveTeam(@NonNull final String nameToSet, @NonNull final String commentToSet) {
        super(nameToSet, commentToSet);
        this.RunnersOnBase.add(new BaseRunner());
        final TrailingBaseRunner trailingBaseRunner =
                (TrailingBaseRunner) this.RunnersOnBase.valueAt(1);
        this.RunnersOnBase.add(new BaseRunner());
        final BaseRunner baseRunner =
                (BaseRunner) this.RunnersOnBase.valueAt(2);
    }

    @NonNull
    public static OffensiveTeam createOffensiveTeam(
            @NonNull final String nameToSet, @NonNull final String commentToSet) {
        return new OffensiveTeam(nameToSet, commentToSet);
    }
}