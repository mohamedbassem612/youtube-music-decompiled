package com.google.android.libraries.youtube.rendering.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import defpackage.adwn;
import defpackage.adwy;
import defpackage.nq;
import defpackage.nv;
import defpackage.oe;
import defpackage.zvm;
import defpackage.zvn;
import defpackage.zvp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ScrollToTopLinearLayoutManager extends OverScrollLinearLayoutManager implements adwy {
    public int a;
    public boolean b;

    public ScrollToTopLinearLayoutManager(Context context) {
        super(context);
        this.b = true;
    }

    @Override // defpackage.adwy
    public final void c(RecyclerView recyclerView, int i, int i2) {
        adwn adwnVar = new adwn(this, recyclerView.getContext(), Math.abs(i - findFirstCompletelyVisibleItemPosition()) <= 2, i2);
        adwnVar.b = i;
        startSmoothScroll(adwnVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final boolean canScrollVertically() {
        return this.b && super.canScrollVertically();
    }

    @Override // defpackage.np
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        this.a = 0;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final void onLayoutChildren(nv nvVar, oe oeVar) {
        try {
            super.onLayoutChildren(nvVar, oeVar);
        } catch (ClassCastException e) {
            View focusedChild = getFocusedChild();
            if (focusedChild == null || focusedChild.getLayoutParams() == null || (focusedChild.getLayoutParams() instanceof nq)) {
                throw e;
            }
            boolean zF = zvp.f(zvn.b, zvm.z, "UnsafeLayoutParams.\nFOCUSED VIEW: " + focusedChild.toString() + " LayoutParams:" + focusedChild.getLayoutParams().getClass().getName() + "\nPARENT  VIEW: " + String.valueOf(focusedChild.getParent()) + '\n', e, 0.05000000074505806d);
            if (!(focusedChild.getParent() instanceof ViewGroup)) {
                throw e;
            }
            ((ViewGroup) focusedChild.getParent()).clearFocus();
            try {
                super.onLayoutChildren(nvVar, oeVar);
            } catch (ClassCastException e2) {
                if (!zF) {
                    throw e2;
                }
                zvp.b(zvn.b, zvm.z, "UnsafeLayoutParams clear focus and retry layout failed.\n", e2);
                throw e2;
            }
        }
    }

    @Override // com.google.android.libraries.youtube.rendering.ui.OverScrollLinearLayoutManager, android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final int scrollVerticallyBy(int i, nv nvVar, oe oeVar) {
        int iScrollVerticallyBy = super.scrollVerticallyBy(i, nvVar, oeVar);
        this.a += iScrollVerticallyBy;
        return iScrollVerticallyBy;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final void smoothScrollToPosition(RecyclerView recyclerView, oe oeVar, int i) {
        c(recyclerView, i, 0);
    }
}
