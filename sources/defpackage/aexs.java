package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aexs extends Drawable.ConstantState {
    public Drawable.ConstantState a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public int k;
    public float l;
    public int m;
    public float n;
    public int o;
    public float p;
    public int q;
    public float r;
    public int s;
    public afbj t;
    public int u;
    public int v;
    public Rect w;
    public int[] x;
    public int y;

    public aexs(aexs aexsVar) {
        this.b = 0;
        this.c = false;
        this.d = Integer.MIN_VALUE;
        this.e = false;
        this.f = Integer.MIN_VALUE;
        this.g = Integer.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = Float.NaN;
        this.k = Integer.MIN_VALUE;
        this.l = Float.NaN;
        this.m = Integer.MIN_VALUE;
        this.n = Float.NaN;
        this.o = Integer.MIN_VALUE;
        this.p = Float.NaN;
        this.q = Integer.MIN_VALUE;
        this.r = Float.NaN;
        this.s = Integer.MIN_VALUE;
        this.t = null;
        this.u = Integer.MIN_VALUE;
        this.v = Integer.MIN_VALUE;
        this.w = null;
        this.x = FocusRingDrawable.a;
        this.y = Integer.MIN_VALUE;
        if (aexsVar != null) {
            this.a = aexsVar.a;
            this.b = aexsVar.b;
            this.c = aexsVar.c;
            this.d = aexsVar.d;
            this.e = aexsVar.e;
            this.f = aexsVar.f;
            this.g = aexsVar.g;
            this.h = aexsVar.h;
            this.i = aexsVar.i;
            this.j = aexsVar.j;
            this.k = aexsVar.k;
            this.l = aexsVar.l;
            this.m = aexsVar.m;
            this.n = aexsVar.n;
            this.o = aexsVar.o;
            this.p = aexsVar.p;
            this.q = aexsVar.q;
            this.r = aexsVar.r;
            this.s = aexsVar.s;
            this.u = aexsVar.u;
            this.v = aexsVar.v;
            afbj afbjVar = aexsVar.t;
            if (afbjVar instanceof afbk) {
                this.t = new afbk(new afli((afbk) afbjVar));
            } else {
                this.t = afbjVar instanceof afbw ? new acb((afbw) afbjVar).f() : afbjVar;
            }
            Rect rect = aexsVar.w;
            if (rect != null) {
                this.w = new Rect(rect);
            }
            int[] iArr = aexsVar.x;
            this.x = Arrays.copyOf(iArr, iArr.length);
            this.y = aexsVar.y;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        Drawable.ConstantState constantState = this.a;
        return this.b | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new FocusRingDrawable(this, null, 0 == true ? 1 : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new FocusRingDrawable(this, resources, null);
    }
}
