package com.google.android.libraries.youtube.engagementpanel;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.rendering.ui.OverScrollLinearLayoutManager;
import defpackage.adwy;
import defpackage.tpo;
import defpackage.uqd;
import defpackage.vpu;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class LinearScrollToItemLayoutManager extends OverScrollLinearLayoutManager implements adwy {
    public final vpu a;
    public int b;
    public boolean c;
    private Runnable d;

    public LinearScrollToItemLayoutManager(Context context) {
        super(context);
        this.a = new vpu(context, 0, 500);
        this.d = new tpo(9);
    }

    final vpu a(Context context, int i, int i2) {
        vpu vpuVar = new vpu(context, i, i2);
        vpuVar.a = this.c;
        return vpuVar;
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        vpu vpuVarA = a(recyclerView.getContext(), i2, 500);
        recyclerView.removeCallbacks(this.d);
        this.d = new uqd(this, vpuVarA, 9, null);
        if (Math.abs(i - findFirstVisibleItemPosition()) < 7) {
            d(vpuVarA, i);
            return;
        }
        scrollToPosition(i);
        this.b = i;
        recyclerView.post(this.d);
    }

    @Override // defpackage.adwy
    public final void c(RecyclerView recyclerView, int i, int i2) {
        vpu vpuVarA = a(recyclerView.getContext(), i2, 800);
        vpuVarA.b = i;
        startSmoothScroll(vpuVarA);
    }

    public final void d(vpu vpuVar, int i) {
        vpuVar.m();
        vpuVar.b = i;
        startSmoothScroll(vpuVar);
    }
}
