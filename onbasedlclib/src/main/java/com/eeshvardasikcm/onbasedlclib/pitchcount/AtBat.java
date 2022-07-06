package com.eeshvardasikcm.onbasedlclib.pitchcount;

import androidx.annotation.NonNull;
import androidx.collection.ArraySet;

import com.eeshvardasikcm.onbasedlclib.diagram.Drawable;

public class AtBat extends Drawable {
    private final ArraySet<Pitch> pitches = new ArraySet<Pitch>(5);
    private final ArraySet<OffensiveResult> offensiveResult = new ArraySet<OffensiveResult>(4);


    private AtBat(@NonNull final String nameToSet, @NonNull final String commentToSet) {
        super(nameToSet, commentToSet);
    }

    @NonNull
    public static AtBat createAtBat(
            @NonNull final String nameToSet, @NonNull final String commentToSet) {
        return new AtBat(nameToSet, commentToSet);
    }
}