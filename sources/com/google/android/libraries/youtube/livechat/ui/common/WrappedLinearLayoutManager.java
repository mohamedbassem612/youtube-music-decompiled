package com.google.android.libraries.youtube.livechat.ui.common;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import defpackage.nv;
import defpackage.oe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class WrappedLinearLayoutManager extends LinearLayoutManager {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrappedLinearLayoutManager(Context context) {
        super(context);
        context.getClass();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final void onLayoutChildren(nv nvVar, oe oeVar) {
        nvVar.getClass();
        oeVar.getClass();
        try {
            super.onLayoutChildren(nvVar, oeVar);
        } catch (IndexOutOfBoundsException unused) {
        }
    }
}
