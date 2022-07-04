package com.eeshvardasikcm.onbasedlclib.lineup;

import androidx.collection.ArraySet;

import com.eeshvardasikcm.onbasedlclib.diagram.Drawable;
import com.eeshvardasikcm.onbasedlclib.offense.Batter;
import com.eeshvardasikcm.onbasedlclib.pitchcount.AtBat;

class Order extends Drawable {
    private final ArraySet<Batter> spot = new ArraySet<Batter>(10);
    private final ArraySet<AtBat> pitchesSeen = new ArraySet<AtBat>(5);

    Order(final String nameToSet, final String commentToSet) {
        super(nameToSet, commentToSet);
    }
}
