package com.google.android.libraries.youtube.composition.api;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class SegmentBounds {
    final ArrayList bounds;
    final String segmentId;

    public SegmentBounds(String str, ArrayList arrayList) {
        this.segmentId = str;
        this.bounds = arrayList;
    }

    public ArrayList getBounds() {
        return this.bounds;
    }

    public String getSegmentId() {
        return this.segmentId;
    }

    public String toString() {
        return "SegmentBounds{segmentId=" + this.segmentId + ",bounds=" + String.valueOf(this.bounds) + '}';
    }
}
