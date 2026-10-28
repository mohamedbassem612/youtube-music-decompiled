package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class kj {
    public PorterDuff.Mode a = null;
    public boolean b = false;
    public boolean c = false;
    private final CompoundButton d;
    private boolean e;

    public kj(CompoundButton compoundButton) {
        this.d = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.d;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.b || this.c) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.b) {
                    drawableMutate.setTintList(null);
                }
                if (this.c) {
                    drawableMutate.setTintMode(this.a);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    final void b(AttributeSet attributeSet, int i) {
        int iZ;
        int iZ2;
        CompoundButton compoundButton = this.d;
        Context context = compoundButton.getContext();
        int[] iArr = he.m;
        ahto ahtoVarL = ahto.L(context, attributeSet, iArr, i, 0);
        bac.o(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) ahtoVarL.b, i, 0);
        try {
            if (ahtoVarL.H(1) && (iZ2 = ahtoVarL.z(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(dl.d(compoundButton.getContext(), iZ2));
                } catch (Resources.NotFoundException unused) {
                    if (ahtoVarL.H(0)) {
                        CompoundButton compoundButton2 = this.d;
                        compoundButton2.setButtonDrawable(dl.d(compoundButton2.getContext(), iZ));
                    }
                }
            } else if (ahtoVarL.H(0) && (iZ = ahtoVarL.z(0, 0)) != 0) {
                CompoundButton compoundButton3 = this.d;
                compoundButton3.setButtonDrawable(dl.d(compoundButton3.getContext(), iZ));
            }
            if (ahtoVarL.H(2)) {
                this.d.setButtonTintList(ahtoVarL.A(2));
            }
            if (ahtoVarL.H(3)) {
                CompoundButton compoundButton4 = this.d;
                int iW = ahtoVarL.w(3, -1);
                Rect rect = lx.a;
                compoundButton4.setButtonTintMode(a.l(iW, null));
            }
        } finally {
            ahtoVarL.F();
        }
    }

    final void c() {
        if (this.e) {
            this.e = false;
        } else {
            this.e = true;
            a();
        }
    }
}
