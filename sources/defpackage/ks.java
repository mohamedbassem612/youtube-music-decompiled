package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ks extends ko {
    public final SeekBar b;
    public Drawable c;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private boolean f;
    private boolean g;

    public ks(SeekBar seekBar) {
        super(seekBar);
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.b = seekBar;
    }

    private final void c() {
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.f || this.g) {
                Drawable drawableMutate = drawable.mutate();
                this.c = drawableMutate;
                if (this.f) {
                    drawableMutate.setTintList(this.d);
                }
                if (this.g) {
                    this.c.setTintMode(this.e);
                }
                if (this.c.isStateful()) {
                    this.c.setState(this.b.getDrawableState());
                }
            }
        }
    }

    @Override // defpackage.ko
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, i);
        SeekBar seekBar = this.b;
        Context context = seekBar.getContext();
        int[] iArr = he.g;
        ahto ahtoVarL = ahto.L(context, attributeSet, iArr, i, 0);
        bac.o(seekBar, seekBar.getContext(), iArr, attributeSet, (TypedArray) ahtoVarL.b, i, 0);
        Drawable drawableC = ahtoVarL.C(0);
        if (drawableC != null) {
            seekBar.setThumb(drawableC);
        }
        Drawable drawableB = ahtoVarL.B(1);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.c = drawableB;
        if (drawableB != null) {
            drawableB.setCallback(seekBar);
            drawableB.setLayoutDirection(seekBar.getLayoutDirection());
            if (drawableB.isStateful()) {
                drawableB.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (ahtoVarL.H(3)) {
            int iW = ahtoVarL.w(3, -1);
            PorterDuff.Mode mode = this.e;
            Rect rect = lx.a;
            this.e = a.l(iW, mode);
            this.g = true;
        }
        if (ahtoVarL.H(2)) {
            this.d = ahtoVarL.A(2);
            this.f = true;
        }
        ahtoVarL.F();
        c();
    }
}
