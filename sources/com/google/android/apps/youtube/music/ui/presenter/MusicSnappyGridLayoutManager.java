package com.google.android.apps.youtube.music.ui.presenter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import defpackage.jex;
import defpackage.oe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class MusicSnappyGridLayoutManager extends GridLayoutManager {
    public final int k;
    private final int l;
    private final Context m;

    public MusicSnappyGridLayoutManager(Context context, int i) {
        super(context, i, 0);
        int i2 = 1;
        if (getOrientation() == 1) {
            i2 = 3;
        } else if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            i2 = 2;
        }
        this.k = i2;
        this.l = i;
        this.m = context;
    }

    public final int c(int i) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iFindFirstVisibleItemPosition = findFirstVisibleItemPosition();
        int itemCount = getItemCount();
        if (this.k == 2) {
            i = -i;
        }
        boolean z = i <= 0;
        int i2 = this.l;
        boolean z2 = itemCount > (i2 << 1) + iFindFirstVisibleItemPosition;
        if (i == 0) {
            z = z2;
        }
        return true != z ? iFindFirstVisibleItemPosition + i2 : iFindFirstVisibleItemPosition;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final void smoothScrollToPosition(RecyclerView recyclerView, oe oeVar, int i) {
        jex jexVar = new jex(this, this.m, this);
        jexVar.b = i;
        startSmoothScroll(jexVar);
    }

    @Override // android.support.v7.widget.GridLayoutManager, android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final boolean supportsPredictiveItemAnimations() {
        return false;
    }
}
