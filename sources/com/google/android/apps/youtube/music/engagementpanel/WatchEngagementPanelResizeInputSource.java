package com.google.android.apps.youtube.music.engagementpanel;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.ast;
import defpackage.aunn;
import defpackage.avlh;
import defpackage.awku;
import defpackage.awkx;
import defpackage.awrc;
import defpackage.ttn;
import defpackage.vor;
import defpackage.vtm;
import defpackage.vux;
import defpackage.vuy;
import defpackage.vuz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class WatchEngagementPanelResizeInputSource extends ast implements vuz {
    private final aunn b;
    private final vtm c;
    private final ttn d;
    private final awku e;
    private final awkx f;
    private final awkx g;
    private boolean h;
    private View i;

    public WatchEngagementPanelResizeInputSource(Context context, aunn aunnVar, vtm vtmVar) {
        context.getClass();
        aunnVar.getClass();
        vtmVar.getClass();
        this.b = aunnVar;
        this.c = vtmVar;
        this.d = new ttn(context, 200, 1, 20);
        this.e = new awku(Boolean.FALSE);
        this.f = new awkx();
        this.g = new awkx();
    }

    private final void v() {
        if (this.h) {
            this.e.kk(Boolean.FALSE);
            this.h = false;
        }
        this.i = null;
        this.d.c();
    }

    private final boolean w() {
        return ((vor) this.b.io()).I() && this.c.f();
    }

    @Override // defpackage.ast
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        coordinatorLayout.getClass();
        view.getClass();
        motionEvent.getClass();
        if (!w()) {
            v();
            return false;
        }
        ttn ttnVar = this.d;
        ttnVar.b(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (!coordinatorLayout.l(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
            this.i = view;
            ttnVar.d(motionEvent);
            return false;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (!awrc.c(this.i, view)) {
                    return false;
                }
                int iA = ttnVar.a(motionEvent, 1);
                return iA == 2 || iA == 4;
            }
            if (actionMasked != 3) {
                return false;
            }
        }
        v();
        return false;
    }

    @Override // defpackage.ast
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        vuy vuyVar;
        coordinatorLayout.getClass();
        view.getClass();
        motionEvent.getClass();
        int i = 0;
        if (!w()) {
            v();
            return false;
        }
        ttn ttnVar = this.d;
        ttnVar.b(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            if (this.h) {
                int iE = ttnVar.e(motionEvent, 1);
                awkx awkxVar = this.g;
                if (iE != 1) {
                    vuyVar = iE != 2 ? vuy.a : vuy.b;
                } else {
                    vuyVar = vuy.c;
                }
                awkxVar.kk(vuyVar);
            }
            v();
        } else if (actionMasked == 2) {
            if (!this.h) {
                ttnVar.d(motionEvent);
                this.e.kk(Boolean.TRUE);
                this.h = true;
            }
            int iFindPointerIndex = motionEvent.findPointerIndex(ttnVar.g);
            if (iFindPointerIndex >= 0) {
                float y = motionEvent.getY(iFindPointerIndex);
                float f = ttnVar.f - y;
                ttnVar.f = y;
                i = (int) f;
            }
            this.f.kk(Integer.valueOf(-i));
        } else {
            if (actionMasked != 3) {
                return false;
            }
            v();
        }
        return true;
    }

    @Override // defpackage.vuz
    public final vux q() {
        return vux.a;
    }

    @Override // defpackage.vuz
    public final avlh r() {
        return this.e;
    }

    @Override // defpackage.vuz
    public final avlh s() {
        return this.g;
    }

    @Override // defpackage.vuz
    public final avlh t() {
        avlh avlhVarW = avlh.w();
        avlhVarW.getClass();
        return avlhVarW;
    }

    @Override // defpackage.vuz
    public final avlh u() {
        return this.f;
    }
}
