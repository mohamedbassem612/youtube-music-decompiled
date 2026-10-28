package com.google.android.libraries.youtube.rendering.ui;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import defpackage.advt;
import defpackage.nv;
import defpackage.oe;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class OverScrollLinearLayoutManager extends LinearLayoutManager {
    private final Set a;

    public OverScrollLinearLayoutManager(Context context) {
        super(context, 1, false);
        this.a = Collections.newSetFromMap(new WeakHashMap());
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final void onDetachedFromWindow(RecyclerView recyclerView, nv nvVar) {
        super.onDetachedFromWindow(recyclerView, nvVar);
        this.a.clear();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final int scrollHorizontallyBy(int i, nv nvVar, oe oeVar) {
        Set<advt> set = this.a;
        int iScrollHorizontallyBy = super.scrollHorizontallyBy(i, nvVar, oeVar);
        if (!set.isEmpty()) {
            int i2 = i - iScrollHorizontallyBy;
            Integer num = i2 < 0 ? 2 : i2 > 0 ? 3 : null;
            if (num != null) {
                for (advt advtVar : set) {
                    num.intValue();
                    advtVar.a();
                }
            }
        }
        return iScrollHorizontallyBy;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public int scrollVerticallyBy(int i, nv nvVar, oe oeVar) {
        Set<advt> set = this.a;
        int iScrollVerticallyBy = super.scrollVerticallyBy(i, nvVar, oeVar);
        if (!set.isEmpty()) {
            int i2 = i - iScrollVerticallyBy;
            Integer num = i2 < 0 ? 0 : i2 > 0 ? 1 : null;
            if (num != null) {
                for (advt advtVar : set) {
                    num.intValue();
                    advtVar.a();
                }
            }
        }
        return iScrollVerticallyBy;
    }
}
