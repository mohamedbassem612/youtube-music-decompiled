package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.aevh;
import defpackage.aevi;
import defpackage.aevj;
import defpackage.ast;
import defpackage.bac;
import defpackage.bby;
import defpackage.bdq;
import defpackage.bdr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class SwipeDismissBehavior extends ast {
    private boolean b;
    public bdr f;
    public aevj g;
    public boolean h;
    public int i = 2;
    public float j = 0.0f;
    public float k = 0.5f;
    private final bdq c = new aevh(this);

    public static float u(float f) {
        return Math.min(Math.max(0.0f, f), 1.0f);
    }

    @Override // defpackage.ast
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zL = this.b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zL = coordinatorLayout.l(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.b = zL;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.b = false;
        }
        if (zL) {
            bdr bdrVarB = this.f;
            if (bdrVarB == null) {
                bdrVarB = bdr.b(coordinatorLayout, this.c);
                this.f = bdrVarB;
            }
            if (!this.h && bdrVarB.j(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ast
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() != 0) {
            return false;
        }
        view.setImportantForAccessibility(1);
        bac.l(view, 1048576);
        if (!q(view)) {
            return false;
        }
        bac.n(view, bby.g, null, new aevi(this));
        return false;
    }

    @Override // defpackage.ast
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f == null) {
            return false;
        }
        if (!this.h || motionEvent.getActionMasked() != 3) {
            this.f.e(motionEvent);
        }
        return true;
    }

    public boolean q(View view) {
        return true;
    }

    public void t(aevj aevjVar) {
        this.g = aevjVar;
    }

    public final void v() {
        this.k = u(0.6f);
    }

    public final void w() {
        this.j = u(0.1f);
    }

    public final void x() {
        this.i = 0;
    }
}
