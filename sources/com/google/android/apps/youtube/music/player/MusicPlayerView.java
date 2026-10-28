package com.google.android.apps.youtube.music.player;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import defpackage.aunn;
import defpackage.avmb;
import defpackage.avmm;
import defpackage.hmd;
import defpackage.hva;
import defpackage.hvx;
import defpackage.hww;
import defpackage.vxz;
import defpackage.zki;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class MusicPlayerView extends hvx {
    public aunn a;
    public aunn b;
    public avmb c;
    public float d;
    public hww e;
    private final avmm h;

    public MusicPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new avmm();
        this.d = 0.0f;
        this.e = hww.a;
        setFocusable(false);
    }

    private static int c(int i, int i2, float f) {
        return (int) (i + ((i2 - i) * f));
    }

    private static Size e(int i, int i2, int i3, int i4, boolean z) {
        Size size;
        if (i <= 0 || i2 <= 0 || i3 <= 0 || i4 <= 0) {
            size = new Size(i, i2);
        } else {
            double d = i2;
            double d2 = i;
            double d3 = d / d2;
            double d4 = ((double) i4) / ((double) i3);
            if (!z ? d3 < d4 : d3 > d4) {
                if (d4 > 0.0d) {
                    return new Size((int) (d / d4), i2);
                }
            }
            size = new Size(i, (int) (d2 * d4));
        }
        return size;
    }

    private final boolean f() {
        return ((vxz) this.b.io()).l(85, 45746502L, false);
    }

    @Override // defpackage.acdi, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            this.h.c(((WatchWhileLayout) this.a.io()).y().L(this.c).al(new hva(this, 7), new hmd(16)));
        }
    }

    @Override // defpackage.acdi, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.b();
    }

    @Override // defpackage.acdi, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View view = this.ac;
        zki zkiVar = this.f;
        if (!f() || view == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int iE = zkiVar.e();
        int iD = zkiVar.d();
        float f = this.d;
        Size sizeE = e(measuredWidth, measuredHeight, iE, iD, false);
        if (f != 0.0f) {
            Size sizeE2 = e(measuredWidth, measuredHeight, iE, iD, true);
            sizeE = f == 1.0f ? sizeE2 : new Size(c(sizeE.getWidth(), sizeE2.getWidth(), f), c(sizeE.getHeight(), sizeE2.getHeight(), f));
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(sizeE.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(sizeE.getHeight(), 1073741824));
    }

    @Override // defpackage.acdi, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public MusicPlayerView(Context context) {
        this(context, null);
    }
}
