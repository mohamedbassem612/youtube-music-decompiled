package com.google.android.libraries.youtube.composition.api;

import com.google.android.libraries.youtube.media.interfaces.Time;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class OnPlayerPositionChangedParams {
    final Time position;

    public OnPlayerPositionChangedParams(Time time) {
        this.position = time;
    }

    public Time getPosition() {
        return this.position;
    }

    public String toString() {
        return "OnPlayerPositionChangedParams{position=" + String.valueOf(this.position) + '}';
    }
}
