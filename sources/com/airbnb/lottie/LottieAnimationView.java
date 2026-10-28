package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.provider.Settings;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.youtube.music.R;
import defpackage.afxw;
import defpackage.avt;
import defpackage.egs;
import defpackage.egu;
import defpackage.egv;
import defpackage.egw;
import defpackage.egx;
import defpackage.egy;
import defpackage.ehd;
import defpackage.ehm;
import defpackage.eho;
import defpackage.ehq;
import defpackage.ehr;
import defpackage.ehs;
import defpackage.ehu;
import defpackage.ehw;
import defpackage.ehx;
import defpackage.ejp;
import defpackage.ejv;
import defpackage.elf;
import defpackage.enm;
import defpackage.enp;
import defpackage.enr;
import defpackage.eol;
import defpackage.uf;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final eho a = new egs();
    public eho b;
    public int c;
    public final ehm d;
    public boolean e;
    public final Set f;
    private final eho g;
    private final eho h;
    private String i;
    private int j;
    private boolean k;
    private boolean l;
    private final Set m;
    private ehu n;

    public LottieAnimationView(Context context) {
        super(context);
        this.g = new egx(this, 0);
        this.h = new egx(this, 1, null);
        this.c = 0;
        this.d = new ehm();
        this.k = false;
        this.l = false;
        this.e = true;
        this.m = new HashSet();
        this.f = new HashSet();
        x(null, R.attr.lottieAnimationViewStyle);
    }

    private final void w() {
        ehu ehuVar = this.n;
        if (ehuVar != null) {
            ehuVar.f(this.g);
            this.n.e(this.h);
        }
    }

    private final void x(AttributeSet attributeSet, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ehw.a, i, 0);
        this.e = typedArrayObtainStyledAttributes.getBoolean(2, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(9);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(19);
        if (zHasValue) {
            if (zHasValue2) {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(14, 0);
            if (resourceId != 0) {
                h(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(9);
            if (string2 != null) {
                i(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(19)) != null) {
            j(string);
        }
        this.c = typedArrayObtainStyledAttributes.getResourceId(8, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(1, false)) {
            this.l = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(12, false)) {
            this.d.w(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            r(typedArrayObtainStyledAttributes.getInt(17, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            q(typedArrayObtainStyledAttributes.getInt(16, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            s(typedArrayObtainStyledAttributes.getFloat(18, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            boolean z = typedArrayObtainStyledAttributes.getBoolean(4, true);
            ehm ehmVar = this.d;
            if (z != ehmVar.j) {
                ehmVar.j = z;
                elf elfVar = ehmVar.k;
                if (elfVar != null) {
                    elfVar.k = z;
                }
                ehmVar.invalidateSelf();
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            boolean z2 = typedArrayObtainStyledAttributes.getBoolean(3, false);
            ehm ehmVar2 = this.d;
            if (z2 != ehmVar2.l) {
                ehmVar2.l = z2;
                ehmVar2.invalidateSelf();
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            String string3 = typedArrayObtainStyledAttributes.getString(6);
            ehm ehmVar3 = this.d;
            ehmVar3.h = string3;
            ejp ejpVarF = ehmVar3.f();
            if (ejpVarF != null) {
                ejpVarF.e = string3;
            }
        }
        m(typedArrayObtainStyledAttributes.getString(11));
        p(typedArrayObtainStyledAttributes.getFloat(13, 0.0f), typedArrayObtainStyledAttributes.hasValue(13));
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(7, false);
        ehm ehmVar4 = this.d;
        if (ehmVar4.i != z3) {
            ehmVar4.i = z3;
            if (ehmVar4.a != null) {
                ehmVar4.j();
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            Context context = getContext();
            b(new ejv("**"), ehr.K, new enp(new ehx(avt.a(context.getResources(), resourceId2, context.getTheme()).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            int i2 = typedArrayObtainStyledAttributes.getInt(15, 0);
            afxw.p();
            if (i2 >= 3) {
                i2 = 0;
            }
            ehmVar4.p = afxw.p()[i2];
            ehmVar4.l();
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            afxw.p();
            if (i3 >= 3) {
                i3 = 0;
            }
            ehmVar4.q = afxw.p()[i3];
        }
        ehmVar4.c = typedArrayObtainStyledAttributes.getBoolean(10, false);
        if (typedArrayObtainStyledAttributes.hasValue(20)) {
            ehmVar4.b.l = typedArrayObtainStyledAttributes.getBoolean(20, false);
        }
        typedArrayObtainStyledAttributes.recycle();
        Context context2 = getContext();
        ThreadLocal threadLocal = enm.a;
        ehmVar4.y(Boolean.valueOf(Settings.Global.getFloat(context2.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f));
    }

    public final void a(Animator.AnimatorListener animatorListener) {
        this.d.g(animatorListener);
    }

    public final void b(ejv ejvVar, Object obj, enp enpVar) {
        this.d.i(ejvVar, obj, enpVar);
    }

    public final void c(ejv ejvVar, Object obj, enr enrVar) {
        this.d.i(ejvVar, obj, new egu(enrVar));
    }

    public final void d() {
        this.l = false;
        this.m.add(egw.f);
        ehm ehmVar = this.d;
        ehmVar.d.clear();
        ehmVar.b.cancel();
        if (ehmVar.isVisible()) {
            return;
        }
        ehmVar.o = 1;
    }

    public final void e() {
        this.l = false;
        this.d.m();
    }

    public final void f() {
        this.m.add(egw.f);
        this.d.n();
    }

    public final void g() {
        this.m.add(egw.f);
        this.d.q();
    }

    public final void h(final int i) {
        ehu ehuVarH;
        this.j = i;
        this.i = null;
        if (isInEditMode()) {
            ehuVarH = new ehu(new Callable() { // from class: egt
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i2 = i;
                    LottieAnimationView lottieAnimationView = this.a;
                    boolean z = lottieAnimationView.e;
                    Context context = lottieAnimationView.getContext();
                    return z ? ehd.c(context, i2, ehd.k(context, i2)) : ehd.c(context, i2, null);
                }
            }, true);
        } else if (this.e) {
            Context context = getContext();
            ehuVarH = ehd.h(context, i, ehd.k(context, i));
        } else {
            ehuVarH = ehd.h(getContext(), i, null);
        }
        l(ehuVarH);
    }

    public final void i(String str) {
        ehu ehuVarD;
        this.i = str;
        this.j = 0;
        byte[] bArr = null;
        if (isInEditMode()) {
            ehuVarD = new ehu(new uf(this, str, 2, bArr), true);
        } else {
            ehuVarD = this.e ? ehd.d(getContext(), str, "asset_".concat(String.valueOf(str))) : ehd.d(getContext(), str, null);
        }
        l(ehuVarD);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof ehm) && ((ehm) drawable).m) {
            this.d.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        ehm ehmVar = this.d;
        if (drawable2 == ehmVar) {
            super.invalidateDrawable(ehmVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void j(String str) {
        l(this.e ? ehd.i(getContext(), str) : ehd.j(getContext(), str, null));
    }

    public final void k(egy egyVar) {
        ehm ehmVar = this.d;
        ehmVar.setCallback(this);
        this.k = true;
        boolean zB = ehmVar.B(egyVar);
        if (this.l) {
            ehmVar.n();
        }
        this.k = false;
        if (getDrawable() == ehmVar) {
            if (!zB) {
                return;
            }
        } else if (!zB) {
            boolean zT = t();
            setImageDrawable(null);
            setImageDrawable(ehmVar);
            if (zT) {
                ehmVar.q();
            }
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((ehq) it.next()).a(egyVar);
        }
    }

    public final void l(ehu ehuVar) {
        ehm ehmVar = this.d;
        ehs ehsVar = ehuVar.b;
        if (ehsVar != null && ehmVar == getDrawable() && ehmVar.a == ehsVar.a) {
            return;
        }
        this.m.add(egw.a);
        ehmVar.k();
        w();
        ehuVar.d(this.g);
        ehuVar.c(this.h);
        this.n = ehuVar;
    }

    public final void m(String str) {
        this.d.f = str;
    }

    public final void n(int i, int i2) {
        this.d.t(i, i2);
    }

    public final void o(float f, float f2) {
        this.d.u(f, f2);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.l) {
            return;
        }
        this.d.n();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof egv)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        egv egvVar = (egv) parcelable;
        super.onRestoreInstanceState(egvVar.getSuperState());
        this.i = egvVar.a;
        Set set = this.m;
        egw egwVar = egw.a;
        if (!set.contains(egwVar) && !TextUtils.isEmpty(this.i)) {
            i(this.i);
        }
        this.j = egvVar.b;
        if (!set.contains(egwVar) && (i = this.j) != 0) {
            h(i);
        }
        if (!set.contains(egw.b)) {
            p(egvVar.c, false);
        }
        if (!set.contains(egw.f) && egvVar.d) {
            f();
        }
        if (!set.contains(egw.e)) {
            m(egvVar.e);
        }
        if (!set.contains(egw.c)) {
            r(egvVar.f);
        }
        if (set.contains(egw.d)) {
            return;
        }
        q(egvVar.g);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        boolean z;
        egv egvVar = new egv(super.onSaveInstanceState());
        egvVar.a = this.i;
        egvVar.b = this.j;
        ehm ehmVar = this.d;
        egvVar.c = ehmVar.c();
        if (ehmVar.isVisible()) {
            z = ehmVar.b.k;
        } else {
            int i = ehmVar.o;
            z = i == 2 || i == 3;
        }
        egvVar.d = z;
        egvVar.e = ehmVar.f;
        egvVar.f = ehmVar.b.getRepeatMode();
        egvVar.g = ehmVar.e();
        return egvVar;
    }

    public final void p(float f, boolean z) {
        if (z) {
            this.m.add(egw.b);
        }
        this.d.v(f);
    }

    public final void q(int i) {
        this.m.add(egw.d);
        this.d.w(i);
    }

    public final void r(int i) {
        this.m.add(egw.c);
        this.d.b.setRepeatMode(i);
    }

    public final void s(float f) {
        this.d.x(f);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        this.j = 0;
        this.i = null;
        w();
        super.setImageBitmap(bitmap);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        this.j = 0;
        this.i = null;
        w();
        super.setImageDrawable(drawable);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int i) {
        this.j = 0;
        this.i = null;
        w();
        super.setImageResource(i);
    }

    public final boolean t() {
        return this.d.A();
    }

    public final void u(ehq ehqVar) {
        Drawable drawable = getDrawable();
        ehm ehmVar = this.d;
        egy egyVar = drawable == ehmVar ? ehmVar.a : null;
        if (egyVar != null) {
            ehqVar.a(egyVar);
        }
        this.f.add(ehqVar);
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        ehm ehmVar;
        if (!this.k && drawable == (ehmVar = this.d) && ehmVar.A()) {
            e();
        } else if (!this.k && (drawable instanceof ehm)) {
            ehm ehmVar2 = (ehm) drawable;
            if (ehmVar2.A()) {
                ehmVar2.m();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public final void v(eol eolVar) {
        this.d.C(eolVar);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new egx(this, 0);
        this.h = new egx(this, 1, null);
        this.c = 0;
        this.d = new ehm();
        this.k = false;
        this.l = false;
        this.e = true;
        this.m = new HashSet();
        this.f = new HashSet();
        x(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new egx(this, 0);
        this.h = new egx(this, 1, null);
        this.c = 0;
        this.d = new ehm();
        this.k = false;
        this.l = false;
        this.e = true;
        this.m = new HashSet();
        this.f = new HashSet();
        x(attributeSet, i);
    }
}
