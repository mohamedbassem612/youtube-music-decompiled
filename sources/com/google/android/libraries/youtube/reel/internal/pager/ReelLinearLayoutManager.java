package com.google.android.libraries.youtube.reel.internal.pager;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.WindowManager;
import defpackage.acqc;
import defpackage.acrc;
import defpackage.apdq;
import defpackage.hno;
import defpackage.oe;
import defpackage.vxu;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class ReelLinearLayoutManager extends LinearLayoutManager {
    public float a;
    public float b;
    public boolean c;
    private final boolean d;
    private final acrc e;
    private final Context f;
    private final hno g;

    public ReelLinearLayoutManager(Context context, hno hnoVar, acrc acrcVar, boolean z) {
        super(context, z ? 1 : 0, false);
        float f = 350.0f;
        this.a = 350.0f;
        this.b = 350.0f;
        this.c = false;
        this.d = z;
        this.e = acrcVar;
        float width = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth();
        if (hnoVar.aU()) {
            apdq apdqVar = ((vxu) hnoVar.p).c().w;
            f = (apdqVar == null ? apdq.a : apdqVar).c;
        }
        if (hnoVar.aV()) {
            this.a = hnoVar.c() / context.getResources().getDisplayMetrics().densityDpi;
        } else {
            this.a = (f * 0.3356f) / width;
        }
        this.b = 0.3356f / width;
        this.f = context;
        this.g = hnoVar;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final boolean canScrollVertically() {
        return this.d ? this.e.b : super.canScrollVertically();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final void smoothScrollToPosition(RecyclerView recyclerView, oe oeVar, int i) {
        acqc acqcVar = new acqc(this.f, this.g, this.a, this.b);
        acqcVar.a = this.c;
        acqcVar.b = i;
        startSmoothScroll(acqcVar);
    }
}
