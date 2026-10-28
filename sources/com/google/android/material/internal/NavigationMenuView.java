package com.google.android.material.internal;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.iq;
import defpackage.jd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class NavigationMenuView extends RecyclerView implements jd {
    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ah(new LinearLayoutManager(context, 1, false));
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context) {
        this(context, null);
    }

    @Override // defpackage.jd
    public final void a(iq iqVar) {
    }
}
