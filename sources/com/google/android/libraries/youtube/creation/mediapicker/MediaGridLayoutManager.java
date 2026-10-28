package com.google.android.libraries.youtube.creation.mediapicker;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import defpackage.agrc;
import defpackage.agrf;
import defpackage.nv;
import defpackage.oe;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class MediaGridLayoutManager extends GridLayoutManager {
    private static final agrf l = agrf.h("com/google/android/libraries/youtube/creation/mediapicker/MediaGridLayoutManager");
    final Optional k;
    private final boolean m;

    public MediaGridLayoutManager(Context context) {
        super(context, 3);
        this.k = Optional.empty();
        this.m = true;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final boolean canScrollVertically() {
        return this.m && super.canScrollVertically();
    }

    @Override // android.support.v7.widget.GridLayoutManager, android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final void onLayoutChildren(nv nvVar, oe oeVar) {
        try {
            super.onLayoutChildren(nvVar, oeVar);
        } catch (ArrayIndexOutOfBoundsException e) {
            ((agrc) ((agrc) ((agrc) l.c()).j(e)).k("com/google/android/libraries/youtube/creation/mediapicker/MediaGridLayoutManager", "onLayoutChildren", '+', "MediaGridLayoutManager.java")).t("Error for invalid view holders in Recycler View");
            this.k.isPresent();
        }
    }
}
