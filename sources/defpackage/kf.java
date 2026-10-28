package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kf {
    public oz a;
    private final View b;
    private oz e;
    private oz f;
    private int d = -1;
    private final kl c = kl.d();

    public kf(View view) {
        this.b = view;
    }

    public final void a() {
        View view = this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.e != null) {
                oz ozVar = this.f;
                if (ozVar == null) {
                    ozVar = new oz();
                    this.f = ozVar;
                }
                ozVar.a = null;
                ozVar.d = false;
                ozVar.b = null;
                ozVar.c = false;
                int i = bac.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    ozVar.d = true;
                    ozVar.a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    ozVar.c = true;
                    ozVar.b = backgroundTintMode;
                }
                if (ozVar.d || ozVar.c) {
                    ok.g(background, ozVar, view.getDrawableState());
                    return;
                }
            }
            oz ozVar2 = this.a;
            if (ozVar2 != null) {
                ok.g(background, ozVar2, view.getDrawableState());
                return;
            }
            oz ozVar3 = this.e;
            if (ozVar3 != null) {
                ok.g(background, ozVar3, view.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        View view = this.b;
        Context context = view.getContext();
        int[] iArr = he.z;
        ahto ahtoVar = new ahto(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
        bac.o(view, view.getContext(), iArr, attributeSet, (TypedArray) ahtoVar.b, i, 0);
        try {
            if (ahtoVar.H(0)) {
                this.d = ahtoVar.z(0, -1);
                ColorStateList colorStateListA = this.c.a(view.getContext(), this.d);
                if (colorStateListA != null) {
                    d(colorStateListA);
                }
            }
            if (ahtoVar.H(1)) {
                view.setBackgroundTintList(ahtoVar.A(1));
            }
            if (ahtoVar.H(2)) {
                int iW = ahtoVar.w(2, -1);
                Rect rect = lx.a;
                view.setBackgroundTintMode(a.l(iW, null));
            }
        } finally {
            ahtoVar.F();
        }
    }

    public final void c(int i) {
        this.d = i;
        kl klVar = this.c;
        d(klVar != null ? klVar.a(this.b.getContext(), i) : null);
        a();
    }

    final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            oz ozVar = this.e;
            if (ozVar == null) {
                ozVar = new oz();
                this.e = ozVar;
            }
            ozVar.a = colorStateList;
            ozVar.d = true;
        } else {
            this.e = null;
        }
        a();
    }

    public final void e() {
        this.d = -1;
        d(null);
        a();
    }
}
