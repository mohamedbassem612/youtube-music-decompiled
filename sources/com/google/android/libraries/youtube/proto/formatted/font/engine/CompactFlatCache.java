package com.google.android.libraries.youtube.proto.formatted.font.engine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class CompactFlatCache {
    public final int capacity = 16;
    private volatile Entry[] entries = new Entry[0];

    /* JADX INFO: compiled from: PG */
    final class Entry {
        public final Object key;
        public final Object value;
    }
}
