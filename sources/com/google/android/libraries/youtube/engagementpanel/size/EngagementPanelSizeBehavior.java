package com.google.android.libraries.youtube.engagementpanel.size;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.abwk;
import defpackage.ast;
import defpackage.avlh;
import defpackage.awku;
import defpackage.awkx;
import defpackage.jop;
import defpackage.vqh;
import defpackage.vtm;
import defpackage.vuk;
import defpackage.vul;
import defpackage.vun;
import defpackage.vux;
import defpackage.vuy;
import defpackage.vuz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class EngagementPanelSizeBehavior extends ast implements vuz {
    public vuk b;
    public View c;
    private final int d;
    private final vtm e;
    private final vul f;
    private final awkx g = new awkx();
    private final awku h;
    private final avlh i;
    private final awkx j;
    private boolean k;
    private final abwk l;

    public EngagementPanelSizeBehavior(Context context, abwk abwkVar, vtm vtmVar, vul vulVar) {
        this.e = vtmVar;
        this.l = abwkVar;
        this.f = vulVar;
        awku awkuVar = new awku(Boolean.FALSE);
        this.h = awkuVar;
        this.j = new awkx();
        this.d = ViewConfiguration.get(context).getScaledMinimumFlingVelocity() << 5;
        this.i = awkuVar.p().u(new jop(9)).i(new vqh(3));
    }

    private final void v() {
        if (w()) {
            this.j.kk(vuy.a);
            this.h.kk(Boolean.FALSE);
        }
        this.k = false;
    }

    private final boolean w() {
        Boolean bool = (Boolean) this.h.aD();
        return bool != null && bool.booleanValue();
    }

    @Override // defpackage.ast
    public final boolean onNestedFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
        if (this.k) {
            float fAbs = Math.abs(f2);
            if (f2 <= 0.0f && fAbs >= this.d && w()) {
                this.j.kk(vuy.c);
                this.h.kk(Boolean.FALSE);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ast
    public final void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (this.k) {
            vuk vukVar = this.b;
            if (i2 <= 0 || !w() || vukVar == null) {
                return;
            }
            awkx awkxVar = this.g;
            int i4 = vukVar.t;
            awkxVar.kk(Integer.valueOf(-i2));
            int iMax = Math.max(0, Math.min(i2, -(vukVar.t - i4)));
            if (iMax > 0) {
                iArr[1] = iArr[1] + iMax;
            }
        }
    }

    @Override // defpackage.ast
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.k) {
            if (i4 >= 0) {
                if (i4 != 0 || w()) {
                    return;
                }
                this.k = false;
                return;
            }
            this.h.kk(Boolean.TRUE);
            this.g.kk(Integer.valueOf(-i4));
            iArr[1] = iArr[1] + i4;
            vuk vukVar = this.b;
            vukVar.getClass();
            if (vukVar.t > this.f.c().bottom) {
                v();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, vob] */
    @Override // defpackage.ast
    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        ?? r2 = this.l.d;
        boolean z = false;
        if (r2 != 0) {
            View view4 = this.c;
            boolean z2 = view4 == null || view4 == view2;
            vuk vukVar = this.b;
            if (vukVar != null && vukVar.u != vun.d && this.e.f() && !r2.i() && r2.L() && z2) {
                z = i == 2;
                this.k = z;
            }
        }
        return z;
    }

    @Override // defpackage.ast
    public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        v();
    }

    @Override // defpackage.vuz
    public final vux q() {
        return vux.b;
    }

    @Override // defpackage.vuz
    public final avlh r() {
        return this.i;
    }

    @Override // defpackage.vuz
    public final avlh s() {
        return this.j;
    }

    @Override // defpackage.vuz
    public final avlh t() {
        return avlh.w();
    }

    @Override // defpackage.vuz
    public final avlh u() {
        return this.g;
    }
}
