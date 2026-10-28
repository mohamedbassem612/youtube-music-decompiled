package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class nq extends ViewGroup.MarginLayoutParams {
    public oh c;
    public final Rect d;
    public boolean e;
    boolean f;

    public nq(int i, int i2) {
        super(i, i2);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public final int gL() {
        return this.c.c();
    }

    public final boolean gM() {
        return this.c.y();
    }

    public final boolean gN() {
        return this.c.v();
    }

    public nq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public nq(nq nqVar) {
        super((ViewGroup.LayoutParams) nqVar);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public nq(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public nq(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }
}
