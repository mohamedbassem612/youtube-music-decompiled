package com.google.android.apps.youtube.music.offline.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import defpackage.adxj;
import defpackage.arqz;
import defpackage.bac;
import defpackage.dl;
import defpackage.hvi;
import defpackage.hvj;
import defpackage.jkl;
import defpackage.ohg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class OfflineBadgeView extends hvi {
    public adxj a;
    public int b;
    public int c;
    public int d;
    private AnimationDrawable e;
    private LayerDrawable f;
    private ohg g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    public OfflineBadgeView(Context context) {
        super(context);
        h(context, null);
    }

    private final void h(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hvj.a);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(12, false);
        adxj adxjVar = this.a;
        arqz arqzVar = arqz.gN;
        this.j = adxjVar.b(arqzVar);
        this.a.b(arqzVar);
        this.k = typedArrayObtainStyledAttributes.getResourceId(0, R.drawable.yt_outline_offline_progress);
        this.b = this.a.b(z ? arqz.fL : arqz.M);
        this.l = this.a.b(arqz.eb);
        typedArrayObtainStyledAttributes.getResourceId(3, R.drawable.ic_offline_unavailable);
        this.m = this.a.b(arqz.ep);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, context.getResources().getDimensionPixelSize(R.dimen.offline_progress_bar_thickness));
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, context.getResources().getDimensionPixelSize(R.dimen.offline_progress_bar_inset));
        this.c = typedArrayObtainStyledAttributes.getColor(5, context.getColor(R.color.offline_color_control_activated));
        this.d = typedArrayObtainStyledAttributes.getColor(6, context.getColor(R.color.offline_color_control_normal));
        typedArrayObtainStyledAttributes.recycle();
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        e();
    }

    public final void c(int i, int i2) {
        AnimationDrawable animationDrawable = this.e;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
        Context context = getContext();
        int i3 = jkl.a;
        setImageDrawable(context == null ? null : jkl.c(dl.d(context, i), i2));
    }

    public final void d(int i) {
        if (this.e == null) {
            Drawable drawableD = dl.d(getContext(), this.k);
            if (drawableD instanceof AnimationDrawable) {
                this.e = (AnimationDrawable) drawableD;
            }
        }
        if (this.e != null) {
            if (this.f == null) {
                ohg ohgVar = new ohg(this.h, this.i, this.c);
                this.g = ohgVar;
                int i2 = this.e.getBounds().left + this.i + this.h;
                int i3 = this.e.getBounds().top + this.i + this.h;
                int i4 = (this.e.getBounds().right - this.i) - this.h;
                int i5 = (this.e.getBounds().bottom - this.i) - this.h;
                int iMin = (Math.min(i4 - i2, i5 - i3) / 2) + ohgVar.a;
                int i6 = (i2 + i4) / 2;
                int i7 = (i3 + i5) / 2;
                ohgVar.setBounds(i6 - iMin, i7 - iMin, i6 + iMin, i7 + iMin);
                Drawable drawableC = jkl.c(this.e, this.c);
                if (drawableC != null) {
                    this.f = new LayerDrawable(new Drawable[]{drawableC, this.g});
                }
            }
            LayerDrawable layerDrawable = this.f;
            if (layerDrawable != null) {
                setImageDrawable(layerDrawable);
                int i8 = bac.a;
                if (isAttachedToWindow()) {
                    this.e.start();
                }
                ohg ohgVar2 = this.g;
                if (ohgVar2 != null) {
                    if (!ohgVar2.isVisible()) {
                        this.g.e();
                    }
                    this.g.c(i * 0.01f);
                }
            }
        }
    }

    public final void e() {
        c(this.j, this.d);
    }

    public final void f() {
        c(this.l, this.d);
    }

    public final void g() {
        c(this.m, this.c);
    }

    public OfflineBadgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h(context, attributeSet);
    }

    public OfflineBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h(context, attributeSet);
    }
}
