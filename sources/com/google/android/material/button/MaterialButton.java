package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;
import defpackage.a;
import defpackage.acb;
import defpackage.aemk;
import defpackage.aewb;
import defpackage.aewd;
import defpackage.aewe;
import defpackage.aewf;
import defpackage.aewg;
import defpackage.aewh;
import defpackage.aeym;
import defpackage.aeyy;
import defpackage.afas;
import defpackage.afba;
import defpackage.afbe;
import defpackage.afbj;
import defpackage.afbk;
import defpackage.afbv;
import defpackage.afbw;
import defpackage.afev;
import defpackage.avgj;
import defpackage.blg;
import defpackage.dl;
import defpackage.kf;
import defpackage.kg;
import defpackage.oz;
import j$.util.Objects;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class MaterialButton extends kg implements Checkable, afbv {
    private static final int[] k = {R.attr.state_checkable};
    private static final int[] l = {R.attr.state_checked};
    private int A;
    private int B;
    private int C;
    private int D;
    public final aewf b;
    public Drawable c;
    public int d;
    public int e;
    public float f;
    public boolean g;
    public int h;
    public boolean i;
    int j;
    private final LinkedHashSet m;
    private PorterDuff.Mode n;
    private ColorStateList o;
    private PorterDuff.Mode p;
    private ColorStateList q;
    private Drawable r;
    private boolean s;
    private int t;
    private int u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private int z;

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        int i2;
        boolean z;
        boolean z2;
        byte[] bArr;
        super(afev.b(context, attributeSet, i, com.google.android.apps.youtube.music.R.style.Widget_MaterialComponents_Button, new int[]{com.google.android.apps.youtube.music.R.attr.materialSizeOverlay}), attributeSet, i);
        this.m = new LinkedHashSet();
        this.x = false;
        this.y = false;
        this.B = Integer.MIN_VALUE;
        this.f = -2.1474836E9f;
        this.C = Integer.MIN_VALUE;
        this.D = Integer.MIN_VALUE;
        this.j = Integer.MIN_VALUE;
        Context context2 = getContext();
        TypedArray typedArrayA = aeym.a(context2, attributeSet, aewh.a, i, com.google.android.apps.youtube.music.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.e = typedArrayA.getDimensionPixelSize(13, 0);
        this.n = a.l(typedArrayA.getInt(16, -1), PorterDuff.Mode.SRC_IN);
        this.o = afba.f(getContext(), typedArrayA, 15);
        this.c = afba.g(getContext(), typedArrayA, 11);
        this.z = typedArrayA.getInteger(12, 1);
        this.d = typedArrayA.getDimensionPixelSize(14, 0);
        this.p = a.l(typedArrayA.getInt(22, -1), PorterDuff.Mode.SRC_IN);
        this.q = typedArrayA.hasValue(21) ? afba.f(getContext(), typedArrayA, 21) : this.o;
        this.A = typedArrayA.getInteger(20, 3);
        Drawable drawableG = afba.g(getContext(), typedArrayA, 19);
        this.r = drawableG;
        this.s = drawableG == null;
        int resourceId = typedArrayA.getResourceId(23, 0);
        afbj afbjVarF = (resourceId == 0 || !Objects.equals(context2.getResources().getResourceTypeName(resourceId), "xml")) ? null : new acb(context2, resourceId).f();
        afbjVarF = afbjVarF == null ? new afbk(afbk.j(context2, attributeSet, i, com.google.android.apps.youtube.music.R.style.Widget_MaterialComponents_Button)) : afbjVarF;
        boolean z3 = typedArrayA.getBoolean(17, false);
        aewf aewfVar = new aewf(this, afbjVarF);
        this.b = aewfVar;
        aewfVar.d = typedArrayA.getDimensionPixelOffset(2, 0);
        aewfVar.e = typedArrayA.getDimensionPixelOffset(3, 0);
        aewfVar.f = typedArrayA.getDimensionPixelOffset(4, 0);
        aewfVar.g = typedArrayA.getDimensionPixelOffset(5, 0);
        if (typedArrayA.hasValue(9)) {
            int dimensionPixelSize = typedArrayA.getDimensionPixelSize(9, -1);
            aewfVar.h = dimensionPixelSize;
            aewfVar.c(aewfVar.b.c(dimensionPixelSize));
        }
        aewfVar.i = typedArrayA.getDimensionPixelSize(26, 0);
        aewfVar.j = a.l(typedArrayA.getInt(8, -1), PorterDuff.Mode.SRC_IN);
        aewfVar.k = afba.f(aewfVar.a.getContext(), typedArrayA, 7);
        aewfVar.l = afba.f(aewfVar.a.getContext(), typedArrayA, 25);
        aewfVar.m = afba.f(aewfVar.a.getContext(), typedArrayA, 18);
        aewfVar.p = typedArrayA.getBoolean(6, false);
        aewfVar.s = typedArrayA.getDimensionPixelSize(10, 0);
        aewfVar.q = typedArrayA.getBoolean(27, true);
        int paddingStart = aewfVar.a.getPaddingStart();
        int paddingTop = aewfVar.a.getPaddingTop();
        int paddingEnd = aewfVar.a.getPaddingEnd();
        int paddingBottom = aewfVar.a.getPaddingBottom();
        if (typedArrayA.hasValue(0)) {
            aewfVar.b();
            i2 = 1;
        } else {
            MaterialButton materialButton = aewfVar.a;
            i2 = 1;
            afbe afbeVar = new afbe(aewfVar.b);
            blg blgVar = aewfVar.c;
            if (blgVar != null) {
                afbeVar.o(blgVar);
            }
            avgj avgjVar = aewfVar.t;
            if (avgjVar != null) {
                afbeVar.k = avgjVar;
            }
            Context context3 = aewfVar.a.getContext();
            afbeVar.n(context3);
            afbeVar.setTintList(aewfVar.k);
            PorterDuff.Mode mode = aewfVar.j;
            if (mode != null) {
                afbeVar.setTintMode(mode);
            }
            float f = aewfVar.i;
            ColorStateList colorStateList = aewfVar.l;
            afbeVar.w(f);
            afbeVar.u(colorStateList);
            afbe afbeVar2 = new afbe(aewfVar.b);
            blg blgVar2 = aewfVar.c;
            if (blgVar2 != null) {
                afbeVar2.o(blgVar2);
            }
            afbeVar2.setTint(0);
            afbeVar2.t(aewfVar.i, 0);
            aewfVar.n = new afbe(aewfVar.b);
            blg blgVar3 = aewfVar.c;
            if (blgVar3 != null) {
                ((afbe) aewfVar.n).o(blgVar3);
            }
            aewfVar.n.setTint(-1);
            aewfVar.r = new RippleDrawable(afas.b(aewfVar.m), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{afbeVar2, afbeVar}), aewfVar.d, aewfVar.f, aewfVar.e, aewfVar.g), aewfVar.n);
            FocusRingDrawable.b(context3, aewfVar.r, null);
            super.setBackgroundDrawable(aewfVar.r);
            afbe afbeVarA = aewfVar.a(false);
            if (afbeVarA != null) {
                afbeVarA.p(aewfVar.s);
                afbeVarA.setState(aewfVar.a.getDrawableState());
            }
            FocusRingDrawable focusRingDrawableA = FocusRingDrawable.a(aewfVar.a.getBackground());
            if (focusRingDrawableA != null) {
                focusRingDrawableA.c(afbeVarA);
            }
        }
        aewfVar.a.setPaddingRelative(paddingStart + aewfVar.d, paddingTop + aewfVar.f, paddingEnd + aewfVar.e, paddingBottom + aewfVar.g);
        q(typedArrayA.getBoolean(i2, false));
        if (afbjVarF instanceof afbw) {
            Context context4 = getContext();
            TypedValue typedValueT = afba.t(context4, com.google.android.apps.youtube.music.R.attr.motionSpringFastSpatial);
            TypedArray typedArrayObtainStyledAttributes = typedValueT == null ? context4.obtainStyledAttributes(null, aeyy.a, 0, com.google.android.apps.youtube.music.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context4.obtainStyledAttributes(typedValueT.resourceId, aeyy.a);
            blg blgVar4 = new blg();
            z2 = true;
            try {
                float f2 = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
                if (f2 == Float.MIN_VALUE) {
                    throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
                }
                z = false;
                float f3 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
                if (f3 == Float.MIN_VALUE) {
                    throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
                }
                blgVar4.e(f2);
                blgVar4.c(f3);
                typedArrayObtainStyledAttributes.recycle();
                aewfVar.c = blgVar4;
                if (aewfVar.b instanceof afbw) {
                    aewfVar.d();
                }
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z = false;
            z2 = true;
        }
        if (this.g != z3) {
            this.g = z3;
            if (z3) {
                bArr = null;
                aewfVar.e(new avgj(this, bArr));
            } else {
                bArr = null;
                aewfVar.e(null);
            }
            post(new aemk(this, 11, bArr));
        }
        typedArrayA.recycle();
        setCompoundDrawablePadding(this.e);
        g(this.c != null ? z2 : z);
        r(this.r != null ? z2 : z);
    }

    private final boolean A() {
        int i = this.A;
        return i == 1 || i == 2;
    }

    private final boolean B() {
        int i = this.A;
        return i == 16 || i == 32;
    }

    private final boolean C() {
        aewf aewfVar = this.b;
        return (aewfVar == null || aewfVar.o) ? false : true;
    }

    private final int k(int i, int i2) {
        int intrinsicWidth;
        int intrinsicWidth2;
        Drawable drawable = this.c;
        if (drawable != null) {
            intrinsicWidth = this.d;
            if (intrinsicWidth == 0) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth = 0;
        }
        Drawable drawable2 = this.r;
        if (drawable2 != null) {
            intrinsicWidth2 = this.d;
            if (intrinsicWidth2 == 0) {
                intrinsicWidth2 = drawable2.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth2 = 0;
        }
        int iM = (((((i - m()) - getPaddingEnd()) - intrinsicWidth) - intrinsicWidth2) - this.e) - getPaddingStart();
        if (p() == Layout.Alignment.ALIGN_CENTER) {
            iM /= 2;
        }
        return y() != (i2 == 4) ? -iM : iM;
    }

    private final int l(int i, int i2) {
        int iMin;
        if (getLineCount() > 1) {
            iMin = getLayout().getHeight();
        } else {
            TextPaint paint = getPaint();
            String string = getText().toString();
            if (getTransformationMethod() != null) {
                string = getTransformationMethod().getTransformation(string, this).toString();
            }
            Rect rect = new Rect();
            paint.getTextBounds(string, 0, string.length(), rect);
            iMin = Math.min(rect.height(), getLayout().getHeight());
        }
        return Math.max(0, (((((i - iMin) - getPaddingTop()) - i2) - this.e) - getPaddingBottom()) / 2);
    }

    private final int m() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private final Drawable n(int i) {
        if (i == 0) {
            Drawable drawable = this.r;
            if (drawable == null || !A()) {
                return null;
            }
            return drawable;
        }
        Drawable drawable2 = this.r;
        if (i != 1) {
            if (drawable2 == null || !z()) {
                return null;
            }
        } else if (drawable2 == null || !B()) {
            return null;
        }
        return drawable2;
    }

    private final Drawable o(int i) {
        Drawable drawable = this.c;
        if (i != 0) {
            if (drawable != null && v()) {
                return drawable;
            }
        } else if (drawable != null && w()) {
            return drawable;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
    
        if (r2 != 8388613) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return android.text.Layout.Alignment.ALIGN_NORMAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000e, code lost:
    
        if (r0 != 4) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.text.Layout.Alignment p() {
        /*
            r2 = this;
            int r0 = r2.getTextAlignment()
            r1 = 1
            if (r0 == r1) goto L11
            r2 = 6
            if (r0 == r2) goto L26
            r2 = 3
            if (r0 == r2) goto L26
            r2 = 4
            if (r0 == r2) goto L29
            goto L23
        L11:
            int r2 = r2.getGravity()
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r0
            if (r2 == r1) goto L29
            r0 = 5
            if (r2 == r0) goto L26
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r2 == r0) goto L26
        L23:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L2b
        L26:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L2b
        L29:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_CENTER
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.p():android.text.Layout$Alignment");
    }

    private final void q(boolean z) {
        if (!j() || this.x == z) {
            return;
        }
        this.x = z;
        refreshDrawableState();
        if (getParent() instanceof aewg) {
            throw null;
        }
        if (this.y) {
            return;
        }
        this.y = true;
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((aewb) it.next()).a();
        }
        this.y = false;
    }

    private final void r(boolean z) {
        Drawable drawable = this.r;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.r = drawableMutate;
            drawableMutate.setTintList(this.q);
            PorterDuff.Mode mode = this.p;
            if (mode != null) {
                this.r.setTintMode(mode);
            }
            int intrinsicWidth = this.d;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.r.getIntrinsicWidth();
            }
            int intrinsicHeight = this.d;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.r.getIntrinsicHeight();
            }
            Drawable drawable2 = this.r;
            int i = this.v;
            int i2 = this.w;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.r.setVisible(true, z);
        }
        Drawable drawable3 = this.r;
        if (drawable3 != null && this.c != null && t()) {
            throw new IllegalArgumentException("secondaryIconGravity cannot have the same alignment as iconGravity");
        }
        if (drawable3 == null) {
            if (this.s) {
                return;
            }
            if (this.c != null && t()) {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (A() && compoundDrawablesRelative[0] != this.r) || (z() && compoundDrawablesRelative[2] != this.r) || (B() && compoundDrawablesRelative[1] != this.r);
        if (z || z2) {
            if (A()) {
                setCompoundDrawablesRelative(this.r, o(1), o(2), null);
            } else if (z()) {
                setCompoundDrawablesRelative(o(0), o(1), this.r, null);
            } else if (B()) {
                setCompoundDrawablesRelative(o(0), this.r, o(2), null);
            }
        }
    }

    private final void s(int i, int i2) {
        if (this.r == null || getLayout() == null) {
            return;
        }
        if (A() || z()) {
            this.w = 0;
            if (u(this.A)) {
                this.v = 0;
                r(false);
                return;
            }
            int iK = k(i, this.A);
            if (this.v != iK) {
                this.v = iK;
                r(false);
                return;
            }
            return;
        }
        if (B()) {
            this.v = 0;
            if (this.A == 16) {
                this.w = 0;
                r(false);
                return;
            }
            int intrinsicHeight = this.d;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.r.getIntrinsicHeight();
            }
            int iL = l(i2, intrinsicHeight);
            if (this.w != iL) {
                this.w = iL;
                r(false);
            }
        }
    }

    private final boolean t() {
        if (w() && A()) {
            return true;
        }
        if (v() && z()) {
            return true;
        }
        return x() && B();
    }

    private final boolean u(int i) {
        Layout.Alignment alignmentP = p();
        if (i == 1 || i == 3) {
            return true;
        }
        if (i == 2) {
            if (alignmentP == Layout.Alignment.ALIGN_NORMAL) {
                return true;
            }
        } else if (i == 4 && alignmentP == Layout.Alignment.ALIGN_OPPOSITE) {
            return true;
        }
        return false;
    }

    private final boolean v() {
        int i = this.z;
        return i == 3 || i == 4;
    }

    private final boolean w() {
        int i = this.z;
        return i == 1 || i == 2;
    }

    private final boolean x() {
        int i = this.z;
        return i == 16 || i == 32;
    }

    private final boolean y() {
        return getLayoutDirection() == 1;
    }

    private final boolean z() {
        int i = this.A;
        return i == 3 || i == 4;
    }

    final String c() {
        return (true != j() ? Button.class : CompoundButton.class).getName();
    }

    @Override // defpackage.afbv
    public final void d(afbk afbkVar) {
        if (!C()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.b.c(afbkVar);
    }

    public final void e(ColorStateList colorStateList) {
        if (C()) {
            aewf aewfVar = this.b;
            if (aewfVar.k != colorStateList) {
                aewfVar.k = colorStateList;
                if (aewfVar.a(false) != null) {
                    aewfVar.a(false).setTintList(aewfVar.k);
                    return;
                }
                return;
            }
            return;
        }
        kf kfVar = this.a;
        if (kfVar != null) {
            if (kfVar.a == null) {
                kfVar.a = new oz();
            }
            oz ozVar = kfVar.a;
            ozVar.a = colorStateList;
            ozVar.d = true;
            kfVar.a();
        }
    }

    public final void f(PorterDuff.Mode mode) {
        if (C()) {
            aewf aewfVar = this.b;
            if (aewfVar.j != mode) {
                aewfVar.j = mode;
                if (aewfVar.a(false) == null || aewfVar.j == null) {
                    return;
                }
                aewfVar.a(false).setTintMode(aewfVar.j);
                return;
            }
            return;
        }
        kf kfVar = this.a;
        if (kfVar != null) {
            if (kfVar.a == null) {
                kfVar.a = new oz();
            }
            oz ozVar = kfVar.a;
            ozVar.b = mode;
            ozVar.c = true;
            kfVar.a();
        }
    }

    public final void g(boolean z) {
        Drawable drawable = this.c;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.c = drawableMutate;
            drawableMutate.setTintList(this.o);
            PorterDuff.Mode mode = this.n;
            if (mode != null) {
                this.c.setTintMode(mode);
            }
            int intrinsicWidth = this.d;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.c.getIntrinsicWidth();
            }
            int intrinsicHeight = this.d;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.c.getIntrinsicHeight();
            }
            Drawable drawable2 = this.c;
            int i = this.t;
            int i2 = this.u;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.c.setVisible(true, z);
        }
        Drawable drawable3 = this.c;
        if (drawable3 != null && this.r != null && t()) {
            throw new IllegalArgumentException("iconGravity cannot have the same alignment as secondaryIconGravity");
        }
        if (drawable3 == null && this.r != null && t()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (w() && compoundDrawablesRelative[0] != this.c) || (v() && compoundDrawablesRelative[2] != this.c) || (x() && compoundDrawablesRelative[1] != this.c);
        if (z || z2) {
            if (w()) {
                setCompoundDrawablesRelative(this.c, n(1), n(2), null);
            } else if (v()) {
                setCompoundDrawablesRelative(n(0), n(1), this.c, null);
            } else if (x()) {
                setCompoundDrawablesRelative(n(0), this.c, n(2), null);
            }
        }
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        oz ozVar;
        if (C()) {
            return this.b.k;
        }
        kf kfVar = this.a;
        if (kfVar == null || (ozVar = kfVar.a) == null) {
            return null;
        }
        return ozVar.a;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        oz ozVar;
        if (C()) {
            return this.b.j;
        }
        kf kfVar = this.a;
        if (kfVar == null || (ozVar = kfVar.a) == null) {
            return null;
        }
        return ozVar.b;
    }

    public final void h(int i, int i2) {
        if (this.c == null || getLayout() == null) {
            return;
        }
        if (w() || v()) {
            this.u = 0;
            if (u(this.z)) {
                this.t = 0;
                g(false);
                return;
            }
            int iK = k(i, this.z);
            if (this.t != iK) {
                this.t = iK;
                g(false);
                return;
            }
            return;
        }
        if (x()) {
            this.t = 0;
            if (this.z == 16) {
                this.u = 0;
                g(false);
                return;
            }
            int intrinsicHeight = this.d;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.c.getIntrinsicHeight();
            }
            int iL = l(i2, intrinsicHeight);
            if (this.u != iL) {
                this.u = iL;
                g(false);
            }
        }
    }

    public final void i() {
        boolean zY = y();
        int i = this.h;
        if (zY) {
            i = -i;
        }
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.f + 0.0f);
        }
        setPaddingRelative(this.C + i, getPaddingTop(), this.D - i, getPaddingBottom());
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.x;
    }

    public final boolean j() {
        aewf aewfVar = this.b;
        return aewfVar != null && aewfVar.p;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (C()) {
            afba.p(this, this.b.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (j()) {
            mergeDrawableStates(iArrOnCreateDrawableState, k);
        }
        if (this.x) {
            mergeDrawableStates(iArrOnCreateDrawableState, l);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // defpackage.kg, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(c());
        accessibilityEvent.setChecked(this.x);
    }

    @Override // defpackage.kg, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(c());
        accessibilityNodeInfo.setCheckable(j());
        accessibilityNodeInfo.setChecked(this.x);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.kg, android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        h(getMeasuredWidth(), getMeasuredHeight());
        s(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.B != i6) {
            this.B = i6;
            this.f = -2.1474836E9f;
        }
        if (this.f == -2.1474836E9f) {
            this.f = getMeasuredWidth();
            if (getParent() instanceof aewe) {
                throw null;
            }
        }
        boolean z2 = false;
        if (this.j == Integer.MIN_VALUE) {
            Drawable drawable = this.c;
            if (drawable == null) {
                i5 = 0;
            } else {
                int i7 = this.e;
                int intrinsicWidth = this.d;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = drawable.getIntrinsicWidth();
                }
                i5 = i7 + intrinsicWidth;
            }
            this.j = (getMeasuredWidth() - m()) - i5;
        }
        if (this.C == Integer.MIN_VALUE) {
            this.C = getPaddingStart();
        }
        if (this.D == Integer.MIN_VALUE) {
            this.D = getPaddingEnd();
        }
        if ((getParent() instanceof aewe) && ((aewe) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.i = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof aewd)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        aewd aewdVar = (aewd) parcelable;
        super.onRestoreInstanceState(aewdVar.d);
        q(aewdVar.a);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        aewd aewdVar = new aewd(super.onSaveInstanceState());
        aewdVar.a = this.x;
        return aewdVar;
    }

    @Override // defpackage.kg, android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        h(getMeasuredWidth(), getMeasuredHeight());
        s(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean z;
        if (isEnabled() && this.b.q) {
            toggle();
            z = true;
        } else {
            z = false;
        }
        boolean zPerformClick = super.performClick();
        if (z && !zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.c != null) {
            if (this.c.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (!C()) {
            super.setBackgroundColor(i);
            return;
        }
        aewf aewfVar = this.b;
        if (aewfVar.a(false) != null) {
            aewfVar.a(false).setTint(i);
        }
    }

    @Override // defpackage.kg, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (!C()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.b.b();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // defpackage.kg, android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? dl.d(getContext(), i) : null);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        e(colorStateList);
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        f(mode);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        q(z);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablePadding(int i) {
        if (getCompoundDrawablePadding() != i) {
            this.f = -2.1474836E9f;
        }
        super.setCompoundDrawablePadding(i);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        if (C()) {
            this.b.a(false).p(f);
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f = -2.1474836E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public final void setTextAlignment(int i) {
        super.setTextAlignment(i);
        h(getMeasuredWidth(), getMeasuredHeight());
        s(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // defpackage.kg, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        this.f = -2.1474836E9f;
        super.setTextAppearance(context, i);
    }

    @Override // defpackage.kg, android.widget.TextView
    public final void setTextSize(int i, float f) {
        this.f = -2.1474836E9f;
        super.setTextSize(i, f);
    }

    @Override // android.widget.TextView
    public final void setWidth(int i) {
        this.f = -2.1474836E9f;
        super.setWidth(i);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        q(!this.x);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.youtube.music.R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context) {
        this(context, null);
    }
}
