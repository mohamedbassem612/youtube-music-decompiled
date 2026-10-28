package defpackage;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class afbc extends Drawable.ConstantState {
    public afbj a;
    public aewq b;
    ColorFilter c;
    ColorStateList d;
    ColorStateList e;
    ColorStateList f;
    ColorStateList g;
    PorterDuff.Mode h;
    public Rect i;
    float j;
    public float k;
    float l;
    int m;
    public float n;
    float o;
    float p;
    int q;
    int r;
    int s;
    int t;
    boolean u;
    Paint.Style v;

    public afbc(afbc afbcVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = 255;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint.Style.FILL_AND_STROKE;
        this.a = afbcVar.a;
        this.b = afbcVar.b;
        this.l = afbcVar.l;
        this.c = afbcVar.c;
        this.d = afbcVar.d;
        this.e = afbcVar.e;
        this.h = afbcVar.h;
        this.g = afbcVar.g;
        this.m = afbcVar.m;
        this.j = afbcVar.j;
        this.s = afbcVar.s;
        this.q = afbcVar.q;
        boolean z = afbcVar.u;
        this.u = false;
        this.k = afbcVar.k;
        this.n = afbcVar.n;
        this.o = afbcVar.o;
        float f = afbcVar.p;
        this.p = 0.0f;
        this.r = afbcVar.r;
        int i = afbcVar.t;
        this.t = 0;
        this.f = afbcVar.f;
        this.v = afbcVar.v;
        Rect rect = afbcVar.i;
        if (rect != null) {
            this.i = new Rect(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        afbe afbeVar = new afbe(this);
        afbeVar.e = true;
        afbeVar.f = true;
        return afbeVar;
    }

    public afbc(afbj afbjVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = 255;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint.Style.FILL_AND_STROKE;
        this.a = afbjVar;
        this.b = null;
    }
}
