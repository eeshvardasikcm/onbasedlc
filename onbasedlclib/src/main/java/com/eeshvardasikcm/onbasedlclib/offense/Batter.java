package com.eeshvardasikcm.onbasedlclib.offense;

import androidx.annotation.NonNull;

public abstract class Batter {
    protected Batter() {
    }

    protected abstract void BaseReached(@NonNull Byte baseNumber);
}