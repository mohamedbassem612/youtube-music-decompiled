package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class npr {
    public static final PorterDuffXfermode a = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
    public Paint b;
    public Paint c;
    public final Matrix d = new Matrix();
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int k = -1;
    public boolean l = true;
    public final int[] m = new int[2];

    public static int a(float f) {
        return Math.round(Math.min(1.0f, Math.max(0.0f, f)) * 255.0f);
    }

    public static boolean c(View view, int i, int i2, Rect rect) {
        int paddingBottom;
        int paddingLeft;
        int paddingTop;
        int paddingRight;
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getClipToPadding()) {
            paddingLeft = viewGroup.getPaddingLeft();
            paddingTop = viewGroup.getPaddingTop();
            paddingRight = viewGroup.getPaddingRight();
            paddingBottom = viewGroup.getPaddingBottom();
        } else {
            paddingBottom = 0;
            paddingLeft = 0;
            paddingTop = 0;
            paddingRight = 0;
        }
        rect.set(paddingLeft, paddingTop, i - paddingRight, i2 - paddingBottom);
        return !rect.isEmpty();
    }

    public final void b() {
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.b = null;
        this.c = null;
        this.l = true;
    }
}
