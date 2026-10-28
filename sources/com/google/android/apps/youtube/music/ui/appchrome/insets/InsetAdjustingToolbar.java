package com.google.android.apps.youtube.music.ui.appchrome.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import defpackage.abwr;
import defpackage.avlh;
import defpackage.avmn;
import defpackage.awka;
import defpackage.azs;
import defpackage.bac;
import defpackage.bcs;
import defpackage.ido;
import defpackage.iwa;
import defpackage.iwb;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class InsetAdjustingToolbar extends iwa {
    public static final AtomicInteger C = new AtomicInteger(0);
    public avlh D;
    public boolean E;
    public boolean F;
    private avmn G;

    public InsetAdjustingToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F = true;
    }

    public final void G() {
        int i = 0;
        if (!this.E && this.F) {
            i = C.get();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = i;
            setLayoutParams(marginLayoutParams);
        }
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bcs bcsVar = new bcs(this, 6);
        int i = bac.a;
        azs.c(this, bcsVar);
        avmn avmnVar = this.G;
        if (avmnVar == null || avmnVar.f()) {
            this.G = this.D.i(new abwr(1)).al(new iwb(this, 0), new ido(12));
        }
        requestApplyInsets();
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        avmn avmnVar = this.G;
        if (avmnVar != null && !avmnVar.f()) {
            awka.f((AtomicReference) this.G);
        }
        super.onDetachedFromWindow();
    }

    public InsetAdjustingToolbar(Context context) {
        this(context, null);
    }
}
