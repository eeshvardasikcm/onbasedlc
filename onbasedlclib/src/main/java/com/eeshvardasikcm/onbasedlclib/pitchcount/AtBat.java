package com.eeshvardasikcm.onbasedlclib.pitchcount;

import androidx.annotation.NonNull;
import androidx.collection.ArraySet;

import com.eeshvardasikcm.onbasedlclib.offense.Batter;

class AtBat extends Batter {
    private ArraySet<Pitch> pitches = new ArraySet<Pitch>(5);
    private ArraySet<OffensiveResult> offensiveResult = new ArraySet<OffensiveResult>(4);

    @Override
    protected void BaseReached(@NonNull Byte baseNumber) {

    }
}
